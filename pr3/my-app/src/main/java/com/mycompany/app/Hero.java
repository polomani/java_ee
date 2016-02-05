package com.mycompany.app;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.xml.ws.RequestWrapper;

/**
 * Created by Polomani on 29.01.2016.
 */
@Component
public class Hero implements Player{

    private String name = "Ivan";

    public Hero (){}

    public Hero(String name) {
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

}
