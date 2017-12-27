package com.dot.examinator.repository;

import com.dot.examinator.domain.User_Data;

public interface LoginDao {
    User_Data login(String userId, String password);
}
