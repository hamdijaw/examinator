package com.dot.examinator.controller;

import com.dot.examinator.domain.Exam;
import com.dot.examinator.repository.ExamDaoJpa;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController("user")
public class UserRS {

    @Autowired
    private ExamDaoJpa examDaoJpa;

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
}
