package jobsagrigator.services;

import jobsagrigator.models.CertificatesTypes;
import jobsagrigator.models.Schedule;
import org.springframework.http.ResponseEntity;

import java.io.File;
import java.util.List;

public interface VacancyService {
    public ResponseEntity createVacancy(String userId, String vacancyId, String name, Schedule schedule, List<CertificatesTypes> certificatesTypes, String additionalDescription,
                                        File photo, String phoneNumber, String email, String location);

    public ResponseEntity changeVacancy(String userId, String vacancyId, String name, Schedule schedule, List<CertificatesTypes> certificatesTypes, String additionalDescription,
                                        File photo, String phoneNumber, String email, String location);

    public ResponseEntity deleteVacancy(String userId, String vacancyId);
}
