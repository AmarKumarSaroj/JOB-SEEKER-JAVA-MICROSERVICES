package com.portal.jobseeker.services.controller;

import com.portal.jobseeker.services.model.JobSeeker;
import com.portal.jobseeker.services.repository.JobSeekerRepo;
import com.portal.jobseeker.services.services.JobSeekerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/api/jobseeker-service/")
public class JobSeekerController {

    @Autowired
    private JobSeekerService jobSeekerService;

    @GetMapping("/jobseekerlist")
    public ResponseEntity<List<JobSeeker>> showAllJobSeeker(){

        return ResponseEntity.ok(jobSeekerService.getAllJobseeker());

    }

    @DeleteMapping("/delete/{jobseekerid}")
    public void deleteJobSeeker(@PathVariable int jobseekerid){

        jobSeekerService.deleteByJobseekerId(jobseekerid);
        
    }

    @PostMapping("/jobseekeradd")
    public ResponseEntity<JobSeeker> saveJobSeeker(@RequestBody JobSeeker jobSeeker){

        return ResponseEntity.ok(jobSeekerService.saveJobseeker(jobSeeker));
    }

}
