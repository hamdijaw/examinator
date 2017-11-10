package com.dot.examinator.domain;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.Id;
import java.io.Serializable;

@Embeddable
public class UserAnswerPK implements Serializable {
    @Column(name = "user_id")
    private long userId;

    @Column(name = "exam_id")
    private long examId;

    @Column(name = "question_id")
    private long questionId;

    @Column(name = "attempt")
    private int attempt;

    public UserAnswerPK() {
    }

    public UserAnswerPK(long userId, long examId, long questionId, int attempt) {
        this.userId = userId;
        this.examId = examId;
        this.questionId = questionId;
        this.attempt = attempt;
    }

    public long getUserId() {
        return userId;
    }

    public long getExamId() {
        return examId;
    }

    public long getQuestionId() {
        return questionId;
    }

    public int getAttempt() {
        return attempt;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        UserAnswerPK that = (UserAnswerPK) o;

        if (userId != that.userId) return false;
        if (examId != that.examId) return false;
        if (questionId != that.questionId) return false;
        return attempt == that.attempt;
    }

    @Override
    public int hashCode() {
        int result = (int) (userId ^ (userId >>> 32));
        result = 31 * result + (int) (examId ^ (examId >>> 32));
        result = 31 * result + (int) (questionId ^ (questionId >>> 32));
        result = 31 * result + attempt;
        return result;
    }


}
