package com.mycompany.app;

/**
 * Created by Polomani on 11.03.2016.
 */
public interface LecturesDao {

    Lecture getLecture(int id);

    Lecture saveLecture(Lecture lecture);

}
