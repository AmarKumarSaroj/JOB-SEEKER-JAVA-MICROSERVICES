package com.portal.job_utils.service.impl;

import com.portal.job_utils.model.Qualification;
import com.portal.job_utils.repository.QualificationRepo;
import com.portal.job_utils.service.QualificationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class QualificationServiceImpl implements QualificationService {

    @Autowired
    QualificationRepo qualificationRepo;

    @Override
    public List<Qualification> getAllQualifications() {
        return qualificationRepo.findAll();
    }

    @Override
    public Qualification getQualificationsById(int qualificationid) {
        return null;
    }


    @Override
    public List<Qualification> getQualificationsByJobseekerId(int jobseekerid) {
        return List.of();
    }


}
