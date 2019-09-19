package com.skillate.interviewpipeline.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.skillate.interviewpipeline.dao.InterviewDao;
import com.skillate.interviewpipeline.dao.StageDao;
import com.skillate.interviewpipeline.model.Interview;
import com.skillate.interviewpipeline.model.Stage;
import com.skillate.interviewpipeline.service.InterviewService;

/**
 * @author Mandeep Singh
 *
 */
@Service("interviewService")
public class InterviewServiceImpl implements InterviewService {

	@Autowired
	private InterviewDao interviewDao;

	@Autowired
	private StageDao stageDao;

	@Override
	public Interview addInterview(int stageId, String interviewName) {
		Interview interview = null;
		if (stageDao.existsById(stageId)) {
			Stage stage = stageDao.findById(stageId).get();
			interview = new Interview();
			interview.setName(interviewName);
			List<Interview> interviews = stage.getInterviews();
			interviews.add(interview);
			stage.setInterviews(interviews);
			stageDao.save(stage);
		}
		return interview;
	}

	@Override
	public boolean updateInterviewName(int interviewId, String interviewName) {
		if (interviewDao.existsById(interviewId)) {
			Interview interview = interviewDao.findById(interviewId).get();
			interview.setName(interviewName);
			interviewDao.save(interview);
			return true;
		}
		return false;
	}

	@Override
	public boolean deleteInterview(int interviewId) {
		if (interviewDao.existsById(interviewId)) {
			interviewDao.deleteById(interviewId);
			return true;
		}
		return false;
	}

}
