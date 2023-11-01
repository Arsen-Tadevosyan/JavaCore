package chapters.chapter12;

public class UserTest {

    public static void main(String[] args) {
        String lang = "Hy";
        Language language = Language.valueOf(lang.toUpperCase());

        User user = new User("poxos", "poxosyan", "poxos@gmail.com", language);
        User user1 = new User("petos", "poxosyan", "petros@gmail.com", Language.HY);

//        String lang =user.getLang().name();
//        System.out.println(lang);
        Language[] values = Language.values();

        for (Language value : values) {
            System.out.println(value + " " + value.getLanguageName() + " " + value.ordinal());
        }

    }
}
