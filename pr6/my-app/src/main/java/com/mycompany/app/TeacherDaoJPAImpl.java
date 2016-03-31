package com.mycompany.app;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.googlecode.ehcache.annotations.Cacheable;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

/**
 * Created by Polomani on 11.03.2016.
 */
@Repository
public class TeacherDaoJPAImpl implements TeachersDao{
    @PersistenceContext
    private EntityManager em;

    @Override
    public Teacher saveTeacher(Teacher teacher) {
        return em.merge(teacher);
    }

    @Cacheable(cacheName = "teachersCache")
    public Teacher getTeacherById(int id) {
        return (Teacher) em.createNamedQuery(Teacher.FIND_BY_ID).setParameter("id", id).getResultList().get(0);
    }

    @Override
    public List<Teacher> getAllTeachers() {
        return em.createNamedQuery(Teacher.FIND_ALL).getResultList();
    }

}
