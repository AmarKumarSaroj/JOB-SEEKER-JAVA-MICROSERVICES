package com.portal.hr.repository;

import com.portal.hr.model.Jobs;
import jakarta.transaction.Transactional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface JobsRepository extends JpaRepository<Jobs,String> {

    @Query(value = "SELECT 'AJ' + CAST(CAST(SUBSTRING(MAX(jobId), 3, LEN(MAX(jobId)) - 2) AS INT) + 1 AS VARCHAR) AS NextJobId FROM Jobs",nativeQuery = true)
    String getMaxJobId();

    @Modifying
    @Transactional
    @Query(value = "update Jobs set jobSeekerId = ?1 where jobId = ?2",nativeQuery = true)
    void applyForJob(String jobSeekerId, String jobId);

}
