package jobsagrigator.services;

import jobsagrigator.models.CertificatesTypes;
import jobsagrigator.models.JobVacancy;
import jobsagrigator.models.Schedule;
import jobsagrigator.models.User;
import jobsagrigator.repositories.JobVacancyRepository;
import jobsagrigator.repositories.UserRepository;
import jobsagrigator.repositories.VacancyIndexRepository;
import jobsagrigator.repositories.VacancyLemmaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

@Service
public class VacancyServiceImpl implements VacancyService{
    @Autowired
    JobVacancyRepository vacancyRepository;
    @Autowired
    UserRepository userRepository;
    @Autowired
    VacancyIndexRepository indexRepository;
    @Autowired
    VacancyLemmaRepository lemmaRepository;

    @Override
    public ResponseEntity createVacancy(String userId, String vacancyId, String name, Schedule schedule, List<CertificatesTypes> certificatesTypes, String additionalDescription, File photo, String phoneNumber, String email, String location) {
        JobVacancy vacancy = new JobVacancy();
        User user = userRepository.findById(userId).get();
        user.setJobVacancies(new ArrayList<>());
        userRepository.save(user);
        return ResponseEntity.ok(vacancyRepository.save(vacancy));
    }

    @Override
    public ResponseEntity changeVacancy(String userId, String id, String name, Schedule schedule, List<CertificatesTypes> certificatesTypes, String additionalDescription, File photo, String phoneNumber, String email, String location) {
        return ResponseEntity.ok(vacancyRepository.save(new JobVacancy()));
    }

    @Override
    public ResponseEntity deleteVacancy(String userId, String vacancyId) {
        return ResponseEntity.ok(true);
    }

    private void indexVacancyLemmas(String lemmas, JobVacancy vacancy) {

    }
}
