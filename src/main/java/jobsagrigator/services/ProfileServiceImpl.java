package jobsagrigator.services;

import jobsagrigator.models.EmployeeSearchIndex;
import jobsagrigator.models.User;
import jobsagrigator.repositories.EmployeeIndexRepository;
import jobsagrigator.repositories.EmployeeLemmaRepository;
import jobsagrigator.repositories.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class ProfileServiceImpl implements ProfileService {
    @Autowired
    private UserRepository userRepository;
    @Autowired
    private EmployeeIndexRepository indexRepository;
    @Autowired
    private EmployeeLemmaRepository lemmaRepository;

    @Override
    public ResponseEntity getUserInfo(String id) {
        return ResponseEntity.ok(userRepository.findById(id).get().toString());
    }

    @Override
    public ResponseEntity changeUserInfo(String id, String name, String email, String phoneNumber,
                                         String birthdate, String occupation, String additionalDescription) {
        User user = userRepository.findById(id).get();
        indexEmployeeLemmas(occupation + " " + additionalDescription, user);
        return ResponseEntity.ok(true);
    }

    @Override
    public ResponseEntity addCertificate(String id, String certificate) {
        return ResponseEntity.ok(true);
    }

    @Override
    public ResponseEntity deleteCertificate(String id, String certificate) {
        return ResponseEntity.ok(true);
    }

    private void indexEmployeeLemmas(String lemmas, User user) {

    }
}
