package com.dot.examinator.rest;

import com.dot.examinator.domain.User;
import com.dot.examinator.domain.UserEntitlement;
import com.dot.examinator.service.LoginService;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@CrossOrigin
@RestController
@RequestMapping("/login")
public class LoginRS {

    private static final Logger logger = LoggerFactory.getLogger(LoginRS.class);

    private LoginService loginService;

    @Autowired
    public LoginRS(LoginService loginService) {
        this.loginService = loginService;
    }

    @PostMapping("/{userId}")
    public User getExam(@PathVariable String userId, @RequestBody UserEntitlement userEntitlement) {
        System.out.println("********User***********");
        User user = loginService.login(userId, userEntitlement.getPassword());
        logger.info("User: " + user);
        return user;
    }

}
