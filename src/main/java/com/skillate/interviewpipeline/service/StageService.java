package com.skillate.interviewpipeline.service;

import com.skillate.interviewpipeline.model.Stage;

/**
 * @author Mandeep Singh
 *
 */
public interface StageService {

	public Stage addStage(int jobId, String stageName);

	public boolean updateStageName(int stageId, String name);

	public boolean updateInterviewOrder();

	public boolean deleteStage(int stageId);
}
