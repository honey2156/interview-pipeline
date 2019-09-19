package com.skillate.interviewpipeline.service;

import com.skillate.interviewpipeline.model.Interview;

/**
 * @author Mandeep Singh
 *
 */
public interface InterviewService {

	public Interview addInterview(int stageId, String interviewName);

	public boolean updateInterviewName(int interviewId, String interviewName);

	public boolean deleteInterview(int interviewId);
}
