package com.dot.examinator.service;

import com.dot.examinator.domain.UserExam;
import com.dot.examinator.domain.UserExamId;

import java.util.List;

public interface UserExamService {

    List<UserExam> getUserAllExam(long userId);

    void saveUserExam(UserExam userExam);
}
