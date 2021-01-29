package com.freelance.training.vehicle.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.freelance.training.vehicle.models.Variant;
import com.freelance.training.vehicle.services.VariantService;

@RestController
@RequestMapping("/api/v1")
public class VariantController {
	
	@Autowired
	private VariantService variantService;
	
	@GetMapping("/variants")
	public List<Variant> list(){
		return variantService.listAll();
	}

}
