package com.dot.examinator.repository;

import com.dot.examinator.domain.Exam;
import org.springframework.beans.factory.annotation.Autowired;
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
    @Autowired
    private ExamRepository examRepository;

    public void saveExam(Exam exam) {
        System.out.println("*********JPA called");
//        entityManager.persist(exam);
        examRepository.save(exam);
        System.out.println("******Exam saved successfully******");
    }
    @SuppressWarnings("unchecked")
    public List<Exam> getAllArticles() {
        String hql = "FROM Exam as atcl ORDER BY atcl.examId";
        return (List<Exam>) entityManager.createQuery(hql).getResultList();
    }

    public Exam getArticleById(long articleId) {
        System.out.println("*********JPA called");
        return entityManager.find(Exam.class, articleId);
    }
}
