package com.dot.examinator.domain;

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
public class Exam2 {

    public Exam2() {

    }

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private String name;
//    private java.sql.Date createdDate;
@Column(name = "createdDate")
    private Date createdDate;

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

}
