package bsu.project.partnership.service;

import bsu.project.partnership.model.Question;
import bsu.project.partnership.model.Voting;

import java.util.List;

public interface VotingService {
    List<Voting> getAll();
    Voting getByTitle(String title);
    Voting addVoting(Voting voting);
    Voting updateVoting(Voting voting);
    void delete(String title);

    public void disagree(String title);
    public void agree(String title);
}
