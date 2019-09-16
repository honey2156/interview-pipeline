package com.skillate.interviewpipeline.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.skillate.interviewpipeline.model.Stage;

/**
 * @author Mandeep Singh
 *
 */
@RestController
@RequestMapping(value = "/stages")
public class StageController {

	@GetMapping
	public ResponseEntity<Stage> getStages() {
		return null;
	}

	@GetMapping(value = "/stageId")
	public ResponseEntity<Stage> getStage() {
		return null;
	}

	@PostMapping
	public ResponseEntity<Stage> addStage() {
		return null;
	}

	@PutMapping
	public ResponseEntity<Stage> updateStage() {
		return null;
	}

	@DeleteMapping
	public ResponseEntity<Stage> deleteStage() {
		return null;
	}
}
