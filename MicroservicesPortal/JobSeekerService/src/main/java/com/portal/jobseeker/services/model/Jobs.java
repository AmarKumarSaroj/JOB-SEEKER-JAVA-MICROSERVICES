package com.portal.jobseeker.services.model;


import com.fasterxml.jackson.annotation.JsonBackReference;
import jakarta.persistence.*;
import lombok.*;

import java.util.Date;

@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@Data
@ToString
@Entity
 public class Jobs {


        @Id
        private String jobId;

        //Unique ID for the applied job
        private String designationName;      // Job title or designation
        private String skills;               // Required skills for the job
        private String requiredExperience;   // Required experience in years or specific domain
        private String countryName;          // Country where the job is located
        private String cityName;             // City where the job is located
        private Date startDate;              // Job start date
        private Date endDate;                // Job end date
        private String companyName;          // Name of the company offering the job
        private String jobType;              // Type of job (e.g., full-time, part-time, contract)
        private double salaryRange;          // Salary range offered for the job
        private String jobDescription;       // Description of the job
        private boolean isRemote;            // Indicates if the job is remote or onsite
        private String department;           // Department the job belongs to
        private String benefits;             // Benefits offered (e.g., health insurance, 401k)
        private String employmentStatus;     // Employment status (e.g., permanent, temporary)
        private int workingHoursPerWeek;     // Number of working hours per week
        private boolean isInternship;        // Indicates if the job is an internship
        private boolean visaSponsorship;     // Indicates if visa sponsorship is available
        private String educationLevel;       // Required education level (e.g., Bachelor's, Master's)
        private String industry;             // Industry the job is associated with (e.g., IT, Healthcare)
        private String jobResponsibilities;  // List of responsibilities for the role
        private String hiringManagerName;    // Name of the hiring manager
        private String applicationDeadline;  // Deadline for job applications
        private int numberOfVacancies;       // Number of positions available
        private boolean isDiversityFriendly; // Indicates if the company promotes diversity
        private boolean relocationSupport;   // Indicates if relocation support is provided
        private String languageRequirements; // Languages required for the job
        private String contractDuration;     // Duration of contract (for contract jobs)
        private String employmentLevel;      // Employment level (e.g., entry-level, mid-level, senior)
        private String interviewProcess;     // Description of the interview process (e.g., phone interview, technical test)
        private String applicationURL;       // URL for online job applications
        private Date applicationDate;        // Date the job was applied to
        private boolean isReferral;          // Indicates if the application was a referral
        private String recruiterContactInfo; // Contact information for the recruiter
        private String preferredWorkSchedule;// Preferred working schedule (e.g., flexible, fixed)
        private boolean hasStockOptions;     // Indicates if stock options are offered
        private String securityClearance;    // Indicates if security clearance is required
        private boolean hasTrainingPrograms; // Indicates if training programs are offered
        private String teamSize;


}
