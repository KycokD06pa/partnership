package bsu.project.partnership.service.Impl;

import bsu.project.partnership.model.News;
import bsu.project.partnership.repository.NewsRepository;
import bsu.project.partnership.service.NewsService;
import jakarta.transaction.Transactional;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.util.List;


@AllArgsConstructor
@Service

public class NewsServiceImpl implements NewsService {

    private final NewsRepository repository;

    @Override
    public List<News> getAll() {
        return repository.findAll();
    }

    @Override
    public News getByTitle(String title) {
        return repository.getByTitle(title);
    }

    @Override
    public News addNews(News news) {
        return repository.save(news);
    }

    @Override
    public News updateNews(News news) {
        return repository.save(news);
    }

    @Override
    @Transactional
    public void delete(String title) {
        repository.deleteByTitle(title);
    }
}
