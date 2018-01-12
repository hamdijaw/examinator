package com.dot.examinator.repository;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.ArrayList;
import java.util.List;

@SpringBootTest
@RunWith(SpringRunner.class)
public class StudentRepositoryTest {

    @Autowired
    private StudentRepository studentRepository;

    @Test
    public void happy_updateStudentWithSubjects() {
        List<Subject> subjects = new ArrayList<>();

        Student student = studentRepository.findOne(11L);
        Subject subject = new Subject("English");
        List<Subject> subjects1 = new ArrayList<>();
        subjects1.add(new Subject("Social Studies"));
        student.setSubjects(subjects1);
        System.out.println("111");
        studentRepository.save(student);
        System.out.println("222");
    }

    @Test
    public void happy_saveStudentWithSubjects() {
        List<Subject> subjects = new ArrayList<>();
        subjects.add(new Subject("Maths"));
        subjects.add(new Subject("Science"));
        Student student = new Student(25L,"Yadav", subjects);

        studentRepository.save(student);
    }
}
