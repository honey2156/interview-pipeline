package com.skillate.interviewpipeline.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.skillate.interviewpipeline.model.Job;

/**
 * @author Mandeep Singh
 *
 */
@Repository
public interface JobDao extends CrudRepository<Job, Integer> {

}
