package com.portal.hr.service.impl;

import com.portal.hr.model.JobAndJobSeeker;
import com.portal.hr.model.Jobs;
import com.portal.hr.repository.JobsRepository;
import com.portal.hr.service.JobsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class JobsServiceImpl implements JobsService {


    @Autowired
    JobsRepository jobsRepository;


    @Override
    public Jobs saveJobs(Jobs jobs) {

        jobs.setJobId(jobIdGenerator());

        return jobsRepository.save(jobs);
    }

    @Override
    public void applyForJob(JobAndJobSeeker jobAndJobSeeker) {
         jobsRepository.applyForJob(jobAndJobSeeker.getJobSeekerId(), jobAndJobSeeker.getJobId());
    }

    @Override
    public List<Jobs> getAllJobs() {
        return jobsRepository.findAll();
    }


    public String jobIdGenerator(){

       String maxJobId = jobsRepository.getMaxJobId();

        return maxJobId;
    }


}
