package com.dot.examinator.repository;

import com.dot.examinator.domain.Exam;
import com.dot.examinator.domain.Question;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;

@Repository
@Transactional
public interface QuestionRepository extends JpaRepository<Question, Long> {
}
