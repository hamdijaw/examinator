package com.dot.examinator.service;

import com.dot.examinator.domain.Exam;
import com.dot.examinator.domain.Question;
import com.dot.examinator.repository.ExamDao;
import com.dot.examinator.repository.ExamDaoHibernate;
import com.dot.examinator.repository.QuestionDao;
import org.apache.xmlbeans.impl.common.ConcurrentReaderHashMap;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.io.File;
import java.util.List;
import java.util.Map;


/**
 * Created by hamid on 12-Mar-17.
 */
@Service
public class WordFileConsumer implements FileConsumer {
    Logger logger = LoggerFactory.getLogger(this.getClass());
    private WordFileReader reader;
    private ExamDao examDao;
    @Autowired
    private QuestionDao questionDao;
    @Autowired
    private SessionFactory sessionFactory;
    @Autowired
    ExamDaoHibernate daoHibernate;


    public WordFileConsumer() {
    }

    @Autowired
    public WordFileConsumer(WordFileReader reader, ExamDao examDao) {
        this.reader = reader;
        this.examDao = examDao;
    }

    @Override
    public void consumeFile() {
        logger.info("consuming file");
        Map<String, Object> map = new ConcurrentReaderHashMap();
        Exam exam = null;
        List<String> errors;
        try {
            map = reader.readFile();
            exam = (Exam)map.get("exam");
            errors = (List)map.get("errors");
            //TODO persist in db
            for (Question question : exam.getQuestions()) {
//                question.setExam(exam);
//            questionDao.save(question);
            }
            examDao.save(exam);
        } catch (Exception e) {
            e.printStackTrace();
        }

        logger.info("consumed file");
    }

    @Override
    @Transactional
    public void consumeFile(File file) {
        logger.info("consuming file");
        Map<String, Object> map = new ConcurrentReaderHashMap();
        Exam exam = null;
        List<String> errors;
        try {
            map = reader.readFile(file);
            exam = (Exam)map.get("exam");
            errors = (List)map.get("errors");
            //TODO persist in db
            for (Question question : exam.getQuestions()) {
//                question.setExam(exam);
//            questionDao.save(question);
            }
//            examDao.save(exam);
            daoHibernate.save(exam);

        } catch (Exception e) {
            e.printStackTrace();
        }

        logger.info("consumed file");
    }
}
