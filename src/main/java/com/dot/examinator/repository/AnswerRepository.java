package com.dot.examinator.repository;

import com.dot.examinator.domain.Answer;
import com.dot.examinator.domain.Exam;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;
import java.util.List;

@Repository
@Transactional
public interface AnswerRepository extends JpaRepository<Answer, Long> {

    //TODO getting conflict of questions and answers mapping
//    @Query("select p from Answer p where p.question.id in :questions and p.isCorrect=1")
//    List<Answer> getAnswersForQuestions(@Param("questions")List<Long> questions);
}
