package porcarkumner.league.Storage;

import porcarkumner.league.model.Player;

import java.util.ArrayList;
import java.util.List;

public class PlayerStorage {
    List<Player> playerList = new ArrayList<>();

    public void add(Player player) {
        playerList.add(player);
    }

    public void print() {
        for (Player player : playerList) {
            System.out.println(player);
        }
    }

    public Player getById(String id) {
        for (Player player : playerList) {
            if (player.getId().equals(id)) {
                return player;
            }
        }
        return null;
    }
}
