package bsu.project.partnership.service;

import bsu.project.partnership.model.News;
import bsu.project.partnership.model.Question;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.util.List;

public interface NewsService {

    List<News> getAll();
    News getByTitle(String title);
    News addNews(News news);
    News updateNews(News news);
    void delete(String title);
}
