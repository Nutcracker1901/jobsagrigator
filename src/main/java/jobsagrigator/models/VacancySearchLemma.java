package jobsagrigator.models;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collation = "vacancysearchlemmas")
@Getter
@Setter
public class VacancySearchLemma {
    @Id
    private String id;
    @NotBlank
    @Size(max = 20)
    private String lemma;
    private int count = 0;

    public VacancySearchLemma(String id, String lemma) {
        this.id = id;
        this.lemma = lemma;
    }
}
