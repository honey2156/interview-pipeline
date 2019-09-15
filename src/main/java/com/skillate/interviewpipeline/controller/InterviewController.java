package com.skillate.interviewpipeline.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RestController;

import com.skillate.interviewpipeline.model.Interview;

/**
 * @author Mandeep Singh
 *
 */
@RestController
public class InterviewController {

	@GetMapping
	public ResponseEntity<Interview> getInterviews() {
		return null;
	}

	@GetMapping
	public ResponseEntity<Interview> getInterview() {
		return null;
	}

	@PostMapping
	public ResponseEntity<Interview> addInterview() {
		return null;
	}

	@PutMapping
	public ResponseEntity<Interview> updateInterview() {
		return null;
	}

	@DeleteMapping
	public ResponseEntity<Interview> deleteInterview() {
		return null;
	}
}
