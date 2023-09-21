package MyPrograms;

public class userTest {
    public static void main(String[] args) {
        user us = new user("Arsen", "Tadevosyan", "programmer", 16, "100,000,000 $. ");
        System.out.println("անուն. " + us.name);
        System.out.println("ազգանուն. " + us.surename);
        System.out.println("մասնագիտություն․ " + us.profession);
        System.out.println("աշխատավարձ․ " + us.salary);
        System.out.println("տարիք. " + us.age);
        us.months(us.age);
        us.days(us.age);
    }
}
