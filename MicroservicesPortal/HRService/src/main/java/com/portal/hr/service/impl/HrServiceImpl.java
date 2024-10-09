package com.portal.hr.service.impl;

import com.portal.hr.model.HrModel;
import com.portal.hr.repository.HrRepositroy;
import com.portal.hr.service.HrService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class HrServiceImpl implements HrService {

    @Autowired
    private HrRepositroy hrRepositroy;


    @Override
    public List<HrModel> getAllHrDetails() {
        return hrRepositroy.findAll();
    }

    @Override
    public HrModel getHrByHrId(String hrId) {

        HrModel model = hrRepositroy.getHrByHrId(hrId);

        return model;
    }

    @Override
    public List<HrModel> getHrByJobId(String jobId) {

        return hrRepositroy.findAll();
    }

}
