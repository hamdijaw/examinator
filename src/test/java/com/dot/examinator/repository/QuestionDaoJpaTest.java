package com.dot.examinator.repository;

import com.dot.examinator.domain.Exam;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

import static org.junit.Assert.*;

@RunWith(SpringRunner.class)
@SpringBootTest
public class QuestionDaoJpaTest {

    @Autowired
    QuestionDaoJpa questionDaoJpa;

    @Test
    public void getAllQuestionsByExam() {
        String hql = "FROM Question as atcl ORDER BY atcl.examId";
        questionDaoJpa.getAllQuestionsByExam(5l);

    }

}