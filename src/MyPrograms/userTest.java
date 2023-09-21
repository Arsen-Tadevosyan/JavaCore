package MyPrograms;

public class userTest {
    public static void main(String[] args) {
        user us = new user("Arsen", "Tadevosyan", 16);
        System.out.println("անուն. " + us.name);
        System.out.println("ազգանուն. " + us.surename);
        System.out.println("տարիք. " + us.age);
        us.months(us.age);
        us.days(us.age);
    }
}
