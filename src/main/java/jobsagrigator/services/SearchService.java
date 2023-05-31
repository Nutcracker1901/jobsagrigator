package jobsagrigator.services;

import jobsagrigator.models.CertificatesTypes;
import org.springframework.http.ResponseEntity;

import java.util.List;

public interface SearchService {
    ResponseEntity searchVacancies(String query, List<CertificatesTypes> certificatesTypes);

    ResponseEntity searchEmployees(String query, List<CertificatesTypes> certificatesTypes);
}
