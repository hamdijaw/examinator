package com.dot.examinator.service;

import com.dot.examinator.domain.Exam;
import com.dot.examinator.domain.Question;
import com.dot.examinator.repository.ExamRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


public interface ExamService {

    public List<Exam> fetchAll();

    public Exam fetchExam(Long examId);

    public void saveExam(Exam exam);

    public void saveQuestion(Question question);

    public void submitExam();

}
