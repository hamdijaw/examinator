package com.dot.examinator.service;

import com.dot.examinator.domain.Answer;
import com.dot.examinator.domain.Exam;
import com.dot.examinator.domain.Question;
import org.apache.commons.configuration.ConfigurationException;
import org.apache.commons.configuration.PropertiesConfiguration;
import org.apache.commons.io.FileUtils;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.io.*;
import java.net.URL;
import java.nio.charset.Charset;
import java.util.*;

import static org.junit.Assert.*;

/**
 * Created by hamid on 13-Mar-17.
 */
@SpringBootTest
@RunWith(SpringJUnit4ClassRunner.class)
public class WordFileReaderTest {

    @Autowired
    private WordFileReader reader;

    @Before
    public void setUp() throws Exception {

    }

    @After
    public void tearDown() throws Exception {

    }

    @Test
    public void test2Questions2Answers() {
        Map<String, Object> map = new HashMap<>();
        try {
            map = reader.readFile("sample-exams/exam-1.docx");
        } catch (Exception e) {
            e.printStackTrace();
        }
        Exam exam = (Exam)map.get("exam");
        List<String> errors = (List)map.get("errors");

        Answer answer1 = new Answer();
        Answer answer2 = new Answer();
        answer1.setBody("Red");
        answer2.setBody("Black");
        assertEquals("Test-1", exam.getName());
        assertEquals(2, exam.getQuestions().size());
        for (Question question : exam.getQuestions()) {
             {
                 List<String> answerBodyList = new ArrayList<>();

                 for (Answer answer : question.getAnswers()) {
                     answerBodyList.add(answer.getBody());
                 }
                if (question.getBody().equals("What is the colour of Apple?")) {
                    answer1.setBody("Red");
                    answer2.setBody("Black");
                    assertEquals(true, answerBodyList.contains("Red"));
                    assertEquals(true, answerBodyList.contains("Black"));
                }
                if (question.getBody().equals("Capital Of India?")) {
                    answer1.setBody("Mumbai");
                    answer2.setBody("New Delhi");

                    assertEquals(true, answerBodyList.contains("Mumbai"));
                    assertEquals(true, answerBodyList.contains("New Delhi"));
                }

            }


        }


    }

//    @Test
    public void testArraysList() {
        PropertiesConfiguration propConfig = null;

        try {
            propConfig = new PropertiesConfiguration("sample.txt");
        } catch (ConfigurationException e) {
            e.printStackTrace();
        }

        List<String> allowedStatusCodes = Arrays.asList("200, 204".split(","));
        for (String allowedStatusCode : allowedStatusCodes) {
            System.out.println("allowedStatusCode: " + allowedStatusCode);
        }
    }

    @Test
    public void readFile() {
        List<String> allowedStatusCodes = Arrays.asList("200, 204".split(","));
        ClassLoader classLoader = getClass().getClassLoader();
        File fileApache = new File(classLoader.getResource("sample-exams/test.txt").getFile());
        System.out.println("fileApache: " + fileApache.getAbsolutePath());
        try {
            String data = FileUtils.readFileToString(fileApache, Charset.defaultCharset());
            System.out.println("data: " + data);
        } catch (IOException e) {
            e.printStackTrace();
        }

        System.out.println("***start*****");
        File directoryDot = new File("./");
        System.out.println("directoryDot: " + directoryDot.getAbsolutePath());
        final File[] files = directoryDot.listFiles();
        Arrays.stream(files).forEach(a -> System.out.println("a: " + a));
        File directoryDoubleDot = new File("../../");
        System.out.println("directoryDoubleDot: " + directoryDoubleDot.getAbsolutePath());
        final File[] files2 = directoryDoubleDot.listFiles();
        Arrays.stream(files2).forEach(a -> System.out.println("a: " + a));
        File directoryRoot = new File("/");
        System.out.println("directoryRoot:" + directoryRoot.getAbsolutePath());
        System.out.println("***end*****");
        File file = new File("test.txt");
//        File file = new File("E:\\code_base\\explore\\per\\examinator\\target\\test-classes\\sample-exams\\test.txt");
        URL url = getClass().getResource("test.txt");
        file = new File("/test.txt");
        System.out.println(file.getAbsolutePath());
        BufferedReader br = null;
        FileReader fr = null;
        try {
            fr = new FileReader(file);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        br = new BufferedReader(fr);

        String sCurrentLine;

        try {
            while ((sCurrentLine = br.readLine()) != null) {
                System.out.println(sCurrentLine);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}