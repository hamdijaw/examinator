package com.dot.examinator.repository;

import com.dot.examinator.domain.Question;
import com.dot.examinator.domain.UserAnswer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserAnswerRepository extends JpaRepository<UserAnswer, Long> {
}
