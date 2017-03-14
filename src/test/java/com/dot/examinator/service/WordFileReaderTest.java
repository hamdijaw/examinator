package com.dot.examinator.service;

import com.dot.examinator.domain.Answer;
import com.dot.examinator.domain.Exam;
import com.dot.examinator.domain.Question;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static org.junit.Assert.*;

/**
 * Created by hamid on 13-Mar-17.
 */
@SpringBootTest
@RunWith(SpringJUnit4ClassRunner.class)
public class WordFileReaderTest {

    @Autowired
    private WordFileReader reader;

    @Test
    public void test2Questions2Answers() {
        Map<String, Object> map = new HashMap<>();
        try {
            map = reader.readFile("D:\\Dot Projects\\Examinator\\code_base\\sample files\\QuestionsTest1.docx");
        } catch (Exception e) {
            e.printStackTrace();
        }
        Exam exam = (Exam)map.get("exam");
        List<String> errors = (List)map.get("errors");

        Answer answer1 = new Answer();
        Answer answer2 = new Answer();
        answer1.setBody("Red");
        answer2.setBody("Black");
        assertEquals("Test-1", exam.getName());
        assertEquals(2, exam.getQuestions().size());
        for (Question question : exam.getQuestions()) {
             {
                 List<String> answerBodyList = new ArrayList<>();

                 for (Answer answer : question.getAnswers()) {
                     answerBodyList.add(answer.getBody());
                 }
                if (question.getBody().equals("What is the colour of Apple?")) {
                    answer1.setBody("Red");
                    answer2.setBody("Black");
                    assertEquals(true, answerBodyList.contains("Red"));
                    assertEquals(true, answerBodyList.contains("Black"));
                }
                if (question.getBody().equals("Capital Of India?")) {
                    answer1.setBody("Mumbai");
                    answer2.setBody("New Delhi");

                    assertEquals(true, answerBodyList.contains("Mumbai"));
                    assertEquals(true, answerBodyList.contains("New Delhi"));
                }

            }


        }


    }
    @Before
    public void setUp() throws Exception {

    }

    @After
    public void tearDown() throws Exception {

    }

}