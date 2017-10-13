package com.dot.examinator.repository;

import com.dot.examinator.domain.Exam;
import com.dot.examinator.domain.Question;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;
import java.util.List;

@Transactional
@Repository
public class QuestionDaoJpa {
    @PersistenceContext
    private EntityManager entityManager;

    public Question getArticleById(long questionId) {
        System.out.println("*********JPA called");
        return entityManager.find(Question.class, questionId);
    }
    @SuppressWarnings("unchecked")
    public List<Question> getAllQuestionsByExam(long examId) {
        System.out.println("*********JPA called");
        String hql = "FROM Question as atcl ORDER BY atcl.exam_id";
//        final List resultList = entityManager.createQuery(hql).getResultList();
        final List resultList = entityManager.createQuery("Select q from Question q where q.exam =" + examId).getResultList();
        return resultList;
    }
}
