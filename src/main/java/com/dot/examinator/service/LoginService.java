package com.dot.examinator.service;

import com.dot.examinator.domain.User;

public interface LoginService {
    User login(String userId, String password);
}
