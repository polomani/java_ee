package com.mycompany.app;

import javax.persistence.*;

/**
 * Created by Polomani on 12.03.2016.
 */
@Entity
@Table(name="ADDRESS")
public class Address {
    @Id
    @GeneratedValue
    private int id;

    @Column(name="full")
    private String full;

    public String getFull() {
        return full;
    }

    public void setFull(String full) {
        this.full = full;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
