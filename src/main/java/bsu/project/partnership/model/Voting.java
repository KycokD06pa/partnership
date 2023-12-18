package bsu.project.partnership.model;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;

import java.time.LocalDate;

@Data
@NoArgsConstructor
@Entity
@Table(name = "votings")

public class Voting {

    @Id
    @GeneratedValue
    private Long id;

    @NonNull
    private String title;
    private String text;
    private int agree = 0;
    private int disagree = 0;

    private LocalDate startDate = LocalDate.now();
    private LocalDate finishDate;
    private StatusOfVote status;
    private String image;

    public enum StatusOfVote{
        FINISHED, IN_PROGRESS;
    }
}
