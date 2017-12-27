package com.dot.examinator.repository;

import com.dot.examinator.domain.UserExam;
import com.dot.examinator.domain.UserExamId;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;

@Repository
@Transactional
public interface UserExamRepository extends JpaRepository<UserExam, UserExamId> {
//    @Query("SELECT p FROM UserExam p WHERE p.userId = (:userId)")
//    List<UserExam> getUserExamListByUserId(@Param("userId") String userId);
//    List<UserExam> getUserExamListByUserId(@Param("userExamId") String userExamId);
//    List<UserExam> findAllByUserId(long userId);
}
