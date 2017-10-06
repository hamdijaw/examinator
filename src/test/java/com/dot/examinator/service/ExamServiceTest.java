package com.dot.examinator.service;

import com.dot.examinator.domain.Answer;
import com.dot.examinator.domain.Exam;
import com.dot.examinator.domain.Question;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

import static org.junit.Assert.assertEquals;


@RunWith(SpringRunner.class)
@SpringBootTest
public class ExamServiceTest {

    @Autowired
    ExamService examService;

    @Test
    public void saveQuestionsAndAnswers() {
        Exam exam = new Exam("English-10");
        final Question question1 = new Question("Antonym of 'Good'", exam);
        final Question question2 = new Question("What is the meaning of 'Perseverance'", exam);
        Set answers = new HashSet<Answer>(){{
            add(new Answer("Bad", question1));
            add(new Answer("Continued Hard Work", question2));
        }};
        Set questions = new HashSet<Question>(){{
            add(question1);
            add(question2);
        }};

        exam.setQuestions(questions);
        examService.saveExam(exam);
    }

    @Test
    public void saveExamWithQuestionsAndAnswers() {
        Exam exam = new Exam("English-11");
        final Question question1 = new Question("Antonym of 'Good'", exam);
        final Question question2 = new Question("What is the meaning of 'Perseverance'", exam);
        Set answers1 = new HashSet<Answer>(){{
            add(new Answer("Bad", question1));
        }};
        question1.setAnswers(answers1);
        Set answers2 = new HashSet<Answer>(){{
            add(new Answer("Continued Hard Work", question2));
        }};
        question2.setAnswers(answers2);

        Set questions = new HashSet<Question>(){{
            add(question1);
            add(question2);
        }};

        exam.setQuestions(questions);
        examService.saveExam(exam);
    }

    @Test
    public void saveExamWithQuestions() {
        Exam exam = new Exam("Science-1-");
        Set questions = new HashSet<Question>(){{
            add(new Question("What are Newton's laws?", exam));
            add(new Question("What is acceleration in uniform velocity?", exam));
            add(new Question("How much is 'g'", exam));
        }};

        exam.setQuestions(questions);
        examService.saveExam(exam);
    }

    @Test
    public void fetchAllExam() {
        final List<Exam> exams = examService.fetchAll();
        exams.forEach(exam -> System.out.println("exam: " + exam.getId() + " : " + exam.getName()));
        System.out.println(exams);
    }

    @Test
    public void fetchOneExam() {
        final Exam exam = examService.fetchExam(5L);
        final long id = exam.getId();
        System.out.println(exam.getId());
        System.out.println(exam.getName());
        assertEquals(5L, id);
    }

}