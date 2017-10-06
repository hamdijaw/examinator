package com.dot.examinator.service;

import com.dot.examinator.domain.Exam;
import com.dot.examinator.domain.Question;
import com.dot.examinator.repository.ExamRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ExamService {
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

}
