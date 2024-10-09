package com.portal.jobseeker.services.repository;


import com.portal.jobseeker.services.model.JobSeeker;
import jakarta.transaction.Transactional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface JobSeekerRepo extends JpaRepository<JobSeeker,Integer> {

    @Modifying
    @Transactional
    @Query(value = "delete from JobseekerDetails where jobSeekerId = ?1",nativeQuery = true)
    JobSeeker getByJobseekerId(int jobseekerId);


    @Query(value = "SELECT 'JS' + CAST(CAST(SUBSTRING(MAX(jobSeekerId), 3, LEN(MAX(jobSeekerId)) - 2) AS INT) + 1 AS VARCHAR) AS NextJobId FROM JobseekerDetails",nativeQuery = true)
    String getMaxJobSeekerId();


    //   @Query(value = "update Jobseeker_details set",nativeQuery = true)
   // void updateByJobseekerId(int jobseekerId);


}
