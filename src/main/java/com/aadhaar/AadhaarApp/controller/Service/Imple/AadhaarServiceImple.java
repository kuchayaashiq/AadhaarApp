package com.aadhaar.AadhaarApp.controller.Service.Imple;

import com.aadhaar.AadhaarApp.Model.AadhaarInfo;
import com.aadhaar.AadhaarApp.Repository.AadhaarRepo;
import com.aadhaar.AadhaarApp.controller.Service.AadhaarService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AadhaarServiceImple implements AadhaarService {
    @Autowired
    AadhaarRepo aadhaarRepo;
    @Override
    public AadhaarInfo create(AadhaarInfo aadhaarInfo) {
        return aadhaarRepo.save(aadhaarInfo);

    }

    @Override
    public AadhaarInfo getAadhaarDetails(String aadhaarId) {
        return  aadhaarRepo.findById(aadhaarId).get();

    }

    @Override
    public List<AadhaarInfo> getAll() {
        List<AadhaarInfo> userList = aadhaarRepo.findAll();
        return userList;
    }
}
