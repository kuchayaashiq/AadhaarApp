package com.aadhaar.AadhaarApp.Repository;

import com.aadhaar.AadhaarApp.Model.AadhaarInfo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

@Component
public interface AadhaarRepo extends JpaRepository<AadhaarInfo, String> {
}
