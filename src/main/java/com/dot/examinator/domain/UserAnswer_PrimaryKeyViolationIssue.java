package com.dot.examinator.domain;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDateTime;

@Entity
@Table(name = "user_answer")
@IdClass(UserAnswer_PrimaryKeyViolationIssue.class)
public class UserAnswer_PrimaryKeyViolationIssue implements Serializable {

    @Id
    @Column(name = "user_id")
    private long userId;
    @Id
    @Column(name = "exam_id")
    private long examId;
    @Id
    @Column(name = "question_id")
    private long questionId;
    @Id
    private int attempt;

    @Column(name = "entrydatetime")
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

    public int getAttempt() {
        return attempt;
    }

    public void setAttempt(int attempt) {
        this.attempt = attempt;
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

        UserAnswer_PrimaryKeyViolationIssue that = (UserAnswer_PrimaryKeyViolationIssue) o;

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
