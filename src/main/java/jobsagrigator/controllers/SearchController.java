package jobsagrigator.controllers;

import jobsagrigator.models.CertificatesTypes;
import jobsagrigator.models.Schedule;
import jobsagrigator.services.ProfileService;
import jobsagrigator.services.SearchService;
import jobsagrigator.services.VacancyService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.io.File;
import java.util.List;

@RestController
@RequestMapping("/api")
public class SearchController {
    ProfileService profileService;
    VacancyService vacancyService;
    SearchService searchService;

    public SearchController(ProfileService profileService, VacancyService vacancyService, SearchService searchService) {
        this.profileService = profileService;
        this.vacancyService = vacancyService;
        this.searchService = searchService;
    }

    @GetMapping("/searchVacancies")
    public ResponseEntity findVacancies(@RequestParam String query, @RequestParam List<CertificatesTypes> certificatesTypes) {
        return ResponseEntity.ok(searchService.searchVacancies(query, certificatesTypes));
    }

    @GetMapping("/searchEmployees")
    public ResponseEntity findEmployees(@RequestParam String query, @RequestParam List<CertificatesTypes> certificatesTypes) {
        return ResponseEntity.ok(searchService.searchEmployees(query, certificatesTypes));
    }
}
