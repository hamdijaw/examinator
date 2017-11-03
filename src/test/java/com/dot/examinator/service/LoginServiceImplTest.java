package com.dot.examinator.service;

import com.dot.examinator.domain.Exam;
import com.dot.examinator.domain.User;
import org.hibernate.Hibernate;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Set;

import static org.junit.Assert.*;

@RunWith(SpringRunner.class)
@SpringBootTest
public class LoginServiceImplTest {

    @Autowired
    LoginService loginService;

    @Test
    public void happy_fetchUserEntitlement() {
        System.out.println("111");
        final User user = loginService.login("18", "111");
        // Currently Exam class has questions as Eager Load as throwing LazyInitializationException
        // So, try below line of code with Lazy load of questions in Exam class
        //Hibernate.initialize(user.getQuestions());
        final Set<Exam> exams = user.getExams();
        final int size = exams.size();

        exams.forEach(exam -> {
            // Hibernate.initialize() didn't work to resolve LazyInitializationException
//            Hibernate.initialize(exam.getQuestions());
            System.out.println("question size: " + exam.getQuestions().size());
        });
        System.out.println("size: " + size);
        System.out.println("2222");
    }

}