package com.mycompany.app;

import java.util.List;

/**
 * Created by Polomani on 25.02.2016.
 */
public interface TeachersDao {
    Teacher getTeacherById(int id);
    Teacher saveTeacher(Teacher teacher);
    List<Teacher> getAllTeachers();
}
