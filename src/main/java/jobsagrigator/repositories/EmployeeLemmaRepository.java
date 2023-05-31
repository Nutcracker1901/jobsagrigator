package jobsagrigator.repositories;

import jobsagrigator.models.EmployeeSearchLemma;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;
import java.util.Optional;

public interface EmployeeLemmaRepository extends MongoRepository<EmployeeSearchLemma, String> {
    Optional<List<EmployeeSearchLemma>> findByLemma(String lemma);
}
