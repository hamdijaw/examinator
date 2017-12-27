package com.dot.examinator.service;

import com.dot.examinator.domain.Answer;
import com.dot.examinator.domain.UserAnswer;
import com.dot.examinator.domain.UserAnswerPK;
import com.dot.examinator.domain.UserExam;
//import com.dot.examinator.repository.UserExamRepository;
import com.dot.examinator.repository.AnswerRepository;
import com.dot.examinator.repository.UserAnswerRepository;
import com.dot.examinator.repository.UserAnswerRepositoryUserAnswerPK;
import com.dot.examinator.repository.UserExamRepository;
import org.apache.commons.lang.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class UserExamServiceImpl implements UserExamService {
    @Autowired
    private UserExamRepository userExamRepository;
    @Autowired
    private UserAnswerRepositoryUserAnswerPK userAnswerRepositoryUserAnswerPK;
    @Autowired
    private AnswerRepository answerRepository;

    @Override
    public List<UserExam> getUserAllExam(long userId) {
//        final List<UserExam> userExamByUserId = userExamRepository.getUserExamListByUserId(userId);
//        final List<UserExam> userExamByUserId = userExamRepository.getUserExamListByUserId(userExamId.getUserId().toString());
        final List<UserExam> userAllExam = userExamRepository.findAll();
//        final List<UserExam> userExamByUserId = userExamRepository.getUserExamListByUserId(userExamId.getUserId().toString());
        return userAllExam;
    }

    @Override
    public void saveUserExam(UserExam userExam) {
        System.out.println("saveUserExam starts");
        userExamRepository.save(userExam);
        System.out.println("saveUserExam ends");
    }

    @Override
    public double submitExam(UserAnswer userAnswer2) {
        //0. fetch List<UserAnswer>
        // . fetch correct answers from answer table
        //1. calculate user_exam marks
        //2. update user_exam with marks
        //
        final UserAnswerPK userAnswerPK = userAnswer2.getUserAnswerPK();
        //fetch all the question ids belonging to this exam
        final List<UserAnswer> userAnswers = userAnswerRepositoryUserAnswerPK.getUserAnwerByUserIdAndExamId(userAnswerPK.getUserId(), userAnswerPK.getExamId());
        List<Long> questionIds = new ArrayList<>();
        Map<Long, String> userAnswerMap = new HashMap<>();
        for (UserAnswer userAnswer : userAnswers) {
            final long questionId = userAnswer.getUserAnswerPK().getQuestionId();
            if (questionId > 0) {
                questionIds.add(questionId);
                userAnswerMap.put(questionId, userAnswer.getAnswerEntered());
            }
        }
        // fetch correct answers of all the questionsIds fetched before
//        final List<Answer> answersForQuestions = answerRepository.getAnswersForQuestions(questionIds);
        int noOfCorrectAnswers = 0;
//        for (Answer answer : answersForQuestions)
        {
//            final String s = StringUtils.trim(userAnswerMap.get(answer.getQuestion().getId()));
//      //TODO: change the logic of correct answer
//     if (s.equalsIgnoreCase(StringUtils.trim(answer.getBody()))) {
//                noOfCorrectAnswers++;
//            }
        }
        //compare the correct answers fetched above with answers entered by user
//        for () {
//
//        }
        System.out.println("noOfCorrectAnswers: " + noOfCorrectAnswers);
        double v =  ((double)noOfCorrectAnswers / (double)questionIds.size());
        System.out.println("ends-class");
        return v * 100.0;
    }
}
