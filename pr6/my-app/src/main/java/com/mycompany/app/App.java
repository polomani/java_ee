package com.mycompany.app;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by Polomani on 29.01.2016.
 */
public class App{
    public static void main( String[] args ) {
        ApplicationContext context = new ClassPathXmlApplicationContext("SpringBean.xml");
        Worker worker = (Worker)context.getBean("worker");
        Teacher teacher = worker.getTeacher(1);
        Lecture lecture = worker.getLecture(1);
        lecture.setTeacher(teacher);
        teacher.setAddress(new Address(){{setFull("Kyiv");}});
        worker.saveLecture(lecture);
        worker.saveTeacher(teacher);

        System.out.println(worker.getAllTeachers());
        System.out.println(teacher);
        System.out.println("cached:" + worker.getTeacher(1));//for cache

    }
}


