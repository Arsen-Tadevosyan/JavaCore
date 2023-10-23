package chapters.chapter9.hello;

public class IntefaceTest {
    public static void main(String[] args) {
        ArmPerson armPerson = new ArmPerson();
        EnglishPerson englishPerson = new EnglishPerson();
        RussianPerson russianPerson = new RussianPerson();


        printHelloAndGoodBy(armPerson);
        printHelloAndGoodBy(englishPerson);
        printHelloAndGoodBy(russianPerson);

    }

    static void printHelloAndGoodBy(SayHello sayHello) {
        System.out.println(sayHello.sayHello());
        if (sayHello instanceof SayGoodBy) {
            SayGoodBy sayGoodBy = (SayGoodBy) sayHello;
            System.out.println(sayGoodBy.sayGoodBy());

        }
    }
}
