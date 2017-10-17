package com.dot.examinator.controller;

import com.dot.examinator.domain.Exam;
import com.dot.examinator.domain.Question;
import com.dot.examinator.domain.UserAnswer;
import com.dot.examinator.repository.ExamDaoJpa;
import com.dot.examinator.repository.QuestionDaoJpa;
import com.dot.examinator.repository.UserAnswerDaoJpa;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin
@RestController
@RequestMapping("/user")
public class UserRS {

    @Autowired
    private ExamDaoJpa examDaoJpa;
    @Autowired
    private QuestionDaoJpa questionDaoJpa;
    @Autowired
    private UserAnswerDaoJpa userAnswerDaoJpa;

    @GetMapping(name = "/authenticate")
    public String authenticateUser() {
        System.out.println("*******************");

        return "Authenticated";
    }

    @GetMapping("/exam")
    public Exam getQuestions() {
        System.out.println("********EXAM***********");
        final Exam exam = examDaoJpa.getArticleById(5);
        return exam;
    }

    @GetMapping("/{examId}/questions")
    public List getAllQuestionsByExam(@PathVariable long examId) {
        System.out.println("********EXAM***********");
        final List<Question> allQuestionsByExam = questionDaoJpa.getAllQuestionsByExam(examId);
        return allQuestionsByExam;
    }

    @PostMapping("/answer")
    public boolean saveAnswer(@RequestBody UserAnswer userAnswer) {
        System.out.println("********EXAM***********");
        userAnswerDaoJpa.saveAnswer(userAnswer);
        return true;
    }



}
