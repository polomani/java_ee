package com.mycompany.app;

import org.springframework.stereotype.Component;

/**
 * Created by Polomani on 29.01.2016.
 */
@Component
public class Enemy implements Player{

    private String name = "Zombie";

    public Enemy(){}

    public Enemy(String name) {
        this.name = name;
    }
    @Override
    public String getName() {
        return name;
    }
    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void play() {
        System.out.println("Enemy " + getName() + " is playing now.");
    }
}
