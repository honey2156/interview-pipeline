package com.skillate.interviewpipeline.service;

import java.util.List;

import com.skillate.interviewpipeline.model.Job;
import com.skillate.interviewpipeline.model.Stage;

/**
 * @author Mandeep Singh
 *
 */
public interface JobService {

	public Job createJob(String name);

	public boolean updateJobName(int jobId, String name);
	
	public boolean updateStageOrder(List<Stage> stages);

	public boolean deleteJob(int jobId);
}
