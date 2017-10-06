package com.dot.examinator.service;

import com.dot.examinator.domain.Answer;
import com.dot.examinator.domain.Exam;
import com.dot.examinator.domain.Question;
import org.apache.commons.lang3.StringUtils;
import org.apache.poi.hwpf.extractor.WordExtractor;
import org.apache.poi.xwpf.usermodel.XWPFDocument;
import org.apache.poi.xwpf.usermodel.XWPFParagraph;
import org.apache.poi.xwpf.usermodel.XWPFRun;
import org.apache.xmlbeans.XmlException;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.sql.Date;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * Created by hamid on 11-Mar-17.
 */
@Service
public class WordFileReader implements ExamFileReader {
    public static void main(String[] args) throws XmlException, Exception {
//        Exam exam = new WordFileReader().readFile();
        System.out.println("done");
    }
    public Map<String, Object> readFile(String file) throws Exception {
        fileWithPath = file;
        return readFile();
    }
    private static String fileWithPath = "D:\\Dot Projects\\Examinator\\code_base\\sample files\\QuestionsSimple.docx";
    @Override
    public Map<String, Object> readFile() throws Exception {
        Map<String, Object> map = new ConcurrentHashMap<>();
        WordExtractor extractor = null;
        File file = new File(fileWithPath);
        FileInputStream fis = null;
        Exam exam = new Exam();
//        exam.setCreatedDate(new java.util.Date());
        exam.setCreatedDate(new java.sql.Date(1505302188212L));
        Question question = new Question();
        Answer answer;
        List<String> errors = new ArrayList<>();
        boolean isExamNameSet =  false;
        Question currentQuestion = new Question();
        try {
//        fis = new FileInputStream(file.getAbsolutePath());
        ClassLoader classLoader = getClass().getClassLoader();
        File fileApache = new File(classLoader.getResource(fileWithPath).getFile());
        fis = new FileInputStream(fileApache.getAbsolutePath());
        XWPFDocument document = new XWPFDocument(fis);
//        XWPFNumbering xwpfNumbering = document.getNumbering();
        List<XWPFParagraph> paragraphs = document.getParagraphs();
        if (paragraphs == null || paragraphs.size() <= 0) {
            throw new Exception("File uploaded is either corrupt or empty");
        }
        if (!isExamNameSet) {
            isExamNameSet = true;//even if exam name is not specified, there's no need to keep trying it
            if (!setExamName(exam, paragraphs.get(0), errors)) {
                question = new Question(paragraphs.get(0).getText());
            } else {//set questions
                for (XWPFParagraph para : paragraphs) {
                    List<XWPFRun> runs = para.getRuns();
                    if (StringUtils.containsAny("1", para.getNumLevelText())) {
                        question = new Question(para.getText());
                        question.setExam(exam); //this may be unnecessary as exam has ref to questions
                        exam.getQuestions().add(question);
                        continue;
                    }
                    if (StringUtils.containsAny("2", para.getNumLevelText())) {
                        answer = new Answer(para.getText());
                        boolean isCorrect = false;
                        for (XWPFRun run : runs) {
                            System.out.println("run.isHighlighted(): " + run.isHighlighted());
                            if (run.isHighlighted()) {
                                isCorrect = true;
                            }
                        }
                        answer.setCorrect(isCorrect);
                        answer.setQuestion(question);
                        question.getAnswers().add(answer);
                }
            }

        }

        /*for (XWPFParagraph para : paragraphs) {
            List<XWPFRun> runs = para.getRuns();

            if (counter == 0) {
                if (para.getNumFmt() == null) {
                    exam.setName(para.getText());
                    counter++;
                    continue;
                } else {
                    throw new Exception("First line in uploaded file should be exam name nad should not conatain numbers," +
                            " currently this line is numbered: " + para.getText());
                }
            } else {
                if (para.getNumFmt() == null) {
                    throw new Exception("Questions and Answers both should be numbered");
                }
            }
            if (StringUtils.containsAny("1", para.getNumLevelText())) {
                question = new Question(para.getText());
                exam.getQuestions().add(question);
                counter++;
                continue;
            }
            if (StringUtils.containsAny("2", para.getNumLevelText())) {
                answer = new Answer(para.getText());
                boolean isCorrect = false;
                for (XWPFRun run : runs) {
                    System.out.println("run.isHighlighted(): " + run.isHighlighted());
                    if (run.isHighlighted()) {
                        isCorrect = true;
                    }
                }
                answer.setCorrect(isCorrect);
                question.getAnswers().add(answer);
                counter++;
                continue;
            }*/

//            counter++;

//            if (para.getNumFmt() != null) {
//                System.out.println("para.getNumFmt: " + para.getNumFmt());
//                System.out.println("para.getNumLevelText: " + para.getNumLevelText());
//                System.out.println("para.getNumID: " + para.getNumID().intValue());
//                System.out.println("para.getNumIlvl: " + para.getNumIlvl());
//            }
//            System.out.println("para.getText()" + para.getText());
//            System.out.println("para.getParagraphText()" + para.getParagraphText());
            System.out.println("**************");
//            if (para.get) {
//
//            }
        }
            fis.close();
        } catch (IOException e1) {
            e1.printStackTrace();
        } catch (Exception e1) {
            e1.printStackTrace();
        } finally {

        }
        map.put("exam", exam);
        map.put("errors", errors);

        return map;
    }

    @Override
    public Map<String, Object> readFile(File file) throws XmlException, Exception {
        Map<String, Object> map = new ConcurrentHashMap<>();
        WordExtractor extractor = null;
//        File file = new File(fileWithPath);
        FileInputStream fis = null;
        Exam exam = new Exam();
//        exam.setCreatedDate(new java.util.Date());
        exam.setCreatedDate(new java.sql.Date(1505302188212L));
        Question question = new Question();
        Answer answer;
        List<String> errors = new ArrayList<>();
        boolean isExamNameSet =  false;
        Question currentQuestion = new Question();
        try {
//        fis = new FileInputStream(file.getAbsolutePath());
//            ClassLoader classLoader = getClass().getClassLoader();
//            File fileApache = new File(classLoader.getResource(fileWithPath).getFile());
//            fis = new FileInputStream(fileApache.getAbsolutePath());
            fis = new FileInputStream(file);
            XWPFDocument document = new XWPFDocument(fis);
//        XWPFNumbering xwpfNumbering = document.getNumbering();
            List<XWPFParagraph> paragraphs = document.getParagraphs();
            if (paragraphs == null || paragraphs.size() <= 0) {
                throw new Exception("File uploaded is either corrupt or empty");
            }
            if (!isExamNameSet) {
                isExamNameSet = true;//even if exam name is not specified, there's no need to keep trying it
                if (!setExamName(exam, paragraphs.get(0), errors)) {
                    question = new Question(paragraphs.get(0).getText());
                } else {//set questions
                    for (XWPFParagraph para : paragraphs) {
                        List<XWPFRun> runs = para.getRuns();
                        if (StringUtils.containsAny("1", para.getNumLevelText())) {
                            question = new Question(para.getText());
                            question.setExam(exam); //this may be unnecessary as exam has ref to questions
                            exam.getQuestions().add(question);
                            continue;
                        }
                        if (StringUtils.containsAny("2", para.getNumLevelText())) {
                            answer = new Answer(para.getText());
                            boolean isCorrect = false;
                            for (XWPFRun run : runs) {
                                System.out.println("run.isHighlighted(): " + run.isHighlighted());
                                if (run.isHighlighted()) {
                                    isCorrect = true;
                                }
                            }
                            answer.setCorrect(isCorrect);
                            answer.setQuestion(question);
                            question.getAnswers().add(answer);
                        }
                    }

                }

        /*for (XWPFParagraph para : paragraphs) {
            List<XWPFRun> runs = para.getRuns();

            if (counter == 0) {
                if (para.getNumFmt() == null) {
                    exam.setName(para.getText());
                    counter++;
                    continue;
                } else {
                    throw new Exception("First line in uploaded file should be exam name nad should not conatain numbers," +
                            " currently this line is numbered: " + para.getText());
                }
            } else {
                if (para.getNumFmt() == null) {
                    throw new Exception("Questions and Answers both should be numbered");
                }
            }
            if (StringUtils.containsAny("1", para.getNumLevelText())) {
                question = new Question(para.getText());
                exam.getQuestions().add(question);
                counter++;
                continue;
            }
            if (StringUtils.containsAny("2", para.getNumLevelText())) {
                answer = new Answer(para.getText());
                boolean isCorrect = false;
                for (XWPFRun run : runs) {
                    System.out.println("run.isHighlighted(): " + run.isHighlighted());
                    if (run.isHighlighted()) {
                        isCorrect = true;
                    }
                }
                answer.setCorrect(isCorrect);
                question.getAnswers().add(answer);
                counter++;
                continue;
            }*/

//            counter++;

//            if (para.getNumFmt() != null) {
//                System.out.println("para.getNumFmt: " + para.getNumFmt());
//                System.out.println("para.getNumLevelText: " + para.getNumLevelText());
//                System.out.println("para.getNumID: " + para.getNumID().intValue());
//                System.out.println("para.getNumIlvl: " + para.getNumIlvl());
//            }
//            System.out.println("para.getText()" + para.getText());
//            System.out.println("para.getParagraphText()" + para.getParagraphText());
                System.out.println("**************");
//            if (para.get) {
//
//            }
            }
            fis.close();
        } catch (IOException e1) {
            e1.printStackTrace();
        } catch (Exception e1) {
            e1.printStackTrace();
        } finally {

        }
        map.put("exam", exam);
        map.put("errors", errors);

        return map;
    }

    private boolean setExamName(Exam exam, XWPFParagraph para, List<String> errors) throws Exception {

        if (para.getNumFmt() == null) {
            exam.setName(para.getText());
        } else {
            errors.add("First line in uploaded file should be exam name nad should not conatain numbers," +
                    " currently this line is numbered and will be considered as a question: " + para.getText());
            return false;
        }
        return true;
    }
}
