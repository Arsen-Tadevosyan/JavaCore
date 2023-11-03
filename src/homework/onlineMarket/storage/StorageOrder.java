package homework.onlineMarket.storage;

import homework.onlineMarket.model.Order;
import homework.onlineMarket.model.Product;

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
}
