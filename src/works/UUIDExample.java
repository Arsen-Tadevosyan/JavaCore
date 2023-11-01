package works;

import java.util.UUID;

public class UUIDExample {

    public static void main(String[] args) {

        String uuid = UUID.randomUUID().toString();
        String[] uuids = uuid.split("-");
        String id = uuids[0];

        System.out.println(id);

    }
}
