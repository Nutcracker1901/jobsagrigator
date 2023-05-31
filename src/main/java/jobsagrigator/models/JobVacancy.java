package jobsagrigator.models;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.io.File;
import java.util.List;

@Document(collation = "vacancies")
@Getter
@Setter
public class JobVacancy {
    @Id
    private String id;
    @NotBlank
    @Size(max = 120)
    private String name;
    private Schedule schedule;
    private List<CertificatesTypes> certificatesTypes;
    @Size(max = 500)
    private String additionalDescription;
    private File photo;
    @Size(max = 12)
    private String phoneNumber;
    @Size(max = 120)
    @Email
    private String email;
    private String location;

    public JobVacancy() {
    }

    public JobVacancy(String name, String phoneNumber) {
        this.name = name;
        this.phoneNumber = phoneNumber;
    }
}
