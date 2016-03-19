package com.mycompany.app;

import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * Created by Polomani on 11.03.2016.
 */

public class Worker {
    @Autowired
    LecturesDao lecturesDao;
    @Autowired
    TeachersDao teachersDao;
    @Autowired
    StudentsDao studentsDao;

    public Lecture saveLecture(Lecture lecture){
        lecture = lecturesDao.saveLecture(lecture);
        return lecture;
    }

    public Student saveStudent(Student student){
        student = studentsDao.saveStudent(student);
        return student;
    }

    public Teacher saveTeacher(Teacher teacher){
        teacher = teachersDao.saveTacher(teacher);
        return teacher;
    }

    public Teacher getTeacher(int id) {
        return teachersDao.getTeacherById(id);
    }

    public List<Teacher> getAllTeachers() {
        return teachersDao.getAllTeachers();
    }

    public Lecture getLecture(int id) {
        return lecturesDao.getLecture(id);
    }
}

