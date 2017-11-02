package com.dot.examinator.service;

import com.dot.examinator.domain.Exam;
import com.dot.examinator.domain.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Set;

import static org.junit.Assert.*;

@RunWith(SpringRunner.class)
@SpringBootTest
public class LoginServiceImplTest {

    @Autowired
    LoginService loginService;

    @Test
    public void happy_fetchUserEntitlement() {
        System.out.println("111");
        final User user = loginService.login("18", "111");
        final Set<Exam> exams = user.getExams();
        final int size = exams.size();
        System.out.println("size: " + size);
        System.out.println("2222");
    }

}