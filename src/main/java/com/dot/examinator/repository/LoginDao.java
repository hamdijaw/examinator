package com.dot.examinator.repository;

import com.dot.examinator.domain.User;

public interface LoginDao {
    User login(String userId, String password);
}
