package com.dot.examinator.service;

import com.dot.examinator.domain.Exam;
import org.apache.poi.hwpf.HWPFDocumentCore;
import org.apache.poi.hwpf.extractor.WordExtractor;
import org.apache.poi.hwpf.model.StyleSheet;
import org.apache.poi.xwpf.usermodel.*;
import org.apache.xmlbeans.XmlException;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.CTStyles;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.List;

/**
 * Created by hamid on 11-Mar-17.
 */
public class WordFileReaderCopy implements ExamFileReader {
    public static void main(String[] args) throws XmlException {
        new WordFileReaderCopy().readFile();
    }
//    private static final String fileWithPath = "D:\\Dot Projects\\Examinator\\code_base\\sample files\\test.docx";
//    private static final String fileWithPath = "D:\\Dot Projects\\Examinator\\code_base\\sample files\\Questions.docx";
    private static final String fileWithPath = "D:\\Dot Projects\\Examinator\\code_base\\sample files\\QuestionsSimple.docx";
    @Override
    public Exam readFile() throws XmlException {
//        File file = null;
        WordExtractor extractor = null;
        File file = new File(fileWithPath);
        FileInputStream fis = null;
        try {
            fis = new FileInputStream(file.getAbsolutePath());


        XWPFDocument document = new XWPFDocument(fis);

        XWPFNumbering xwpfNumbering = document.getNumbering();
        List<XWPFParagraph> paragraphs = document.getParagraphs();
            XWPFStyles styles = document.getStyles();
            CTStyles style1 = document.getStyle();

            System.out.println("document.getStyle(): " + document.getStyle());
            System.out.println("para.getStyleID(): " + document.getStyles());

        System.out.println("Total no of paragraph "+paragraphs.size());
        for (XWPFParagraph para : paragraphs) {
            List<XWPFRun> runs = para.getRuns();
            for (XWPFRun run : runs) {
                System.out.println("run.isHighlighted(): " + run.isHighlighted());
            }
                    System.out.println("para.getNumFmt: " + para.getNumFmt());
            System.out.println("para.getNumLevelText: " + para.getNumLevelText());
            System.out.println("para.getNumID: " + para.getNumID().intValue());
            System.out.println("para.getNumIlvl: " + para.getNumIlvl());
            System.out.println("para.getNumStartOverride: " + para.getNumStartOverride());
            System.out.println("para.getElementType(): " + para.getElementType());
            System.out.println("para.getParagraphText(): " + para.getParagraphText());
            System.out.println("para.getStyle(): " + para.getStyle());
            System.out.println("para.getStyleID(): " + para.getStyleID());
            System.out.println("styles.getStyle: " + styles.getStyle(para.getStyleID()));
            XWPFStyle style = styles.getStyle(para.getStyleID());
            StyleSheet styleSheet;
            HWPFDocumentCore core;
            System.out.println("para.getBody(): " + para.getBody());
            System.out.println("para.getPart(): " + para.getPart());
            System.out.println("para.getPartType(): " + para.getPartType());
            System.out.println("para.getPartType(): " + para.getPartType());
            System.out.println("xwpfNumbering.getNum: " + xwpfNumbering.getNum(para.getNumID()));
            XWPFNum num = xwpfNumbering.getNum(para.getNumID());
            System.out.println("num.getCTNum()" + num.getCTNum().getAbstractNumId().getVal().intValue());
            System.out.println("num.getNumbering()" + num.getNumbering());

            XWPFRun run1;
            XWPFFieldRun run2;

            System.out.println("para.getText()" + para.getText());
            System.out.println("**************");
        }

            fis.close();

        } catch (IOException e1) {
            e1.printStackTrace();
        }
        return null;
    }

    @Override
    public Object readFile(File file) throws XmlException, Exception {
        return null;
    }
}
