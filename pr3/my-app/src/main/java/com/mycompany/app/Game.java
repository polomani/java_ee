package com.mycompany.app;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Collection;

@Component
public class Game {

    @Autowired
    private Collection<Player> players;

    public Collection<Player> getPlayers() {
        return players;
    }

    public void setPlayers(Collection<Player> players) {
        this.players = players;
    }

    public void play() {
        for (Player hero:players)
            System.out.println("Player " + hero.getName() + " is playing now.");
    }

}

