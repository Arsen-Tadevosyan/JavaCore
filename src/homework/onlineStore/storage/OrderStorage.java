package homework.onlineStore.storage;

import homework.onlineStore.model.Order;
import homework.onlineStore.model.User;
import homework.onlineStore.util.StorageSerializeUtil;

import java.io.Serializable;
import java.util.*;

public class OrderStorage implements Serializable {

    private List<Order> orders = new LinkedList<>();
    Map<String, Order> MapId = new HashMap<>();
    Map<User, Order> MapUser = new HashMap<>();

    public void add(Order order) {
        orders.add(order);
        MapId.put(order.getId(), order);
        MapUser.put(order.getUser(),order);
        StorageSerializeUtil.serializeOrderStorage(this);
    }

    public void print() {
        for (Order order : orders) {
            System.out.println(order);
        }
    }


    public Order getById(String id) {
        Order order = MapId.get(id);
        return order;
    }

    public void printByUser(User currentUser) {
        System.out.println(MapUser.get(currentUser));
    }
}
