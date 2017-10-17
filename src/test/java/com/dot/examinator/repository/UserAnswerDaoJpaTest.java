package com.dot.examinator.repository;

import com.dot.examinator.domain.UserAnswer;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

import static org.junit.Assert.*;

@RunWith(SpringRunner.class)
@SpringBootTest
public class UserAnswerDaoJpaTest {

    @Autowired
    UserAnswerDaoJpa userAnswerDaoJpa;

    @Test
    public void happy_getAnswersOfUserExam() throws Exception {
        final List answersOfUserExam = userAnswerDaoJpa.getAnswersOfUserExam(18, 1);
        System.out.println("*****");
    }

    @Test
    public void happy_saveAnswer() throws Exception {
        UserAnswer userAnswer = new UserAnswer();
        userAnswer.setExamId(12);
        userAnswer.setUserId(12);
        userAnswer.setQuestionId(1);
        userAnswer.setAnswerEntered("1111111");
        userAnswerDaoJpa.saveAnswer(userAnswer);
        System.out.println("*****");
        final List answersOfUserExam = userAnswerDaoJpa.getAnswersOfUserExam(12, 12);
        UserAnswer userAnswerExpected = (UserAnswer)answersOfUserExam.get(0);
        assertEquals(userAnswer.getUserId(), userAnswerExpected.getUserId());
        assertEquals(userAnswer.getExamId(), userAnswerExpected.getExamId());
        assertEquals(userAnswer.getQuestionId(), userAnswerExpected.getQuestionId());
        assertEquals(userAnswer.getAnswerEntered(), userAnswerExpected.getAnswerEntered());

        System.out.println("11111");
    }

}