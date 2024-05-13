package com.example.demo.compare;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class PlayerSorter {
    public static void main(String[] args) {
        List<Player> footballTeam = new ArrayList<>();
        Player player1 = new Player(59, "John", 20);
        Player player2 = new Player(67, "Roger", 22);
        Player player3 = new Player(45, "Steven", 24);
        footballTeam.add(player1);
        footballTeam.add(player2);
        footballTeam.add(player3);

        System.out.println("Before Sorting : " + footballTeam);
        PlayerNameComparator playerNameComparator = new PlayerNameComparator();
       // Collections.sort(footballTeam,playerNameComparator);
        System.out.println("After Sorting : " + footballTeam);

        Comparator<Player> rankComparator = Comparator.comparingInt(Player::getRanking);

       // Collections.sort(footballTeam,rankComparator);
        Collections.sort(footballTeam, Comparator.comparing(Player::getName));
        for(Player player: footballTeam){
            System.out.println(player.getName());
        }
    }
}
