package bsu.project.partnership.model;


import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;

import java.time.LocalDate;

@Data
@NoArgsConstructor
@Entity
@Table(name = "news")
public class News {
    @Id
    @GeneratedValue
    private Long id;

    @NonNull
    private String title;
    private String description;
    private String text;
    private String image;
    private String type;
    private LocalDate date = LocalDate.now();


}
