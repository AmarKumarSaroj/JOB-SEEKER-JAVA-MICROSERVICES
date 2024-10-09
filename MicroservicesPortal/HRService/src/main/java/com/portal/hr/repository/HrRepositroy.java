package com.portal.hr.repository;

import com.portal.hr.model.HrModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface HrRepositroy extends JpaRepository<HrModel, String> {


    @Query(value = "select * from hrDetails where hrId = ?1",nativeQuery = true)
    HrModel getHrByHrId(String hrId);
}
