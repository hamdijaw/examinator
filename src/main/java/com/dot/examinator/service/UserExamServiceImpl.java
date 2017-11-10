package com.dot.examinator.service;

import com.dot.examinator.domain.UserExam;
//import com.dot.examinator.repository.UserExamRepository;
import com.dot.examinator.repository.UserExamRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserExamServiceImpl implements UserExamService {
    @Autowired
    private UserExamRepository userExamRepository;

    @Override
    public List<UserExam> getUserAllExam(long userId) {
//        final List<UserExam> userExamByUserId = userExamRepository.getUserExamListByUserId(userId);
//        final List<UserExam> userExamByUserId = userExamRepository.getUserExamListByUserId(userExamId.getUserId().toString());
        final List<UserExam> userAllExam = userExamRepository.findAll();
//        final List<UserExam> userExamByUserId = userExamRepository.getUserExamListByUserId(userExamId.getUserId().toString());
        return userAllExam;
    }

    @Override
    public void saveUserExam(UserExam userExam) {
        System.out.println("saveUserExam starts");
        userExamRepository.save(userExam);
        System.out.println("saveUserExam ends");
    }
}
