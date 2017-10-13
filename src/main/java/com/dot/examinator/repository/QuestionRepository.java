package com.dot.examinator.repository;

import com.dot.examinator.domain.Exam;
import com.dot.examinator.domain.Question;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface QuestionRepository extends JpaRepository<Question, Long> {
}
