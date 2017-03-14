package com.dot.examinator.domain;

import org.hibernate.annotations.GeneratorType;

import javax.persistence.*;
import java.util.*;

/**
 * Created by hamid on 11-Mar-17.
 */
@Entity
@Table(name = "question")
public class Question {

    public Question() {
    }

    public Question(String body) {
        this.body = body;
        this.answers = new HashSet<>();
    }

    public Question(String body, Set<Answer> answers) {
        this.body = body;
        this.answers = answers;
    }

    @Id
    @GeneratedValue
    private long id;
//    @Column(name = "name")
    private String body;
    @ManyToOne(cascade = CascadeType.ALL)
    private Exam exam;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "question")
    private Set<Answer> answers;
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

    public Set<Answer> getAnswers() {
        return answers;
    }

    public void setAnswers(Set<Answer> answers) {
        this.answers = answers;
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
