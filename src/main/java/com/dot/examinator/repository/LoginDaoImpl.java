package com.dot.examinator.repository;

import com.dot.examinator.domain.User;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;

@Repository
@Transactional
public class LoginDaoImpl implements LoginDao {
    @Override
    public User login(String userId, String password) {
        return null;
    }
}
