package com.dot.examinator.controller;

import com.dot.examinator.domain.Exam;
import com.dot.examinator.service.ExamService;
import com.dot.examinator.service.FileConsumer;
import com.dot.examinator.service.FileConsumerFactory;
import org.apache.commons.io.FileUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.io.File;
import java.io.IOException;
import java.util.List;

/**
 * Created by hamid on 12-Mar-17.
 */
@RestController
@RequestMapping("/admin")
public class AdminController {

    private FileConsumer consumer;
    @Autowired
    private ExamService examService;

    @Autowired
    public AdminController(FileConsumer consumer) {
        this.consumer = consumer;
    }

    @GetMapping("/exam/all") // //new annotation since 4.3
    public List<Exam> getAllExam() {
        Exam exam = new Exam();


        return examService.fetchAll();
    }

    @GetMapping("/exam/{examId}") // //new annotation since 4.3
    public Exam getExam(@PathVariable(name = "examId") long examId) {
        Exam exam = new Exam();


        return examService.fetchExam(examId);
    }

    @PostMapping("/exam") // //new annotation since 4.3
    public String singleFileUpload(@RequestParam("file") MultipartFile file,
                                   RedirectAttributes redirectAttributes) {
        System.out.println("Inside File upload");
        if (file.isEmpty()) {
            System.out.println("Inside Empty");
            redirectAttributes.addFlashAttribute("message", "Please select a file to upload");
//            return "redirect:uploadStatus";
            return "please upload file";
        }
        File convFile = new File( file.getOriginalFilename());
        try {
//            file.transferTo(convFile);
            FileUtils.writeByteArrayToFile(convFile, file.getBytes());
        } catch (IOException e) {
            e.printStackTrace();
        }

        consumer.consumeFile(convFile);
        System.out.println("End");
        return "file uploaded successfully";
    }

    @PostMapping
    @RequestMapping("/upload")
    public void uploadExam(@RequestParam(name = "fileExt", defaultValue = "word") String fileExt) {
//        FileConsumer consumer = FileConsumerFactory.getInstance(fileExt);
        consumer.consumeFile();
    }
}
