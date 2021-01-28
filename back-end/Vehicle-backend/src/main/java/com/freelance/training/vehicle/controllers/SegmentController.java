package com.freelance.training.vehicle.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.freelance.training.vehicle.models.Segment;
import com.freelance.training.vehicle.services.SegmentService;

@RestController
@RequestMapping("/api/v1")
public class SegmentController {
	
	@Autowired
	private SegmentService segmentService;
	
	@GetMapping("/segments")
	public List<Segment> list(){
		return segmentService.listAll();
	}

}
