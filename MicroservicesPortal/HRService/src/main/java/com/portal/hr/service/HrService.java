package com.portal.hr.service;

import com.portal.hr.model.HrModel;

import java.util.List;
import java.util.Optional;

public interface HrService {

    List<HrModel> getAllHrDetails();

    HrModel getHrByHrId(String hrId);

    List<HrModel> getHrByJobId(String jobId);

}
