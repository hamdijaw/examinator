package com.dot.examinator.controller;

import com.dot.examinator.service.FileConsumer;
import com.dot.examinator.service.FileConsumerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by hamid on 12-Mar-17.
 */
@RestController
@RequestMapping("/admin")
public class AdminController {

    private FileConsumer consumer;

    @Autowired
    public AdminController(FileConsumer consumer) {
        this.consumer = consumer;
    }

    @PostMapping
    @RequestMapping("/upload")
    public void uploadExam(@RequestParam(name = "fileExt", defaultValue = "word") String fileExt) {
//        FileConsumer consumer = FileConsumerFactory.getInstance(fileExt);
        consumer.consumeFile();
    }
}
