package com.dot.examinator.rest;

import com.dot.examinator.domain.Exam;
import com.dot.examinator.domain.Question;
import com.dot.examinator.domain.UserAnswer;
import com.dot.examinator.repository.ExamDaoJpa;
import com.dot.examinator.repository.QuestionDaoJpa;
import com.dot.examinator.repository.UserAnswerDaoJpa;
import com.dot.examinator.service.ExamService;
import com.dot.examinator.service.UserExamService;
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

    @Autowired
    private ExamService examService;
    @Autowired
    private UserExamService userExamService;

//    @GetMapping(name = "/authenticate")
//    public String authenticateUser() {
//        System.out.println("*******************");
//
//        return "Authenticated";
//    }

    @GetMapping("/exam")
    public Exam getQuestions() {
        System.out.println("********EXAM***********");
        final Exam exam = examDaoJpa.getArticleById(5);
        return exam;
    }

//    @GetMapping("/{examId}/questions")
//    public List getAllQuestionsByExam(@PathVariable long examId) {
//        System.out.println("********EXAM***********");
////        final List<Question> allQuestionsByExam = questionDaoJpa.getAllQuestionsByExam(examId);
////        return allQuestionsByExam;
//    }

    @PostMapping("/answer")
    public boolean saveAnswer(@RequestBody UserAnswer userAnswer) {
        System.out.println("********EXAM***********");
        userAnswerDaoJpa.saveAnswer(userAnswer);
        return true;
    }

    @PostMapping("/exams/submit")
    public double submitExam(@RequestBody UserAnswer userAnswer) {
        double v = userExamService.submitExam(userAnswer);
        return v;
    }



}
