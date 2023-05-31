package jobsagrigator.services;

import org.springframework.http.ResponseEntity;

public interface ProfileService {
    public ResponseEntity getUserInfo(String id);
    public ResponseEntity changeUserInfo(String id, String name, String email, String phoneNumber,
                                         String birthdate, String occupation, String additionalDescription);
    public ResponseEntity addCertificate(String id, String certificate);
    public ResponseEntity deleteCertificate(String id, String certificate);
}
