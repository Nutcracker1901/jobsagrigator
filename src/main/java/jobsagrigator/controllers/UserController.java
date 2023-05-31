package jobsagrigator.controllers;

import jobsagrigator.services.ProfileService;
import jobsagrigator.services.SearchService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class UserController {
    ProfileService profileService;
    SearchService searchService;

    public UserController(ProfileService profileService, SearchService searchService) {
        this.profileService = profileService;
        this.searchService = searchService;
    }

    @GetMapping("/getUserInfo")
    public ResponseEntity getUserInfo(@RequestParam String id) {
        return ResponseEntity.ok(profileService.getUserInfo(id));
    }

    @PutMapping("/changeUserInfo")
    public ResponseEntity changeUserInfo(@RequestParam String id, @RequestParam String name, @RequestParam String email,
                                         @RequestParam String phoneNumber, @RequestParam String birthdate, @RequestParam String occupation,
                                         @RequestParam String additionalDescription) {

        return ResponseEntity.ok(profileService.changeUserInfo(id, name, email, phoneNumber, birthdate, occupation, additionalDescription));
    }

    @PutMapping("/addCertificate")
    public ResponseEntity addCertificate(@RequestParam String id, @RequestParam String certificate) {
        return ResponseEntity.ok(profileService.addCertificate(id, certificate));
    }

    @DeleteMapping("/deleteCertificate")
    public ResponseEntity deleteCertificate(@RequestParam String id, @RequestParam String certificate) {
        return ResponseEntity.ok(profileService.addCertificate(id, certificate));
    }
}
