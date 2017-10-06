package com.dot.examinator.domain;

import com.fasterxml.jackson.annotation.JsonBackReference;

import javax.persistence.*;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

//import java.sql.Date;

/**
 * Created by hamid on 11-Mar-17.
 */
@Entity
@Table(name = "exam")
public class Exam {

    public Exam() {
        this.questions = new HashSet<>();
    }

    public Exam(String name) {
        this.name = name;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "exam_id")
    private long id;
    private String name;
    @Transient
    @Column(name = "createdDate")
    private java.sql.Date createdDate;
//    private java.util.Date createdDate;
//    @OneToMany(cascade = CascadeType.ALL)
    @JsonBackReference
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "exam", fetch = FetchType.EAGER)
//    @JoinTable(name = "question", joinColumns = @JoinColumn(name = "exam_id"), inverseJoinColumns = @JoinColumn(name = "exam_ID"))
//    @JoinColumn(name = "exam_id")
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

//    public void setCreatedDate(Date createdDate) {
//        this.createdDate = createdDate;
//    }
    public void setCreatedDate(java.sql.Date createdDate) {
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
