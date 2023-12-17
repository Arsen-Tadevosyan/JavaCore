package trials.banking.storage;

import trials.banking.model.User;


import java.util.HashMap;
import java.util.Map;


public class StorageUser {
    Map<String, User> userMap = new HashMap<>();

    public void print() {
        for (User value : userMap.values()) {
            System.out.println(value);
        }
    }

    public User getByPassword(String password) {
        User user = userMap.get(password);
        return user;
    }

    public User getByEmail(String email) {
        for (User value : userMap.values()) {
            if (value.getEmail().equals(email)) {
                return value;
            }
        }
        return null;
    }

    public void add(User user) {
        userMap.put(user.getPassword(), user);
    }
}
