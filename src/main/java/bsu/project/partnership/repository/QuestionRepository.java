package bsu.project.partnership.repository;

import bsu.project.partnership.model.Question;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface QuestionRepository extends JpaRepository<Question, Long> {
    List<Question> getByTitle(String title);
    void deleteByTitle(String title);
}
