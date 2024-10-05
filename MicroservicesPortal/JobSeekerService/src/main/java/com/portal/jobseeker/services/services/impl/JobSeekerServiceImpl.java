package com.portal.jobseeker.services.services.impl;

import com.portal.jobseeker.services.model.JobSeeker;
import com.portal.jobseeker.services.repository.JobSeekerRepo;
import com.portal.jobseeker.services.services.JobSeekerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.ArrayList;
import java.util.List;

@Service
public class JobSeekerServiceImpl implements JobSeekerService {

    @Autowired
    JobSeekerRepo jobseekerRepo;

    @Autowired
    RestTemplate restTemplate;


    @Override
    public List<JobSeeker> getAllJobseeker() {

       List<JobSeeker> jobSeekerList = jobseekerRepo.findAll();

     //  ArrayList<Qualification> listQualification = restTemplate.getForObject("", ArrayList.class);


        return jobSeekerList;
    }

    @Override
    public JobSeeker getByJobseekerId(int jobseekerId) {



        return jobseekerRepo.getByJobseekerId(jobseekerId);
    }

    @Override
    public JobSeeker saveJobseeker(JobSeeker jobseeker) {

        return jobseekerRepo.save(jobseeker);
    }

    @Override
    public void deleteByJobseekerId(int jobseekerId) {

        jobseekerRepo.deleteById(jobseekerId);

    }

    @Override
    public void updateByJobseekerId(int jobseekerId) {

        jobseekerRepo.findAll();
    }
}
