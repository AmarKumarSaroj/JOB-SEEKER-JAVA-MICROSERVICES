package com.portal.job_utils.model;

import jakarta.persistence.*;
import lombok.*;

import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Getter
@Setter
@Entity
@Table(name = "QualificationDetails")   
public class Qualification {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int qualificationId;

    private String qualificationName;
    private String instituteName;
    private Date startDate;
    private Date endDate;
    private double qualificationDuration;

}
