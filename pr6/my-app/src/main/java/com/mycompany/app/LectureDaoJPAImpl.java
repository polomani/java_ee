package com.mycompany.app;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.*;

/**
 * Created by Polomani on 11.03.2016.
 */
@Repository
@Transactional
public class LectureDaoJPAImpl implements LecturesDao{
    @PersistenceContext
    private EntityManager em;

    public Lecture addLecture(Lecture lecture) {
        em.persist(lecture);
        return lecture;
    }

    public Lecture getLecture(int id) {
        return em.find(Lecture.class,id);
    }

    public Lecture saveLecture(Lecture lecture) {
        return em.merge(lecture);
    }
}
