package chapters.chapter14.collection;

import chapters.chapter12.Language;
import chapters.chapter12.User;

import java.util.HashMap;
import java.util.Map;

public class MapExample {
    public static void main(String[] args) {
        Map<String, User> myMap = new HashMap<>();
        myMap.put("poxos@mail.com", new User("poxos", "poxosyan", "poxos@mail.com", Language.RU));
        myMap.put("petros@mail.com", new User("petros", "poxosyan", "petros@mail.com", Language.HY));
        myMap.put("martiros@mail.com", new User("martiros", "poxosyan", "petros@mail.com", Language.HY));



//        for (String key : myMap.keySet()) {
//            System.out.println(key + "->" + myMap.get(key));
//        }
//        for (User value : myMap.values()) {
//            System.out.println(value);
//        }


    }
}
