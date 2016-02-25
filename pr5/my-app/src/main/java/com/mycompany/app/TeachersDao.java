package com.mycompany.app;

/**
 * Created by Polomani on 25.02.2016.
 */
public interface TeachersDao {
    void addTeacher(Teacher teacher);
    Teacher getTeacherById(int id);
    void saveTacher(Teacher teacher);
}
