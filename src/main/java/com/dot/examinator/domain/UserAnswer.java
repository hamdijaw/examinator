package com.dot.examinator.domain;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDateTime;

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

    @Column(name = "entryDate")
    private LocalDateTime entryDate;

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

    public LocalDateTime getEntryDate() {
        return entryDate;
    }

    public void setEntryDate(LocalDateTime entryDate) {
        this.entryDate = entryDate;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        UserAnswer that = (UserAnswer) o;

        if (userId != that.userId) return false;
        if (examId != that.examId) return false;
        return questionId == that.questionId;
    }

    @Override
    public int hashCode() {
        int result = (int) (userId ^ (userId >>> 32));
        result = 31 * result + (int) (examId ^ (examId >>> 32));
        result = 31 * result + (int) (questionId ^ (questionId >>> 32));
        return result;
    }
}
