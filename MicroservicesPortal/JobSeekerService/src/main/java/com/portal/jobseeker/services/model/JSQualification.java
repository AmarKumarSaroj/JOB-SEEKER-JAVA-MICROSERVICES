package com.portal.jobseeker.services.model;
import jakarta.persistence.*;
import lombok.*;

import java.util.ArrayList;

@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Getter
@Setter
@Entity
@Table(name = "JSQualificationDetails")
public class JSQualification {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int JSQualificationId;

    @ManyToOne
    private JobSeeker jobSeekerId;




}
