package porcarkumner.league;

public interface Commands {
    String EXIT = "0";
    String LOGIN = "1";
    String REGISTER = "2";

    String ADD_TEAM = "1";
    String ADD_PLAYER = "2";
    String PRINT_TEAMS = "3";
    String PRINT_PLAYERS = "4";
    String CHANGE_PLAYER_TEAM = "5";
    String CHANGE_PRESIDENT_TEAM = "6";
    String CHANGE_MANAGER_TEAM = "7";

    static void printMainCommands() {
        System.out.println("Please input " + EXIT + " for EXIT");
        System.out.println("Please input " + LOGIN + " for  LOGIN");
        System.out.println("Please input " + REGISTER + " for REGISTER");
    }

    static void printCommandsByAdmin() {
        System.out.println("please input " + EXIT + " for EXIT");
        System.out.println("please input " + ADD_TEAM + " for ADD_TEAM");
        System.out.println("please input " + ADD_PLAYER + " for ADD_PLAYER");
        System.out.println("please input " + PRINT_TEAMS + " for PRINT_TEAMS");
        System.out.println("please input " + PRINT_PLAYERS + " for PRINT_PLAYERS");
        System.out.println("please input " + CHANGE_PLAYER_TEAM + " for CHANGE_PLAYER_TEAM");
        System.out.println("please input " + CHANGE_PRESIDENT_TEAM + " for CHANGE_PRESIDENT_TEAM");
        System.out.println("please input " + CHANGE_MANAGER_TEAM + " for CHANGE_MANAGER_TEAM");
    }
}
