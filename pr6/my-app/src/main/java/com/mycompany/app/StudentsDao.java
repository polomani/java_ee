package com.mycompany.app;

/**
 * Created by Polomani on 19.02.2016.
 */
public interface StudentsDao {
    Student saveStudent(Student student);
    public Student getStudentById(int id);
}
