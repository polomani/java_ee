package com.mycompany.app;

import java.util.List;

/**
 * Created by Polomani on 25.02.2016.
 */
public interface TeachersDao {
    void addTeacher(Teacher teacher);
    Teacher getTeacherById(int id);
    List<Teacher> getAllTeachers();
    void saveTacher(Teacher teacher);
}
