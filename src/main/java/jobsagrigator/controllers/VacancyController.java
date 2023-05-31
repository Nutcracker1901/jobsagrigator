package jobsagrigator.controllers;

import jobsagrigator.models.CertificatesTypes;
import jobsagrigator.models.Schedule;
import jobsagrigator.services.ProfileService;
import jobsagrigator.services.VacancyService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.io.File;
import java.util.List;

@RestController
@RequestMapping("/api")
public class VacancyController {
    ProfileService profileService;
    VacancyService vacancyService;

    public VacancyController(ProfileService profileService, VacancyService vacancyService) {
        this.profileService = profileService;
        this.vacancyService = vacancyService;
    }

    @PostMapping("/createVacancy")
    public ResponseEntity createVacancy(@RequestParam String userId, @RequestParam String vacancyId, @RequestParam String name, @RequestParam Schedule schedule,
                                        @RequestParam List<CertificatesTypes> certificatesTypes, @RequestParam String additionalDescription,
                                        @RequestParam File photo, @RequestParam String phoneNumber, @RequestParam String email,
                                        @RequestParam String location) {
        return ResponseEntity.ok(vacancyService.createVacancy(userId, vacancyId, name, schedule, certificatesTypes, additionalDescription,
                photo, phoneNumber, email, location));
    }

    @PutMapping("/changeVacancy")
    public ResponseEntity changeVacancy(@RequestParam String userId, @RequestParam String vacancyId, @RequestParam String name, @RequestParam Schedule schedule,
                                        @RequestParam List<CertificatesTypes> certificatesTypes, @RequestParam String additionalDescription,
                                        @RequestParam File photo, @RequestParam String phoneNumber, @RequestParam String email,
                                        @RequestParam String location) {
        return ResponseEntity.ok(vacancyService.changeVacancy(userId, vacancyId, name, schedule, certificatesTypes, additionalDescription,
                photo, phoneNumber, email, location));
    }

    @DeleteMapping("/deleteVacancy")
    public ResponseEntity changeVacancy(@RequestParam String userId, @RequestParam String vacancyId) {
        return ResponseEntity.ok(vacancyService.deleteVacancy(userId, vacancyId));
    }
}
