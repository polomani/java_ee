package com.mycompany.app;

import org.springframework.beans.factory.annotation.Autowired;

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
        System.out.println(lecture);
        return lecture;
    }

    public Student saveStudent(Student student){
        student = studentsDao.saveStudent(student);
        System.out.println(student);
        return student;
    }

    public Teacher saveTeacher(Teacher teacher){
        teacher = teachersDao.saveTacher(teacher);
        System.out.println(teacher);
        return teacher;
    }

    public Teacher getTeacher(int id) {
        return teachersDao.getTeacherById(id);
    }

    public Lecture getLecture(int id) {
        return lecturesDao.getLecture(id);
    }
}

