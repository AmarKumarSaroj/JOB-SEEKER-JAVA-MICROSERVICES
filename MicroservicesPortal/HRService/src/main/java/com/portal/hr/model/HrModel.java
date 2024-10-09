package com.portal.hr.model;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;
import lombok.*;

import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Data
@ToString
@Entity
@Table(name = "hrDetails")
public class HrModel {

    @Id
    private String hrId;

    private String hrFirstName;
    private String hrLastName;
    private String hrMiddleName;
    private String hrEmailId;
    private String hrMobileNumber;
    private String hrGender;
    private String hrDateOfBirth;
    private String hrNationality;
    private String hrAddressLine1;
    private String hrAddressLine2;
    private String hrCity;
    private String hrState;
    private String hrCountry;
    private String hrPostalCode;
    private String hrDepartment;
    private String hrDesignation;
    private String hrEmployeeType; // Full-time, Part-time, etc.
    private String hrJoiningDate;
    private String hrExperience; // Total years of experience
    private String hrWorkLocation;
    private String hrEmergencyContactName;
    private String hrEmergencyContactRelation;
    private String hrEmergencyContactNumber;
    private String hrManagerId; // ID of the manager the HR reports to
    private String hrLinkedInProfileUrl;
    private String hrStatus; // Active, Inactive
    private String hrPassword; // For authentication if needed
    private String hrRole; // HR Administrator, HR Manager, etc.
    private String hrSkills;

    @OneToMany(mappedBy = "hrModel", cascade = CascadeType.ALL)
    @JsonManagedReference   // This manages the serialization of the list of AppliedJob instances
    private List<Jobs> postJobs = new ArrayList<>();



}

/*





CREATE TABLE hrDetails (
    hrId NVARCHAR(50) PRIMARY KEY,                 -- HR unique identifier
    hrFirstName NVARCHAR(100) NOT NULL,            -- First name of the HR
    hrLastName NVARCHAR(100) NOT NULL,             -- Last name of the HR
    hrMiddleName NVARCHAR(100) NULL,               -- Middle name of the HR (optional)
    hrEmailId NVARCHAR(255) NOT NULL UNIQUE,       -- Email ID of the HR
    hrMobileNumber NVARCHAR(20) NOT NULL,          -- Mobile number of the HR
    hrGender NVARCHAR(20) NULL,                    -- Gender of the HR
    hrDateOfBirth DATE NULL,                       -- Date of Birth of the HR
    hrNationality NVARCHAR(100) NULL,              -- Nationality of the HR
    hrAddressLine1 NVARCHAR(255) NULL,             -- Address line 1
    hrAddressLine2 NVARCHAR(255) NULL,             -- Address line 2 (optional)
    hrCity NVARCHAR(100) NULL,                     -- City of residence
    hrState NVARCHAR(100) NULL,                    -- State of residence
    hrCountry NVARCHAR(100) NULL,                  -- Country of residence
    hrPostalCode NVARCHAR(20) NULL,                -- Postal code
    hrDepartment NVARCHAR(100) NULL,               -- Department HR works in
    hrDesignation NVARCHAR(100) NULL,              -- Designation (e.g., HR Manager)
    hrEmployeeType NVARCHAR(50) NULL,              -- Employee type (e.g., Full-time)
    hrJoiningDate DATE NULL,                       -- Date the HR joined
    hrExperience INT NULL,                         -- Total years of experience
    hrWorkLocation NVARCHAR(100) NULL,             -- Work location
    hrEmergencyContactName NVARCHAR(100) NULL,     -- Emergency contact name
    hrEmergencyContactRelation NVARCHAR(50) NULL,  -- Relationship with emergency contact
    hrEmergencyContactNumber NVARCHAR(20) NULL,    -- Emergency contact number
    hrManagerId NVARCHAR(50) NULL,                 -- Manager ID HR reports to
    hrLinkedInProfileUrl NVARCHAR(255) NULL,       -- LinkedIn profile URL
    hrStatus NVARCHAR(50) NULL,                    -- Status (e.g., Active, Inactive)
    hrPassword NVARCHAR(255) NULL,                 -- Password for HR login (if applicable)
    hrRole NVARCHAR(100) NULL,                     -- Role of HR (e.g., HR Administrator)
    hrSkills NVARCHAR(MAX) NULL                    -- Skills or certifications
);


INSERT INTO hrDetails (
    hrId,
    hrFirstName,
    hrLastName,
    hrMiddleName,
    hrEmailId,
    hrMobileNumber,
    hrGender,
    hrDateOfBirth,
    hrNationality,
    hrAddressLine1,
    hrAddressLine2,
    hrCity,
    hrState,
    hrCountry,
    hrPostalCode,
    hrDepartment,
    hrDesignation,
    hrEmployeeType,
    hrJoiningDate,
    hrExperience,
    hrWorkLocation,
    hrEmergencyContactName,
    hrEmergencyContactRelation,
    hrEmergencyContactNumber,
    hrManagerId,
    hrLinkedInProfileUrl,
    hrStatus,
    hrPassword,
    hrRole,
    hrSkills
)
VALUES (
    'HR001',
    'John',
    'Doe',
    'A',
    'john.doe@email.com',
    '1234567890',
    'Male',
    '1985-07-12',
    'American',
    '123 Elm Street',
    'Apt 4B',
    'New York',
    'NY',
    'USA',
    '10001',
    'Human Resources',
    'HR Manager',
    'Full-time',
    '2015-08-01',
    '10',
    'New York Office',
    'Jane Doe',
    'Sister',
    '9876543210',
    'HRM123',
    'https://linkedin.com/in/johndoe',
    'Active',
    'password123',
    'HR Administrator',
    'Leadership, Recruitment'
);



 */
