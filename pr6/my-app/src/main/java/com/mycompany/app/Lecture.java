package com.mycompany.app;

import javax.persistence.*;

/**
 * Created by Polomani on 11.03.2016.
 */
@Entity
@Table(name="Lectures")
public class Lecture {
    @Id
    @GeneratedValue
    @Column(name = "ID")
    private int id;
    private String name;
    private double credits;
    @ManyToOne
    @JoinColumn(name="teacher_id", nullable = true)
    private Teacher teacher;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getCredits() {
        return credits;
    }

    public void setCredits(double credits) {
        this.credits = credits;
    }

    public Teacher getTeacher() {
        return teacher;
    }

    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
    }

    @Override
    public String toString() {
        return "Lecture{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", credits=" + credits +
                '}';
    }
}

