package com.mycompany.app;

        import com.googlecode.ehcache.annotations.Cacheable;
        import org.hibernate.Session;
        import org.hibernate.SessionFactory;
        import org.springframework.beans.factory.annotation.Autowired;
        import org.springframework.stereotype.Repository;

        import java.util.List;

@Repository
public class HibernateTeachersDao implements TeachersDao{
    @Autowired
    private SessionFactory sessionFactory;

    private Session currentSession(){
        return sessionFactory.getCurrentSession();
    }

    public void addTeacher(Teacher teacher) {
        currentSession().save(teacher);
    }


    @Cacheable(cacheName = "teachersCache")
    public Teacher getTeacherById(int id) {
        return (Teacher) currentSession().getNamedQuery(Teacher.FIND_BY_ID).setParameter("id", id).list().get(0);
    }

    @Override
    public List<Teacher> getAllTeachers() {
        return currentSession().getNamedQuery(Teacher.FIND_ALL).list();
    }

    public void saveTacher(Teacher teacher) {
        currentSession().update(teacher);
    }
}
