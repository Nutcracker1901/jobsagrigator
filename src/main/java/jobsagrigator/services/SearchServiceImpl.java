package jobsagrigator.services;

import jobsagrigator.models.CertificatesTypes;
import jobsagrigator.repositories.JobVacancyRepository;
import jobsagrigator.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SearchServiceImpl implements SearchService {
    @Autowired
    UserRepository userRepository;
    @Autowired
    JobVacancyRepository vacancyRepository;

    @Override
    public ResponseEntity searchVacancies(String query, List<CertificatesTypes> certificatesTypes) {
        return null;
    }

    @Override
    public ResponseEntity searchEmployees(String query, List<CertificatesTypes> certificatesTypes) {
        return null;
    }
}
