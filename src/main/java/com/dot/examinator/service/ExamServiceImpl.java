package com.dot.examinator.service;

import com.dot.examinator.domain.Exam;
import com.dot.examinator.repository.ExamDaoHibernate;
import com.dot.examinator.repository.ExamDaoJpa;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
//public class ExamServiceImpl implements ExamService {
public class ExamServiceImpl {

    @Autowired
    private ExamDaoHibernate examDaoHibernate;
    @Autowired
    private ExamDaoJpa examDaoJpa;

//    @Override
    public Exam getExam(long id) {

//        return examDaoHibernate.getExam(id);
        return examDaoJpa.getArticleById(id);
    }

//    @Override
    public List<Exam> getAllExam() {
        return examDaoHibernate.getAllExam();
    }
}
