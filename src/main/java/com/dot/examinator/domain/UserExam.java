package com.dot.examinator.domain;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;
import java.time.LocalDateTime;

@Entity
@Table(name = "user_exam")
public class UserExam {

    @EmbeddedId
    private UserExamId userExamId;

    @Column(name = "exam_date")
    private LocalDateTime examDate;
    @Column(name = "marks")
    private String marks;

    public UserExamId getUserExamId() {
        return userExamId;
    }

    public void setUserExamId(UserExamId userExamId) {
        this.userExamId = userExamId;
    }

    public LocalDateTime getExamDate() {
        return examDate;
    }

    public void setExamDate(LocalDateTime examDate) {
        this.examDate = examDate;
    }

    public String getMarks() {
        return marks;
    }

    public void setMarks(String marks) {
        this.marks = marks;
    }
}
