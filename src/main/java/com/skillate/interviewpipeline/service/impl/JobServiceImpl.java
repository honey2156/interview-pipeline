package com.skillate.interviewpipeline.service.impl;

import java.util.LinkedList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.skillate.interviewpipeline.dao.JobDao;
import com.skillate.interviewpipeline.model.Job;
import com.skillate.interviewpipeline.model.Stage;
import com.skillate.interviewpipeline.service.JobService;

/**
 * @author Mandeep Singh
 *
 */
@Service("jobService")
public class JobServiceImpl implements JobService {

	@Autowired
	private JobDao jobDao;

	@Override
	public Job createJob(String name) {
		Job job = new Job();
		job.setName(name);
		job.setStages(new LinkedList<Stage>());
		return jobDao.save(job);
	}

	@Override
	public boolean updateJobName(int jobId, String name) {
		if (jobDao.existsById(jobId)) {
			Job job = jobDao.findById(jobId).get();
			job.setName(name);
			jobDao.save(job);
			return true;
		}
		return false;
	}

	@Override
	public boolean deleteJob(int jobId) {
		if (jobDao.existsById(jobId)) {
			Job job = jobDao.findById(jobId).get();
			jobDao.delete(job);
			return true;
		}
		return false;
	}

	@Override
	public boolean updateStageOrder(List<Stage> stages) {
		// TODO Auto-generated method stub
		return false;
	}

}
