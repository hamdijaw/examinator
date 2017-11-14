package com.dot.examinator.repository;

import com.dot.examinator.domain.UserAnswer;
import com.dot.examinator.domain.UserAnswerPK;
import com.dot.examinator.domain.UserEntitlement;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import javax.persistence.NamedNativeQuery;
import javax.transaction.Transactional;
import java.util.List;

@Repository
@Transactional
public interface UserAnswerRepositoryUserAnswerPK extends JpaRepository<UserAnswer, UserAnswerPK> {

    List<UserAnswer> getUserAnwerByUserAnswerPK(UserAnswerPK userAnswerPK);
    @Query("SELECT p FROM UserAnswer p WHERE p.userAnswerPK.userId = (:userId) and p.userAnswerPK.examId = (:examId)")
    List<UserAnswer> getUserAnwerByUserIdAndExamId(@Param("userId")long userId, @Param("examId") long examId);

}
