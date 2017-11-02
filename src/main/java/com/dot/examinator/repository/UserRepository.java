package com.dot.examinator.repository;

import com.dot.examinator.domain.User;
import com.dot.examinator.domain.UserEntitlement;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;

@Repository
@Transactional
public interface UserRepository extends JpaRepository<User, Long> {
//    @Query("SELECT p, q FROM User p,  WHERE p.userId = (:userId)")
//    User loginUser(@Param("userId") String userId);
}
