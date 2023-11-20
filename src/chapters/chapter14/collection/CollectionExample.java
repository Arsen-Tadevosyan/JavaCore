package chapters.chapter14.collection;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class CollectionExample {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>();
        names.add("poxos");
        names.add("poxos");
        names.add("martiros");
        System.out.println(uniqueNameCount(names));
    }

    public static int uniqueNameCount(List<String> names) {
        return new HashSet<>(names).size();
    }
}
