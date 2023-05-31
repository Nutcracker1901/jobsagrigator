package jobsagrigator.models;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Date;
import java.util.List;

@Document(collation = "users")
@Getter
@Setter
public class User {
    @Id
    private String id;
    @NotBlank
    @Size(max = 50)
    @Email
    private String email;
    @NotBlank
    @Size(max = 120)
    private String password;
    @Size(max = 120)
    private String name;
    @Size(max = 12)
    private String phoneNumber;
    private Date birthdate;
    @Size(max = 120)
    private String occupation;
    @Size(max = 500)
    private String additionalDescription;
    private List<CertificatesTypes> certificatesTypes;
    private List<String> certificates;
    @DBRef
    private List<JobVacancy> jobVacancies;

    public User() {
    }

    public User(String email, String password) {
        this.email = email;
        this.password = password;
    }
}
