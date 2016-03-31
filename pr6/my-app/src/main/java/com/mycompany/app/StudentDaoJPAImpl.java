package com.mycompany.app;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 * Created by Polomani on 11.03.2016.
 */
@Repository
public class StudentDaoJPAImpl implements StudentsDao{
    @PersistenceContext
    private EntityManager em;

    @Override
    public Student saveStudent(Student student) {
        return em.merge(student);
    }

    @Override
    public Student getStudentById(int id) {
        return em.find(Student.class,id);
    }
}
