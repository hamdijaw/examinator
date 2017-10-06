package com.dot.examinator.domain;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;

import javax.persistence.*;
import java.util.Set;

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
//        this.answers = new HashSet<>();
    }

    public Question(String body, Exam exam) {
        this.body = body;
        this.exam = exam;
    }

/*    public Question(String body, Set<Answer> answers) {
        this.body = body;
        this.answers = answers;
    }*/

    @Id
    @GeneratedValue
    @Column(name = "question_id")
    private long id;
//    @Column(name = "name")
    private String body;
    @JsonManagedReference
    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "exam_id")
    private Exam exam;
    @JsonBackReference
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "question", fetch = FetchType.LAZY)
    private Set<Answer> answers;
    @Transient
    private String answerChoice;//should be List<String>
    @Transient
    private String correctAnswer;//should be List<String>
    @Transient
    @Column(name = "createdDate")
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
