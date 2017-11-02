package com.dot.examinator.domain;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;

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
//        this.questions = new HashSet<>();
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
//    @JsonBackReference
    @JsonManagedReference
    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
//    @JoinTable(name = "question", joinColumns = @JoinColumn(name = "exam_id"), inverseJoinColumns = @JoinColumn(name = "exam_ID"))
    @JoinColumn(name = "exam_id")
    private Set<Question> questions = new HashSet<>();;

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

    public void addQuestion(Question question) {
        questions.add(question);
    }
//
    public void setQuestions(Set<Question> questions) {
        this.questions = questions;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Exam exam = (Exam) o;

        return id == exam.id;
    }

    @Override
    public int hashCode() {
        return (int) (id ^ (id >>> 32));
    }
}
