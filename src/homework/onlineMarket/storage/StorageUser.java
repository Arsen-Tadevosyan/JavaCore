package homework.onlineMarket.storage;

import homework.onlineMarket.enums.EnumForUser;
import homework.onlineMarket.model.Order;
import homework.onlineMarket.model.User;

public class StorageUser {
    private User[] users = new User[10];
    private int size;

    public void add(User user) {
        if (users.length == size) {
            extend();
        }
        users[size++] = user;
    }

    private void extend() {
        User[] tmp = new User[users.length];
        System.arraycopy(users, 0, tmp, 0, size);
        users = tmp;
    }

    public User getByEmail(String email) {
        for (int i = 0; i < size; i++) {
            if (users[i].getEmail().equals(email)) {
                return users[i];
            }
        }
        return null;
    }

    public void print() {
        for (int i = 0; i < size; i++) {
            System.out.println(users[i]);
        }
    }

    public User getByPassword(String password) {
        for (int i = 0; i < size; i++) {
            if (users[i].getPassword().equals(password)) {
                return users[i];
            }
        }
        return null;
    }

    public void printOnlyUsers() {
        for (int i = 0; i < size; i++) {
            if (users[i].getType().equals(EnumForUser.USER)) {
                System.out.println(users[i]);
            }
        }
    }
}