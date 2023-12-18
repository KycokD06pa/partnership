package bsu.project.partnership.controller;

import bsu.project.partnership.model.Question;
import bsu.project.partnership.service.QuestionService;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;
import java.util.List;

@RestController
@RequestMapping("bsu/v1/questions")
@AllArgsConstructor
@CrossOrigin
public class QuestionController {

    private QuestionService service;

    @GetMapping
    public List<Question> findAll(){

           return service.getAll();
    }

    @PostMapping("/save_question")
    public String addQuestion(@RequestBody Question question){
        service.addQuestion(question);
        return "fine";
    }

    @GetMapping("/{title}")
    public List<Question> getByTitle(@PathVariable String title) {


        return service.getByTitle(title);
    }

    @PutMapping("/update_question")
    public Question updateQuestion(@RequestBody Question question){
        return service.updateQuestion(question);
    }

    @DeleteMapping("/delete_question/{title}")
    public void deleteQuestion(@PathVariable String title){
        service.delete(title);
    }

}
