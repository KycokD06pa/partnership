package bsu.project.partnership.service;

import bsu.project.partnership.model.Question;

import java.util.List;

public interface QuestionService {

    List<Question> getAll();
    List<Question> getByTitle(String title);
    Question addQuestion(Question question);
    Question updateQuestion(Question question);
    void delete(String title);

}
