package com.skillate.interviewpipeline.dao;

import org.springframework.data.repository.CrudRepository;

import com.skillate.interviewpipeline.model.Interview;

/**
 * @author Mandeep Singh
 *
 */
public interface InterviewDao extends CrudRepository<Interview, Integer> {

}
