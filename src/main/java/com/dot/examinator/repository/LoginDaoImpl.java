package com.dot.examinator.repository;

import com.dot.examinator.domain.User_Data;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;

@Repository
@Transactional
public class LoginDaoImpl implements LoginDao {
    @Override
    public User_Data login(String userId, String password) {
        return null;
    }
}
