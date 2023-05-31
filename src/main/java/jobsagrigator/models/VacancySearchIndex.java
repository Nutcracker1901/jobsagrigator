package jobsagrigator.models;

import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collation = "vacancysearchlemmas")
@Getter
@Setter
public class VacancySearchIndex {
    @Id
    private String id;
    private String lemmaId;
    private String vacancyId;
    private int count = 0;

    public VacancySearchIndex(String id, String lemmaId, String vacancyId) {
        this.id = id;
        this.lemmaId = lemmaId;
        this.vacancyId = vacancyId;
    }
}
