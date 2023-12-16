package trials.league.Storage;

import trials.league.model.Admin;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class AdminStorage {

    List<Admin> admins = new ArrayList<>();
    Map<String, String> adminMap = new HashMap<>();

    public Admin isValidAdmin(String password, String email) {
        for (Map.Entry<String, String> stringStringEntry : adminMap.entrySet()) {
            if (stringStringEntry.getKey().equals(password) && stringStringEntry.getValue().equals(email)) {
                return getByEmail(email);
            }
        }
        return null;
    }

    public void add(Admin admin) {
        admins.add(admin);
        adminMap.put(admin.getPassword(), admin.getEmail());
    }

    public Admin getByEmail(String email) {
        for (Admin admin : admins) {
            if (admin.getEmail().equals(email)) {
                return admin;
            }
        }
        return null;
    }
}
