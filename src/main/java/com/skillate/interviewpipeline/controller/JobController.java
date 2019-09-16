package com.skillate.interviewpipeline.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.skillate.interviewpipeline.model.Job;

/**
 * @author Mandeep Singh
 *
 */
@RestController
@RequestMapping(value = "/jobs")
public class JobController {

	@GetMapping()
	public ResponseEntity<Job> getJobs() {
		return null;
	}

	@GetMapping(value = "/{jobId}")
	public ResponseEntity<Job> getJob(@PathVariable("jobId") int jobId) {
		return null;
	}

	@PostMapping
	public ResponseEntity<Job> addJob(@RequestBody Job job) {
		return null;
	}

	@PutMapping(value = "/{jobId}")
	public ResponseEntity<Job> updateJob(@PathVariable("jobId") int jobId, @RequestBody Job job) {
		return null;
	}

	@DeleteMapping(value = "/{jobId}")
	public ResponseEntity<Job> deleteJob(@PathVariable("jobId") int jobId) {
		return null;
	}
}
