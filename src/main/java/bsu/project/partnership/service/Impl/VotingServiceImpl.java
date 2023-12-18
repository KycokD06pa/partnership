package bsu.project.partnership.service.Impl;

import bsu.project.partnership.model.News;
import bsu.project.partnership.model.Voting;
import bsu.project.partnership.repository.VotingRepository;
import bsu.project.partnership.service.VotingService;
import jakarta.persistence.EntityManager;
import jakarta.transaction.Transactional;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.CrossOrigin;

import java.util.List;

@AllArgsConstructor
@Service

public class VotingServiceImpl implements VotingService {

    private final VotingRepository repository;
    private EntityManager entityManager;

    @Override
    public List<Voting> getAll() {
        return repository.findAll();
    }

    @Override
    public Voting getByTitle(String title) {
        return repository.getByTitle(title);
    }

    @Override
    public Voting addVoting(Voting voting) {
        return repository.save(voting);
    }

    @Override
    public Voting updateVoting(Voting voting) {
        return repository.save(voting);
    }

    @Override
    @Transactional
    public void delete(String title) {
        repository.deleteByTitle(title);
    }

    @Override
    @Transactional
    public void agree(String title1){
        Voting voting = getByTitle(title1);
        entityManager.createNativeQuery("UPDATE test.votings set agree = " +
                (voting.getAgree() + 1) + " where title like '" + voting.getTitle()+"'").executeUpdate();
    }

    @Override
    @Transactional
    public void disagree(String title1){
        Voting voting = getByTitle(title1);
        entityManager.createNativeQuery("UPDATE test.votings set disagree = " +
                (voting.getDisagree() + 1) + " where title like '" + voting.getTitle() + "'").executeUpdate();
    }

}
