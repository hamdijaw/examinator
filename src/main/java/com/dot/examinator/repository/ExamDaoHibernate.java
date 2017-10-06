package com.dot.examinator.repository;

import com.dot.examinator.domain.Exam;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import javax.transaction.Transactional;
import java.util.List;

/**
 * Created by hamid on 12-Mar-17.
 */

@Repository
public class ExamDaoHibernate {

    @Autowired
    SessionFactory sessionFactory;

    @Transactional
    public void save(Exam exam) {
        final Session currentSession = sessionFactory.getCurrentSession();
        currentSession.save(exam);
    }

    @Transactional
    public Exam getExam(long id) {
        final Session currentSession = sessionFactory.getCurrentSession();
        final Exam exam = currentSession.get(Exam.class, id);
        return exam;
    }

    @Transactional
    public List<Exam> getAllExam() {
        final Session currentSession = sessionFactory.getCurrentSession();
        final List<Exam> list = currentSession.createCriteria(Exam.class).list();
        return list;
    }

}
