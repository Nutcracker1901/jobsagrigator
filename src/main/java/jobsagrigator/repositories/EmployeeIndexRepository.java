package jobsagrigator.repositories;

import jobsagrigator.models.EmployeeSearchIndex;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;
import java.util.Optional;

public interface EmployeeIndexRepository extends MongoRepository<EmployeeSearchIndex, String> {
    Optional<List<EmployeeSearchIndex>> findByLemmaId(String lemmaId);
}
