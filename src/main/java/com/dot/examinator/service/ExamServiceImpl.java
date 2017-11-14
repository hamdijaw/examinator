package com.dot.examinator.service;

import com.dot.examinator.domain.Exam;
import com.dot.examinator.domain.Question;
import com.dot.examinator.repository.ExamDaoHibernate;
import com.dot.examinator.repository.ExamDaoJpa;
import com.dot.examinator.repository.ExamRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
//public class ExamServiceImpl implements ExamService {
public class ExamServiceImpl implements ExamService {

    @Autowired
    private ExamDaoHibernate examDaoHibernate;
    @Autowired
    private ExamDaoJpa examDaoJpa;

    @Autowired
    private ExamRepository examRepository;

    public List<Exam> fetchAll() {
        final List<Exam> all = examRepository.findAll();
        return all;
    }

    public Exam fetchExam(Long examId) {
        final Exam one = examRepository.findOne(examId);
        return one;
    }

    public void saveExam(Exam exam) {
        examRepository.save(exam);
    }

    public void saveQuestion(Question question) {
//        examRepository.save(question);
    }

    @Override
    public void submitExam() {
        //0. fetch List<UserAnswer>
        //1. calculate user_exam marks
        //2. update user_exam with marks
        //


    }

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
