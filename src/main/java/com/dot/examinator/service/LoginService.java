package com.dot.examinator.service;

import com.dot.examinator.domain.User_Data;

public interface LoginService {
    User_Data login(String userId, String password);
}
