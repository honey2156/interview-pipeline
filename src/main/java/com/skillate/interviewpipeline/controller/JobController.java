package com.skillate.interviewpipeline.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RestController;

import com.skillate.interviewpipeline.model.Job;

/**
 * @author Mandeep Singh
 *
 */
@RestController
public class JobController {

	@GetMapping
	public ResponseEntity<Job> getJobs() {
		return null;
	}

	@GetMapping
	public ResponseEntity<Job> getJob() {
		return null;
	}

	@PostMapping
	public ResponseEntity<Job> addJob() {
		return null;
	}

	@PutMapping
	public ResponseEntity<Job> updateJob() {
		return null;
	}

	@DeleteMapping
	public ResponseEntity<Job> deleteJob() {
		return null;
	}
}
