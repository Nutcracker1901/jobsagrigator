package jobsagrigator.repositories;

import jobsagrigator.models.CertificatesTypes;
import jobsagrigator.models.JobVacancy;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.Optional;

public interface JobVacancyRepository extends MongoRepository<JobVacancy, String> {
    Optional<JobVacancy> findByCertificatesTypes(CertificatesTypes certificatesTypes);
}
