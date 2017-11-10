package com.dot.examinator.domain;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import java.io.Serializable;

@Embeddable
public class UserExamId implements Serializable {

    @Column(name = "user_id")
    private Long userId;

    @Column(name = "exam_id")
    private Long examId;

    @Column
    private int attempt = 0;

    public UserExamId() {
    }

    public UserExamId(Long userId, Long examId, int attempt) {
        this.userId = userId;
        this.examId = examId;
        this.attempt = attempt;
    }

    public Long getUserId() {
        return userId;
    }

    public Long getExamId() {
        return examId;
    }

    public int getAttempt() {
        return attempt;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        UserExamId that = (UserExamId) o;

        if (attempt != that.attempt) return false;
        if (userId != null ? !userId.equals(that.userId) : that.userId != null) return false;
        return examId != null ? examId.equals(that.examId) : that.examId == null;
    }

    @Override
    public int hashCode() {
        int result = userId != null ? userId.hashCode() : 0;
        result = 31 * result + (examId != null ? examId.hashCode() : 0);
        result = 31 * result + attempt;
        return result;
    }
}
