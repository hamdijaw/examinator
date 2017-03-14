package com.dot.examinator.domain;

import javax.persistence.*;

/**
 * Created by hamid on 11-Mar-17.
 */
@Entity
@Table(name = "answer")
public class Answer {
    @Id
    @GeneratedValue
    private long id;
    private String body;
    private boolean isCorrect;
    @ManyToOne(cascade = CascadeType.ALL)
    private Question question;

    public Answer() {
    }

    public Answer(String body) {
        this.body = body;
    }



    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }

    public boolean isCorrect() {
        return isCorrect;
    }

    public void setCorrect(boolean correct) {
        isCorrect = correct;
    }

    public Question getQuestion() {
        return question;
    }

    public void setQuestion(Question question) {
        this.question = question;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Answer answer = (Answer) o;

        return body != null ? body.equals(answer.body) : answer.body == null;
    }

    @Override
    public int hashCode() {
        return body != null ? body.hashCode() : 0;
    }
}
