package com.dot.examinator.repository;

import com.dot.examinator.domain.Exam;
import com.dot.examinator.domain.User;
import com.dot.examinator.domain.UserEntitlement;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;

@Repository
@Transactional
public interface LoginRepository extends JpaRepository<UserEntitlement, Long> {

    @Query("SELECT p FROM UserEntitlement p WHERE p.userId = (:userId) and p.password = (:password)")
    UserEntitlement loginUser(@Param("userId") String userId, @Param("password") String password);

}
