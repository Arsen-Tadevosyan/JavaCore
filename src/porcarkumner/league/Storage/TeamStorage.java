package porcarkumner.league.Storage;

import porcarkumner.league.model.Team;

import java.util.ArrayList;
import java.util.List;

public class TeamStorage {
    private List<Team> teamList = new ArrayList<>();

    public void add(Team team){
        teamList.add(team);
    }

    public Team getByName(String teamName) {
        for (Team team : teamList) {
            if (team.getTeamName().equals(teamName)){
                return team;
            }
        }
       return null;
    }
    public Team getById(String name){
        for (Team team : teamList) {
            if (team.getTeamName().equals(name)){
                return team;
            }
        }
        return null;
    }
    public void print(){
        for (Team team : teamList) {
            System.out.println(team);
        }
    }
}
