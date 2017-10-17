package com.dot.examinator.domain;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "user_answer")
@IdClass(UserAnswer.class)
public class UserAnswer implements Serializable {

    /*@Embedded
    @Id
    private UserAnswerPK userAnswerPK;*/
    @Id
    @Column(name = "user_id")
    private long userId;
    @Id
    @Column(name = "exam_id")
    private long examId;
    @Id
    @Column(name = "question_id")
    private long questionId;

    @Column(name = "answer")
    private String answerEntered;

    public long getUserId() {
        return this.userId;
    }

    public void setUserId(long userId) {
        this.userId = (userId);
    }

    public long getExamId() {
        return this.examId;
    }

    public void setExamId(long examId) {
        this.examId = examId;
    }

    public long getQuestionId() {
        return this.questionId;
    }

    public void setQuestionId(long questionId) {
        this.questionId = questionId;
    }

    public String getAnswerEntered() {
        return answerEntered;
    }

    public void setAnswerEntered(String answerEntered) {
        this.answerEntered = answerEntered;
    }
}
