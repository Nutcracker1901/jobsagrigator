package jobsagrigator.repositories;

import jobsagrigator.models.VacancySearchIndex;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface VacancyIndexRepository extends MongoRepository<VacancySearchIndex, String> {

}
