package com.mycompany.app;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.sql.Date;
import java.util.List;


/**
 * Created by Polomani on 29.01.2016.
 */
public class App{
    public static void main( String[] args ){
        ApplicationContext context = new ClassPathXmlApplicationContext("SpringBean.xml");
        WorkWithStudents worker = (WorkWithStudents) context.getBean("worker");
        Student testStudent = new Student("Vlad Valt", 5);
        worker.saveStudentToDb(testStudent);

        WorkWithTeacher workWithTeacher = (WorkWithTeacher) context.getBean("teachersWorker");
        Teacher teacher = new Teacher();
        teacher.setFirstname("Andrii");
        teacher.setLastname("Glybovets");
        teacher.setCellphone("+380675097865");
        teacher = workWithTeacher.addTeacher(teacher);
        teacher.setBirthDate(new Date(0));
        workWithTeacher.saveTacher(teacher);

        System.out.println("by id: " + workWithTeacher.getTeacherById(1));
        System.out.println("by id (cache): " + workWithTeacher.getTeacherById(1));
        System.out.println("all: " + workWithTeacher.getAll());
    }
}

