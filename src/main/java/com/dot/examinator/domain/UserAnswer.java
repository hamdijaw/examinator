package com.dot.examinator.domain;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDateTime;

@Entity
@Table(name = "user_answer")
public class UserAnswer implements Serializable {

    @EmbeddedId
    private UserAnswerPK userAnswerPK;

    @Column(name = "entrydatetime")
    private LocalDateTime entryDate;

    @Column(name = "answer")
    private String answerEntered;

    public UserAnswerPK getUserAnswerPK() {
        return userAnswerPK;
    }

    public void setUserAnswerPK(UserAnswerPK userAnswerPK) {
        this.userAnswerPK = userAnswerPK;
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

}
