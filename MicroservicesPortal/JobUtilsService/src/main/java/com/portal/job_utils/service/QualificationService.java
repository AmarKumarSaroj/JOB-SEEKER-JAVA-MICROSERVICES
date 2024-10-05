package com.portal.job_utils.service;

import com.portal.job_utils.model.Qualification;

import java.util.List;

public interface QualificationService {


    List<Qualification> getAllQualifications();

    Qualification getQualificationsById(int qualificationid);


    List<Qualification> getQualificationsByJobseekerId(int jobseekerid);

}
