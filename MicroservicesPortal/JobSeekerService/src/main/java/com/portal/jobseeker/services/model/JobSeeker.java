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
@Table(name = "JobseekerDetails")
public class JobSeeker {

    @Id
    @Column(name = "jobSeekerId")
    private String jobSeekerId;

    @Column(name = "firstName",nullable = false)
    private String firstName;

    @Column(name = "middleName")
    private String middleName;

    @Column(name = "lastName")
    private String lastName;

    @Column(name = "password",nullable = false)
    private String password;

}
