package com.dot.examinator.repository;

import com.dot.examinator.domain.UserAnswer;
import com.dot.examinator.domain.UserAnswerPK;
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
        System.out.println("starts");
        final List<UserAnswer> answersOfUserExam = userAnswerDaoJpa.getAnswersOfUserExam(12, 1);
//        answersOfUserExam.forEach(obj -> System.out.println("obj" + obj.));
        System.out.println("answersOfUserExam.size(): " + answersOfUserExam.size());
        System.out.println("*****");
    }

    @Test
    public void happy_saveAnswer() throws Exception {
        UserAnswer userAnswer = new UserAnswer();
        UserAnswerPK userAnswerPK = new UserAnswerPK(12, 12,1, 0);
        userAnswer.setUserAnswerPK(userAnswerPK);
        userAnswer.setAnswerEntered("4444");
        userAnswerDaoJpa.saveAnswer(userAnswer);
        System.out.println("*****");
//        final List answersOfUserExam = userAnswerDaoJpa.getAnswersOfUserExam(12, 12);
//        UserAnswer userAnswerExpected = (UserAnswer)answersOfUserExam.get(0);
//        assertEquals(userAnswer.getUserId(), userAnswerExpected.getUserId());
//        assertEquals(userAnswer.getExamId(), userAnswerExpected.getExamId());
//        assertEquals(userAnswer.getQuestionId(), userAnswerExpected.getQuestionId());
//        assertEquals(userAnswer.getAnswerEntered(), userAnswerExpected.getAnswerEntered());

        System.out.println("11111");
    }

}