package com.aadhaar.AadhaarApp.controller;

import com.aadhaar.AadhaarApp.Model.AadhaarInfo;
import com.aadhaar.AadhaarApp.controller.Service.Imple.AadhaarServiceImple;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/info")
public class Controller {

    @Autowired
    AadhaarServiceImple aadhaarService;
    @PostMapping("/add")
    public ResponseEntity<AadhaarInfo> create(@RequestBody AadhaarInfo aadhaarInfo){
        AadhaarInfo aadhaarInfo1 = aadhaarService.create(aadhaarInfo);
        return new ResponseEntity<>(aadhaarInfo1, HttpStatus.CREATED);
    }
    @GetMapping("/get/{aadhaarId}")
    public ResponseEntity<?> getInfo(@PathVariable String aadhaarId){
        AadhaarInfo aadhaarInfo = aadhaarService.getAadhaarDetails(aadhaarId);
        return new ResponseEntity<>(aadhaarInfo, HttpStatus.OK);
    }
    @GetMapping("/getall")
    public ResponseEntity<?> getInfo(){
        List<AadhaarInfo> aadhaarList = aadhaarService.getAll();
        return new ResponseEntity<>(aadhaarList, HttpStatus.OK);
    }
}
