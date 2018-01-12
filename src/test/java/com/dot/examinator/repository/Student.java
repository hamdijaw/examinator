package com.dot.examinator.repository;

import javax.persistence.*;

import java.util.List;

@Entity
@Table(name = "student")
public class Student {

    public Student() {
    }

    public Student(Long studentId, String name, List<Subject> subjects) {
        this.studentId = studentId;
        this.name = name;
        this.subjects = subjects;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "student_id", nullable = false, unique = true)
    private Long studentId;
    @Column(name = "name")
    private String name;
    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "student", orphanRemoval=true)
//    @JoinColumn(name = "student_id")
    private List<Subject> subjects;

    public Long  getStudentId() {
        return studentId;
    }

    public void setStudentId(Long studentId) {
        this.studentId = studentId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Subject> getSubjects() {
        return subjects;
    }

    public void setSubjects(List<Subject> subjects) {
        this.subjects = subjects;
    }
}
