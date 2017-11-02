package com.dot.examinator.repository;

import com.dot.examinator.domain.Question;
import com.dot.examinator.domain.UserAnswer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;

@Repository
@Transactional
public interface UserAnswerRepository extends JpaRepository<UserAnswer, Long> {
}
