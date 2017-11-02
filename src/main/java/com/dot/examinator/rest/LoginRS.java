package com.dot.examinator.rest;

import com.dot.examinator.domain.Exam;
import com.dot.examinator.domain.User;
import com.dot.examinator.domain.UserEntitlement;
import com.dot.examinator.repository.LoginRepository;
import com.dot.examinator.repository.UserRepository;
import com.dot.examinator.service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@CrossOrigin
@RestController
@RequestMapping("/login")
public class LoginRS {

    @Autowired
    private UserRepository userRepository;
    @Autowired
    private LoginService loginService;

    @PostMapping("/{userId}")
    public User getExam(@PathVariable String userId, @RequestBody UserEntitlement userEntitlement) {
        System.out.println("********User***********");
        User user = loginService.login(userId, userEntitlement.getPassword());
//        final User exam = loginRepository.findOne(Long.parseLong(userId));
        return user;
    }

    @PostMapping("/userId_2")
    public User getQuestions(@PathVariable String userId) {
        System.out.println("********User_2***********");
//        final User exam = userRepository.loginUser(userId);
//        return exam;
        return null;
    }
}
