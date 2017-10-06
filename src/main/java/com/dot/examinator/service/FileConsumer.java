package com.dot.examinator.service;

import java.io.File;

/**
 * Created by hamid on 12-Mar-17.
 */
public interface FileConsumer {
    void consumeFile();
    void consumeFile(File file);
}
