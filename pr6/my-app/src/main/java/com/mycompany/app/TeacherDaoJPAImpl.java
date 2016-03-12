package com.mycompany.app;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 * Created by Polomani on 11.03.2016.
 */
@Repository
@Transactional
public class TeacherDaoJPAImpl implements TeachersDao{
    @PersistenceContext
    private EntityManager em;

    @Override
    public Teacher getTeacherById(int id) {
        return em.find(Teacher.class,id);
    }

    @Override
    public Teacher saveTacher(Teacher teacher) {
        return em.merge(teacher);
    }
}
