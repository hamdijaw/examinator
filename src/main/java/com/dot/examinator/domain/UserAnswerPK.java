package com.dot.examinator.domain;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.Id;
import java.io.Serializable;

@Embeddable
public class UserAnswerPK implements Serializable {
    /*@Id
    @Column(name = "user_id")*/
    private long userId;
    /*@Id
    @Column(name = "exam_id")*/
    private long examId;
    /*@Id
    @Column(name = "question_id")*/
    private long questionId;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        UserAnswerPK that = (UserAnswerPK) o;

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

    public long getUserId() {
        return userId;
    }

    public void setUserId(long userId) {
        this.userId = userId;
    }

    public long getExamId() {
        return examId;
    }

    public void setExamId(long examId) {
        this.examId = examId;
    }

    public long getQuestionId() {
        return questionId;
    }

    public void setQuestionId(long questionId) {
        this.questionId = questionId;
    }
}
