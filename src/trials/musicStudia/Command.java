package trials.musicStudia;

public interface Command {

    String EXIT = "0";
    String ADD_AUTHOR = "1";
    String ADD_MUSIC = "2";
    String PRINT_ALL_AUTHORS = "3";
    String PRINT_ALL_MUSICS = "4";
    String SEARCH_MUSICS_BY_AUTHOR = "5";
    String SEARCH_MUSICS_BY_LENGUAGE = "6";
    String SEARCH_MUSICS_BY_ID = "7";
    String DELETE_MUSIC_BY_ID = "8";
    String DELETE_AUTHOR_BY_ID = "9";


    static void printCommands() {
        System.out.println("please input " + EXIT + " for EXIT");
        System.out.println("please input " + ADD_AUTHOR + " for ADD_AUTHOR");
        System.out.println("please input " + ADD_MUSIC + " for ADD_MUSIC");
        System.out.println("please input " + PRINT_ALL_AUTHORS + " for PRINT_ALL_AUTHORS");
        System.out.println("please input " + PRINT_ALL_MUSICS + " for PRINT_ALL_MUSICS");
        System.out.println("please input " + SEARCH_MUSICS_BY_AUTHOR + " for SEARCH_MUSICS_BY_AUTHOR");
        System.out.println("please input " + SEARCH_MUSICS_BY_LENGUAGE + " for SEARCH_MUSICS_BY_LENGUAGE");
        System.out.println("please input " + SEARCH_MUSICS_BY_ID + " for SEARCH_MUSICS_BY_ID");
        System.out.println("please input " + DELETE_MUSIC_BY_ID + " for DELETE_MUSIC_BY_ID");
        System.out.println("please input " + DELETE_AUTHOR_BY_ID + " for DELETE_AUTHOR_BY_ID");
    }
}
