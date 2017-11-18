package com.dot.examinator.service;

import com.dot.examinator.domain.*;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class UserExamServiceImplTest {
    @Autowired
    UserExamService userService;

    @Test
    public void happy_submitExam() {
        List<UserAnswer> userAnswers = new ArrayList<>();
        UserAnswerPK  userAnswerPK = new UserAnswerPK(18, 1, 1, 0);
        UserAnswer userAnswer = new UserAnswer();
        userAnswer.setUserAnswerPK(userAnswerPK);
        userAnswers.add(userAnswer);
        double v = userService.submitExam(userAnswers.get(0));
        System.out.println("v: " + v);
        System.out.println("ends-class");
    }

    @Test
    public void happy_saveUserAnswer() {
//        System.out.println("hello");
//        UserAnswer userAnswer = new UserAnswer();
//        UserExamId userExamId = new UserExamId(18l,3l, 1);
//        userExam.setUserExamId(userExamId);
//        userExam.setExamDate(LocalDateTime.now());
//        userExam.setMarks("73");
//
//        System.out.println("start save");
//        userService.saveUserExam(userExam);
//        System.out.println("end save");
    }

    @Test
    public void happy_getUserAllExam() {
        UserExamId userExamId = new UserExamId(18L, null, 1);
//        final List<UserExam> userExam = userService.getUserExam(userExamId);
        final List<UserExam> userExam = userService.getUserAllExam(18L);
        System.out.println("ends userService");
    }

    @Test
    public void happy_saveUserExam() {
        System.out.println("hello");
        UserExam userExam = new UserExam();
        UserExamId userExamId = new UserExamId(18l,3l, 1);
        userExam.setUserExamId(userExamId);
        userExam.setExamDate(LocalDateTime.now());
        userExam.setMarks("73");

        System.out.println("start save");
        userService.saveUserExam(userExam);
        System.out.println("end save");
    }
}