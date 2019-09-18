package com.skillate.interviewpipeline.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.skillate.interviewpipeline.model.Stage;

/**
 * @author Mandeep Singh
 *
 */
@Repository
public interface StageDao extends CrudRepository<Stage, Integer>{

}
