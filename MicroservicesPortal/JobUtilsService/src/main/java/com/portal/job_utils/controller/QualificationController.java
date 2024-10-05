package com.portal.job_utils.controller;
import com.portal.job_utils.model.Qualification;
import com.portal.job_utils.service.QualificationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api-qualification/")
public class QualificationController {

    @Autowired
    QualificationService qualificationService;

    @GetMapping("/get-qualifications")
    public ResponseEntity<List<Qualification>> getQualifications(){

        return ResponseEntity.ok(qualificationService.getAllQualifications());
    }

    @GetMapping("/get-qualifications/{qualificationid}")
    public ResponseEntity<Qualification> getQualificationsById(@PathVariable int qualificationid){

        return ResponseEntity.ok(qualificationService.getQualificationsById(qualificationid));
    }

    @GetMapping("/get-qualifications/{jobseekerid}")
    public ResponseEntity<List<Qualification>> getQualificationsByJobseekerId(@PathVariable int jobseekerid){

        return ResponseEntity.ok(qualificationService.getQualificationsByJobseekerId(jobseekerid));
    }




}
