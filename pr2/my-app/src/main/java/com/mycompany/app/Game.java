package com.mycompany.app;

import java.util.Collection;

public class Game {

    private Collection<Hero> players;

    public Collection<Hero> getPlayers() {
        return players;
    }

    public void setPlayers(Collection<Hero> players) {
        this.players = players;
    }

    public void play() {
        for (Hero hero:players)
            System.out.println("Player " + hero.getName() + " is playing now.");
    }

}

