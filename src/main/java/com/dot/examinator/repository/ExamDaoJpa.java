package com.dot.examinator.repository;

import com.dot.examinator.domain.Exam;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;
import java.util.List;

@Transactional
@Repository
public class ExamDaoJpa {
    @PersistenceContext
    private EntityManager entityManager;

    public Exam getArticleById(long articleId) {
        System.out.println("*********JPA called");
        return entityManager.find(Exam.class, articleId);
    }
    @SuppressWarnings("unchecked")
    public List<Exam> getAllArticles() {
        String hql = "FROM Exam as atcl ORDER BY atcl.examId";
        return (List<Exam>) entityManager.createQuery(hql).getResultList();
    }
}
