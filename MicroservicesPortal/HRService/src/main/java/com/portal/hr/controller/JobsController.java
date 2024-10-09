package com.portal.hr.controller;


import com.portal.hr.model.JobAndJobSeeker;
import com.portal.hr.model.Jobs;
import com.portal.hr.service.JobsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/job/")
public class JobsController {

    @Autowired
    JobsService jobsService;

    @PostMapping("/save")
    public Jobs saveJobs(@RequestBody Jobs jobs){

        return  jobsService.saveJobs(jobs);
    }


    @PostMapping("/apply")
    public void saveJobs(@RequestBody JobAndJobSeeker jobAndJobSeeker){

        jobsService.applyForJob(jobAndJobSeeker);

    }

    @GetMapping("/all-jobs")
    public ResponseEntity<List<Jobs>> getAllJobs(){

        return ResponseEntity.ok(jobsService.getAllJobs());
    }









}
