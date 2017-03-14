package com.dot.examinator.controller;

import com.dot.examinator.repository.QuestionDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * Created by hamid on 12-Mar-17.
 */
public class TestController {

    @Autowired
    private QuestionDao questionDao;

    @PostMapping
    @RequestMapping("/test/upload")
    public void uploadExam(@RequestParam(name = "fileExt", defaultValue = "word") String fileExt) {
//        FileConsumer consumer = FileConsumerFactory.getInstance(fileExt);

    }
}
