package com.dot.examinator.repository;

import com.dot.examinator.domain.Exam;
import com.dot.examinator.domain.UserAnswer;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.transaction.Transactional;
import java.time.LocalDateTime;
import java.util.List;

@Transactional
@Repository
public class UserAnswerDaoJpa {
    @PersistenceContext
    private EntityManager entityManager;

    public void saveAnswer(UserAnswer userAnswer) {
        System.out.println("*********JPA called");
//        entityManager.persist(userAnswer);
        userAnswer.setEntryDate(LocalDateTime.now());
        entityManager.merge(userAnswer);

        System.out.println("******Answer saved successfully******");
    }

    public List<Exam> getAllArticles() {
        String hql = "FROM Exam as atcl ORDER BY atcl.examId";
        return (List<Exam>) entityManager.createQuery(hql).getResultList();
    }

    public List getAnswersOfUserExam(long userId, long examId) {
        System.out.println("*********JPA called");
        String hql = "FROM UserAnswer as ua where ua.userId=:userId";
        Query query = entityManager.createQuery(hql);
        query.setParameter("userId", userId);
        final List resultList = query.getResultList();
        return resultList;
//        return entityManager.find(Exam.class, articleId);
    }
}
