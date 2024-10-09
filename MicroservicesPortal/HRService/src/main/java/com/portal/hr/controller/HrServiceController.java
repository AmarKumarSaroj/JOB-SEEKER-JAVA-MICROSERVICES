package com.portal.hr.controller;


import com.portal.hr.model.HrModel;
import com.portal.hr.repository.HrRepositroy;
import com.portal.hr.service.HrService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/hr-service/")
public class HrServiceController {

    @Autowired
    private HrService hrService;

    @GetMapping("/all")
    public List<HrModel> allHr(){
        return  hrService.getAllHrDetails();
    }


    @GetMapping("/{hrid}")
    public HrModel getHrById(@PathVariable String hrid){

        HrModel model = hrService.getHrByHrId(hrid);

        return model;
    }










}
