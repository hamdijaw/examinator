package com.dot.examinator.domain;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by hamid on 11-Mar-17.
 */
@Entity
@Table(name = "question")
public class Question2 {

    public Question2() {
    }

    public Question2(String body) {
        this.body = body;
    }

    public Question2(String body, List<Answer> answers) {
        this.body = body;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    @Column(name = "name")
    private String body;
    @ManyToOne(cascade = CascadeType.ALL)
    private Exam exam;
    private String answerChoice;//should be List<String>
    private String correctAnswer;//should be List<String>
    private java.sql.Date createdDate;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }

    public String getAnswerChoice() {
        return answerChoice;
    }

    public void setAnswerChoice(String answerChoice) {
        this.answerChoice = answerChoice;
    }

    public String getCorrectAnswer() {
        return correctAnswer;
    }

    public void setCorrectAnswer(String correctAnswer) {
        this.correctAnswer = correctAnswer;
    }

    public java.sql.Date getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(java.sql.Date createdDate) {
        this.createdDate = createdDate;
    }

    public Exam getExam() {
        return exam;
    }

    public void setExam(Exam exam) {
        this.exam = exam;
    }
}
