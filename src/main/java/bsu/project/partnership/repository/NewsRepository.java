package bsu.project.partnership.repository;

import bsu.project.partnership.model.News;
import bsu.project.partnership.model.Question;
import org.springframework.data.jpa.repository.JpaRepository;

public interface NewsRepository extends JpaRepository<News, Long> {
    News getByTitle(String title);
    void deleteByTitle(String title);
}
