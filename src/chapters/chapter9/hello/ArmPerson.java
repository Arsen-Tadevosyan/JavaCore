package chapters.chapter9.hello;

public class ArmPerson implements SayHello ,SayGoodBy{



    @Override
    public String sayHello() {
        return "barev";
    }

    @Override
    public String sayGoodBy() {
        return "hajox";
    }
}
