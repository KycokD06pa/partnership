package bsu.project.partnership.controller;


import bsu.project.partnership.model.News;
import bsu.project.partnership.service.NewsService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("bsu/v1/news")
@AllArgsConstructor
@CrossOrigin
public class NewsController {

    private final NewsService service;


    @GetMapping
    public List<News> findAll(){

        return service.getAll();
    }

    @PostMapping("/save_news")
    public String addNews(@RequestBody News news) {
        service.addNews(news);
        return "fine";
    }

    @GetMapping("/{title}")
    public News getByTitle(@PathVariable String title) {


        return service.getByTitle(title);
    }

    @PutMapping("/update_news")
    public News updateNews(@RequestBody News news){
        return service.updateNews(news);
    }

    @DeleteMapping("/delete_question/{title}")
    public void deleteQuestion(@PathVariable String title){
        service.delete(title);
    }

}
