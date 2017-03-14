package com.dot.examinator.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * Created by hamid on 12-Mar-17.
 */
@Component
public class FileConsumerFactory {

    @Autowired
    static WordFileConsumer wordFileConsumer;

    public static FileConsumer getInstance(String fileTypeString) {
//        FileConsumer fileConsumer;
        switch(fileTypeString) {
            case "word" : return wordFileConsumer;
            default:
                return wordFileConsumer;
        }

//        return fileConsumer;
    }
}
