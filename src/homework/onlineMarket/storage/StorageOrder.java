package homework.onlineMarket.storage;

import homework.onlineMarket.model.Order;
import homework.onlineMarket.model.Product;
import homework.onlineMarket.model.User;

public class StorageOrder {
    private Order[] orders = new Order[10];
    private int size;

    public void add(Order order) {
        if (orders.length == size) {
            extend();
        }
        orders[size++] = order;
    }

    private void extend() {
        Order[] tmp = new Order[orders.length];
        System.arraycopy(orders, 0, tmp, 0, size);
        orders = tmp;
    }

    public void print() {
        for (int i = 0; i < size; i++) {
            System.out.println(orders[i]);
        }
    }

    public Order getById(String id) {
        for (int i = 0; i < size; i++) {
            if (orders[i].getId().equals(id)) {
                return orders[i];
            }
        }
        return null;
    }

    public void printByUser(User currentUser) {
        for (int i = 0; i < size; i++) {
            if (orders[i].getUser().equals(currentUser)) {
                System.out.println(orders[i]);
            }
        }
    }
    public void deleteOrdeerById(String Id) {
        int indexById = getIndexById(Id);
        if (indexById == -1) {
            System.out.println("order does not exists!");
            return;
        }
        for (int i = indexById; i < size; i++) {
            orders[i] = orders[i - 1];
        }
        size--;
    }
    private int getIndexById(String Id) {
        for (int i = 0; i < size; i++) {
            if (orders[i].getId().equals(Id)) {
                return i;
            }
        }
        return -1;
    }
}
