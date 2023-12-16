package trials.league;

import homework.onlineStore.util.IdGenerator;
import trials.league.Storage.AdminStorage;
import trials.league.Storage.PlayerStorage;
import trials.league.Storage.TeamStorage;
import trials.league.model.Admin;
import trials.league.model.Player;
import trials.league.model.Team;

import java.util.Scanner;

public class LeagueMain implements Commands {
    private static AdminStorage adminStorage = new AdminStorage();
    private static TeamStorage teamStorage = new TeamStorage();
    private static PlayerStorage playerStorage = new PlayerStorage();
    private static Scanner scanner = new Scanner(System.in);


    public static void main(String[] args) {
        boolean isRun = true;
        while (isRun) {
            Commands.printMainCommands();
            String command = scanner.nextLine();
            switch (command) {
                case EXIT:
                    isRun = false;
                    break;
                case LOGIN:
                    login();
                    break;
                case REGISTER:
                    register();
                    break;
                default:
                    System.out.println("Unknown Command!");
            }
        }
    }

    private static void login() {
        System.out.println("please input email");
        String email = scanner.nextLine();
        System.out.println("please input password");
        String password = scanner.nextLine();
        Admin adminFromStorge = adminStorage.isValidAdmin(password, email);
        if (adminFromStorge == null) {
            commandForAdmin();
        } else {
            System.out.println("email or password is false");
        }
    }

    private static void register() {
        System.out.println("please input email");
        String email = scanner.nextLine();
        System.out.println("please input password");
        String password = scanner.nextLine();
        Admin adminFromStorge = adminStorage.getByEmail(email);
        if (adminFromStorge != null) {
            Admin admin = new Admin(email, password);
            adminStorage.add(admin);
            System.out.println("registered");
        } else {
            System.out.println("there is such an admin");
        }
    }

    private static void commandForAdmin() {
        boolean isRun = true;
        while (isRun) {
            Commands.printCommandsByAdmin();
            String command = scanner.nextLine();
            switch (command) {
                case EXIT:
                    isRun = false;
                    break;
                case ADD_TEAM:
                    addTeam();
                    break;
                case ADD_PLAYER:
                    addPlayer();
                    break;
                case PRINT_TEAMS:
                    teamStorage.print();
                    break;
                case PRINT_PLAYERS:
                    playerStorage.print();
                    break;
                case CHANGE_PLAYER_TEAM:
                    changeTeamPlayer();
                    break;
                case CHANGE_PRESIDENT_TEAM:
                    changePresident();
                    break;
                case CHANGE_MANAGER_TEAM:
                    changeManager();
                    break;
            }
        }
    }

    private static void changeManager() {
        teamStorage.print();
        System.out.println("please chose new team");
        String Team = scanner.nextLine();
        Team team = teamStorage.getByName(Team);
        if (team != null) {
            System.out.println("please input new manager");
            String manager = scanner.nextLine();
            team.setManager(manager);
            System.out.println("manager changed");
        } else {
            System.out.println("there is no such team like this");
        }
    }

    private static void changePresident() {
        teamStorage.print();
        System.out.println("please chose new team");
        String Team = scanner.nextLine();
        Team team = teamStorage.getByName(Team);
        if (team != null) {
            System.out.println("please input new president");
            String president = scanner.nextLine();
            team.setPresident(president);
            System.out.println("president changed");
        } else {
            System.out.println("there is no such team like this");
        }
    }

    private static void changeTeamPlayer() {
        playerStorage.print();
        System.out.println("please choose id player");
        String id = scanner.nextLine();
        Player player = playerStorage.getById(id);
        if (player == null) {
            teamStorage.print();
            System.out.println("please chose new team");
            String newTeam = scanner.nextLine();
            Team byName = teamStorage.getByName(newTeam);
            if (byName != null) {
                player.setTeam(byName);
                System.out.println("team changed");
            } else {
                System.err.println("there is no such team");
            }
        } else {
            System.err.println("wrong id");
        }
    }


    private static void addPlayer() {
        System.out.println("please input TeamName");
        String teamName = scanner.nextLine();
        Team team = teamStorage.getByName(teamName);
        if (team == null) {
            System.err.println("there is no such team");
            return;
        }
        System.out.println("please input name player");
        String name = scanner.nextLine();
        System.out.println("please input surname");
        String surname = scanner.nextLine();
        System.out.println("please input age");
        int age = Integer.parseInt(scanner.nextLine());
        System.out.println("please input salary");
        double salary = Double.parseDouble(scanner.nextLine());
        System.out.println("please input position");
        String position = scanner.nextLine();
        Player player = new Player(team, IdGenerator.generateId()
                , name, surname, age, salary, position);
        playerStorage.add(player);
        System.out.println("registered");
    }

    private static void addTeam() {
        System.out.println("please input teamName");
        String teamName = scanner.nextLine();
        System.out.println("please input president");
        String president = scanner.nextLine();
        System.out.println("please input manager");
        String manager = scanner.nextLine();
        Team teamFromStorage = teamStorage.getByName(teamName);
        if (teamFromStorage == null) {
            Team team = new Team(IdGenerator.generateId(), teamName, president, manager);
            teamStorage.add(team);
            System.out.println("registered");
        } else {
            System.err.println("there is such an team");
        }
    }
}
