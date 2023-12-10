package porcarkumner.league.model;

import java.util.Objects;

public class Team {
    private String id;
    private String teamName;
    private String president ;
    private String manager;

    public Team(String id, String teamName, String president, String manager) {
        this.id = id;
        this.teamName = teamName;
        this.president = president;
        this.manager = manager;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTeamName() {
        return teamName;
    }

    public void setTeamName(String teamName) {
        this.teamName = teamName;
    }

    public String getPresident() {
        return president;
    }

    public void setPresident(String president) {
        this.president = president;
    }

    public String getManager() {
        return manager;
    }

    public void setManager(String manager) {
        this.manager = manager;
    }

    @Override
    public String toString() {
        return "Team{" +
                "id='" + id + '\'' +
                ", teamName='" + teamName + '\'' +
                ", president='" + president + '\'' +
                ", manager='" + manager + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Team team = (Team) o;
        return Objects.equals(id, team.id) && Objects.equals(teamName, team.teamName) && Objects.equals(president, team.president)
                && Objects.equals(manager, team.manager);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, teamName, president, manager);
    }
}
