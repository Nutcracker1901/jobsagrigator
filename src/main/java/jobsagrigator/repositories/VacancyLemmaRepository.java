package jobsagrigator.repositories;

import jobsagrigator.models.VacancySearchLemma;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface VacancyLemmaRepository extends MongoRepository<VacancySearchLemma, String> {
}
