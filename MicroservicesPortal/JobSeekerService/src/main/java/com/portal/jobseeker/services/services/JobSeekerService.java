package com.portal.jobseeker.services.services;


import com.portal.jobseeker.services.model.JobSeeker;

import java.util.List;

public interface JobSeekerService {

    List<JobSeeker> getAllJobseeker();

    JobSeeker getByJobseekerId(int jobseekerId);

    JobSeeker saveJobseeker(JobSeeker jobseeker);

    void deleteByJobseekerId(int jobseekerId);

    void updateByJobseekerId(int jobseekerId);


}
