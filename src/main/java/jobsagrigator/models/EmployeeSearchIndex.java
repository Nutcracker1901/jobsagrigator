package jobsagrigator.models;

import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collation = "employeesearchlemmas")
@Getter
@Setter
public class EmployeeSearchIndex {
    @Id
    private String id;
    private String lemmaId;
    private String userId;
    private int count = 0;

    public EmployeeSearchIndex(String id, String lemmaId, String userId) {
        this.id = id;
        this.lemmaId = lemmaId;
        this.userId = userId;
    }
}
