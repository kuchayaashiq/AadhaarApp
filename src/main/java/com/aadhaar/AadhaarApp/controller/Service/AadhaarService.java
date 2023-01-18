package com.aadhaar.AadhaarApp.controller.Service;

import com.aadhaar.AadhaarApp.Model.AadhaarInfo;

import java.util.List;

public interface AadhaarService {
    AadhaarInfo create(AadhaarInfo aadhaarInfo);
    AadhaarInfo getAadhaarDetails(String aadhaarId);
    List<AadhaarInfo> getAll();
}
