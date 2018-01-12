package com.dot.examinator.repository;

import javax.annotation.Generated;
import javax.persistence.*;

@Entity
@Table(name = "subject")
public class Subject {

    public Subject() {
    }

    public Subject(String name) {
//        this.subjectId = subjectId;
        this.name = name;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "subject_id")
    private Integer subjectId;
    @Column(name = "name")
    private String name;
    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "student_id")
    private Student student;

    public Integer getSubjectId() {
        return subjectId;
    }

    public void setSubjectId(Integer subjectId) {
        this.subjectId = subjectId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
