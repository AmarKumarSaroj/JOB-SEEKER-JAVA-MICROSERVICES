package com.portal.job_utils.repository;

import com.portal.job_utils.model.Qualification;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface QualificationRepo extends JpaRepository<Qualification,Integer> {
}
