package bsu.project.partnership.service.Impl;

import bsu.project.partnership.model.Question;
import bsu.project.partnership.repository.QuestionRepository;
import bsu.project.partnership.service.QuestionService;
import jakarta.transaction.Transactional;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.CrossOrigin;


import java.util.List;


@Service
@AllArgsConstructor

public class QuestionServiceImpl implements QuestionService {

    private final QuestionRepository repository;

    @Override
    public List<Question> getAll() {
        return repository.findAll();
    }

    @Override
    public List<Question> getByTitle(String title) {
        return repository.getByTitle(title);
    }

    @Override
    public Question addQuestion(Question question) {


        return repository.save(question);
    }




    @Override
    public Question updateQuestion(Question question) {
        return repository.save(question);
    }

    @Override
    @Transactional
    public void delete(String title) {
        repository.deleteByTitle(title);
    }
}
