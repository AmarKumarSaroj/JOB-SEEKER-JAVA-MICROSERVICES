package com.portal.hr.service;


import com.portal.hr.model.JobAndJobSeeker;
import com.portal.hr.model.Jobs;

import java.util.List;

public interface JobsService {

    Jobs saveJobs(Jobs jobs);

    void applyForJob(JobAndJobSeeker jobAndJobSeeker);

    List<Jobs> getAllJobs();

}
