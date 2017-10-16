package com.dot.examinator.controller;

import com.dot.examinator.domain.Exam;
import com.dot.examinator.domain.Question;
import com.dot.examinator.repository.ExamDaoJpa;
import com.dot.examinator.repository.QuestionDaoJpa;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/user")
public class UserRS {

    @Autowired
    private ExamDaoJpa examDaoJpa;
    @Autowired
    private QuestionDaoJpa questionDaoJpa;

    @CrossOrigin
    @GetMapping(name = "/authenticate")
    public String authenticateUser() {
        System.out.println("*******************");

        return "Authenticated";
    }

    @CrossOrigin
    @GetMapping("/exam")
    public Exam getQuestions() {
        System.out.println("********EXAM***********");
        final Exam exam = examDaoJpa.getArticleById(5);
        return exam;
    }

    @CrossOrigin
    @GetMapping("/{examId}/questions")
    public List getAllQuestionsByExam(@PathVariable long examId) {
        System.out.println("********EXAM***********");
        final List<Question> allQuestionsByExam = questionDaoJpa.getAllQuestionsByExam(examId);
        return allQuestionsByExam;
    }


}
