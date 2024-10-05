package com.portal.jobseeker.services.repository;


import com.portal.jobseeker.services.model.JobSeeker;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface JobSeekerRepo extends JpaRepository<JobSeeker,Integer> {


    @Query(value = "delete from Jobseeker_details where jobseekerId = ?1",nativeQuery = true)
    JobSeeker getByJobseekerId(int jobseekerId);


 //   @Query(value = "update Jobseeker_details set",nativeQuery = true)
   // void updateByJobseekerId(int jobseekerId);


}
