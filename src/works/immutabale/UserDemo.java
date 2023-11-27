package works.immutabale;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class UserDemo {
    public static void main(String[] args) {
        Map<User, Integer> userAttempt = new HashMap<>();

        List<String> langList = new ArrayList<>();
        langList.add("arm");
        langList.add("eng");
        User user = new User("poxos", "poxosyan", "poxos@gmail.com", "12345", langList);
        System.out.println(user);
        System.out.println(user.hashCode());


        userAttempt.put(user,1);
        langList.add("ru");

        user.getLanguageList().add("uk");
        System.out.println(userAttempt.get(user));
    }
}
