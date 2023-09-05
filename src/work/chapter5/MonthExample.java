package work.chapter5;

public class MonthExample {
    public static void main(String[] args) {
        int month = 8;
        String season;
        if (month == 12 || month == 1 || month == 2)
            season = "winter";
        else if (month == 3 || month == 4 || month == 5)
            season = "spring";
        else if (month == 6 || month == 7 || month == 8)
            season = "summer";
        else if (month == 9 || month == 10 || month == 11)
            season = "autun";
        else season = "bogus month";
        System.out.println(season);
        //2
        switch (month) {
            case 12:
            case 1:
            case 2:
                season = "winter";
                break;
            case 3:
            case 4:
            case 5:
                season = "string";
                break;
            case 6:
            case 7:
            case 8:
                season = "summer";
                break;
            case 9:
            case 10:
            case 11:
                season = "artun";
                break;
            default:
                season = "chka tpes ban";
                System.out.println(season);
        }
    }
}
