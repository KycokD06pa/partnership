package bsu.project.partnership.repository;

import bsu.project.partnership.model.Question;
import bsu.project.partnership.model.Voting;
import org.springframework.data.jpa.repository.JpaRepository;

public interface VotingRepository extends JpaRepository<Voting, Long> {
    Voting getByTitle(String title);
    void deleteByTitle(String title);
}
