package com.skillate.interviewpipeline.service.impl;

import java.util.LinkedList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.skillate.interviewpipeline.dao.JobDao;
import com.skillate.interviewpipeline.dao.StageDao;
import com.skillate.interviewpipeline.model.Interview;
import com.skillate.interviewpipeline.model.Job;
import com.skillate.interviewpipeline.model.Stage;
import com.skillate.interviewpipeline.service.StageService;

public class StageServiceImpl implements StageService {

	@Autowired
	private JobDao jobDao;

	@Autowired
	private StageDao stageDao;

	@Override
	public Stage addStage(int jobId, String stageName) {
		Stage stage = null;
		if (jobDao.existsById(jobId)) {
			// Get job from database
			Job job = jobDao.findById(jobId).get();
			// Get stages of job
			List<Stage> stages = job.getStages();
			// create new stage and set it parameters
			stage = new Stage();
			stage.setName(stageName);
			stage.setJob(job);
			LinkedList<Interview> interviews = new LinkedList<Interview>();
			stage.setInterviews(interviews);
			// Add stage to stages of job
			stages.add(stage);
			// update stages
			job.setStages(stages);
			// update job in database
			jobDao.save(job);
		}
		return stage;
	}

	@Override
	public boolean updateStageName(int stageId, String name) {
		if (stageDao.existsById(stageId)) {
			Stage stage = stageDao.findById(stageId).get();
			stage.setName(name);
			stageDao.save(stage);
			return true;
		}
		return false;
	}

	@Override
	public boolean updateInterviewOrder() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean deleteStage(int stageId) {
		if (stageDao.existsById(stageId)) {
			Stage stage = stageDao.findById(stageId).get();
			stageDao.delete(stage);
			return true;
		}
		return false;
	}

}
