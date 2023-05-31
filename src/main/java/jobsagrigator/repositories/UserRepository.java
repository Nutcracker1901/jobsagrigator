package jobsagrigator.repositories;

import java.util.Optional;

import jobsagrigator.models.User;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface UserRepository extends MongoRepository<User, String> {
    Optional<User> findByUsername(String username);
    Boolean existsByEmail(String email);
    Optional<User> findById(String id);
    Optional<User> findByJobVacancies(String vacancyId);
}
