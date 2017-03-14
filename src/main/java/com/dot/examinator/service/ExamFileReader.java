package com.dot.examinator.service;

import com.dot.examinator.domain.Exam;
import org.apache.xmlbeans.XmlException;

/**
 * Created by hamid on 11-Mar-17.
 */
public interface ExamFileReader {
    Object readFile() throws XmlException, Exception;
}
