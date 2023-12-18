package bsu.project.partnership.controller;

import bsu.project.partnership.model.Question;
import bsu.project.partnership.model.Voting;
import bsu.project.partnership.service.QuestionService;
import bsu.project.partnership.service.VotingService;
import lombok.AllArgsConstructor;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("bsu/v1/votings")
@AllArgsConstructor
@CrossOrigin
public class VotingController {

    private VotingService service;

    @GetMapping
    @PreAuthorize("hasAuthority('ADMIN')")
    public List<Voting> findAll(){

        return service.getAll();
    }

    @PostMapping("/save_voting")
    public String addVoting(@RequestBody Voting voting){
        service.addVoting(voting);
        return "fine";
    }

    @PostMapping("/agree/{title}")
    public String agree(@PathVariable String title){
        service.agree(title);
        return "fine";
    }
    @PostMapping("/disagree/{title}")
    public String disagree(@PathVariable String title){
        service.disagree(title);
        return "fine";
    }




    @GetMapping("/{title}")
    public Voting getByTitle(@PathVariable String title) {
        return service.getByTitle(title);
    }

    @PutMapping("/update_voting")
    public Voting updateVoting(@RequestBody Voting voting){
        return service.updateVoting(voting);
    }

    @DeleteMapping("/delete_voting/{title}")
    public void deleteQuestion(@PathVariable String title){
        service.delete(title);
    }


}
