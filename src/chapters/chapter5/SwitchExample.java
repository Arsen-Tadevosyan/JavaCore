package chapters.chapter5;

public class SwitchExample {

    public static void main(String[] args) {
        String lang = "ARM";

        switch (lang) {
            case "ARM":
                System.out.println("barev");
                break;
            case "RU":
                System.out.println("privet");
                break;
            case "ENG":
                System.out.println("hello");
                break;
            default:
                System.out.println("lenguage is not sopported");
        }
    }
}
