package trials.banking.storage;

import trials.banking.model.Admin;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class StorageAdmin {

    Map<String, Admin> adminMap = new HashMap<>();
    public Admin getByPassword(String password){
        Admin admin = adminMap.get(password);
        return admin;
    }

    public Admin getByEmail(String email) {
        for (Admin value : adminMap.values()) {
            if (value.getEmail().equals(email)) {
                return value;
            }
        }
        return null;
    }

    public void add(Admin admin) {
        adminMap.put(admin.getPassword(), admin);
    }

}
