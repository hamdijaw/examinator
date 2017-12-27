package com.dot.examinator.domain;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Entity
@Table(name = "user_data")
//@NamedQuery(name = "Person.findByName", query = "SELECT p FROM Person p WHERE LOWER(p.lastName) = LOWER(?1)")
public class User_Data {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "user_id")
    private long userId;
    private String name;

    //    @OneToMany(cascade = CascadeType.ALL)
//    @JoinColumn(name = "user_id")
    @ManyToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    @JoinTable(name = "user_exam", joinColumns = {@JoinColumn(name = "user_id")},
            inverseJoinColumns = {@JoinColumn(name = "exam_id")})
    private Set<Exam> exams = new HashSet<>();

    @Transient
    private List<UserExam> userExams = new ArrayList<>();

    public long getUserId() {
        return userId;
    }

    public void setUserId(long userId) {
        this.userId = userId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Set<Exam> getExams() {
        return exams;
    }

    public void setExams(Set<Exam> exams) {
        this.exams = exams;
    }

    public List<UserExam> getUserExams() {
        return userExams;
    }

    public void setUserExams(List<UserExam> userExams) {
        this.userExams = userExams;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        User_Data userData = (User_Data) o;

        return userId == userData.userId;
    }

    @Override
    public int hashCode() {
        return (int) (userId ^ (userId >>> 32));
    }
}
