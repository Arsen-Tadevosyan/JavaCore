package chapters.chapter5;

public class IfElseExample {

    public static void main(String[] args) {
        String lang = "ENG";
        if (lang.equals("ARM")) {
            System.out.println("barev");
        }else if(lang.equals("RU")){
            System.out.println("privet");
        } else if (lang.equals("ENG")) {
            System.out.println("hello");
        }else {
            System.out.println("lenguage is not supported");
        }
    }
}

