package com.portal.jobseeker.services.model;


import jakarta.persistence.*;
import lombok.*;

import java.util.ArrayList;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Getter
@Setter
@Entity
@Table(name = "Jobseeker_details")
public class JobSeeker {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int jobSeekerId;

//    private String emailId;
//    private String mobileNumber;
    private String firstName;
    private String middleName;
    private String lastName;

    @OneToMany(mappedBy = "jobSeekerId",cascade = CascadeType.ALL)
    private ArrayList<JSQualification> qualification = new ArrayList<>();

    private String designation;
    private boolean maritalStatus; // corrected spelling from 'merried'
    private String skills;
    private String totalExperience;


}
