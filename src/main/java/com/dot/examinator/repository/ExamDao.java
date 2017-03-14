package com.dot.examinator.repository;

import com.dot.examinator.domain.Exam;
import org.springframework.data.repository.CrudRepository;

import javax.transaction.Transactional;

/**
 * Created by hamid on 12-Mar-17.
 */
@Transactional
public interface ExamDao extends CrudRepository<Exam, Long> {

}
