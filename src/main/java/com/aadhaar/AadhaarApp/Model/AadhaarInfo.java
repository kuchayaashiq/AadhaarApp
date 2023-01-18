package com.aadhaar.AadhaarApp.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name = "Aadhaar")
public class AadhaarInfo {

    @Id
    private String aadhaarId;
    private String name;
}
