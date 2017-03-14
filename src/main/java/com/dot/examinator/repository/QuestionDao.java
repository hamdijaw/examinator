package com.dot.examinator.repository;

import com.dot.examinator.domain.Exam;
import com.dot.examinator.domain.Question;
import org.springframework.data.repository.CrudRepository;

import javax.transaction.Transactional;

/**
 * Created by hamid on 12-Mar-17.
 */
@Transactional
public interface QuestionDao extends CrudRepository<Question, Long> {

}
