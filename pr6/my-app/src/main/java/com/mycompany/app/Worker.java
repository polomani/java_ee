package com.mycompany.app;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.TransactionDefinition;
import org.springframework.transaction.TransactionStatus;
import org.springframework.transaction.support.DefaultTransactionDefinition;
import org.springframework.transaction.support.TransactionCallback;
import org.springframework.transaction.support.TransactionTemplate;

import javax.transaction.TransactionManager;
import java.util.List;

/**
 * Created by Polomani on 11.03.2016.
 */

public class Worker {
    @Autowired
    private PlatformTransactionManager txManager;
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

    public Teacher saveTeacher(final Teacher teacher){
        DefaultTransactionDefinition def = new DefaultTransactionDefinition();
        def.setName("teacherTransactions");
        def.setPropagationBehavior(TransactionDefinition.PROPAGATION_REQUIRED);

        TransactionStatus status = txManager.getTransaction(def);
        try {
            teachersDao.saveTeacher(teacher);
            txManager.commit(status);
        } catch (Exception e) {
            txManager.rollback(status);
        }
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

