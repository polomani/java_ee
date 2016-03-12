package com.mycompany.app;

/**
 * Created by Polomani on 25.02.2016.
 */
public interface TeachersDao {
    Teacher getTeacherById(int id);
    Teacher saveTacher(Teacher teacher);
}
