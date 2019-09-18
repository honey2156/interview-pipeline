package com.skillate.interviewpipeline.service;

import com.skillate.interviewpipeline.model.Interview;

/**
 * @author Mandeep Singh
 *
 */
public interface InterviewService {

	public Interview addInterview();

	public boolean updateInterviewName();

	public boolean updateInterviewsOrder();

	public boolean deleteInterview();
}
