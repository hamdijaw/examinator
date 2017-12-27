package com.dot.examinator.service;

import com.dot.examinator.domain.User_Data;
import com.dot.examinator.domain.UserEntitlement;
import com.dot.examinator.domain.UserExam;
import com.dot.examinator.repository.LoginRepository;
import com.dot.examinator.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LoginServiceImpl implements LoginService {
    @Autowired
    private LoginRepository loginRepository;
    @Autowired
    private UserRepository userRepository;
    @Autowired
    UserExamService userService;

    @Override
    public User_Data login(String userId, String password) {
        final UserEntitlement one = loginRepository.loginUser(userId, password);
        if (null == one) {
            return null;
        }

        final User_Data userData = userRepository.findOne(Long.parseLong(userId));
        final List<UserExam> userAllExam = userService.getUserAllExam(Long.parseLong(userId));
        userData.setUserExams(userAllExam);

        return userData;
    }
}
