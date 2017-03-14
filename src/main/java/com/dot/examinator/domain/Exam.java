package com.dot.examinator.domain;

import javax.persistence.*;
//import java.sql.Date;
import java.util.*;

/**
 * Created by hamid on 11-Mar-17.
 */
@Entity
@Table(name = "exam")
public class Exam {

    public Exam() {
        this.questions = new HashSet<>();
    }

    @Id
    @GeneratedValue
    private long id;
    private String name;
//    private java.sql.Date createdDate;
    private java.util.Date createdDate;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "exam")
//    @JoinTable(name = "question", joinColumns = @JoinColumn(name = "exam_id"), inverseJoinColumns = @JoinColumn(name = "exam_ID"))
    private Set<Question> questions;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(Date createdDate) {
        this.createdDate = createdDate;
    }

    public Set<Question> getQuestions() {
        return questions;
    }
//
    public void setQuestions(Set<Question> questions) {
        this.questions = questions;
    }
}
