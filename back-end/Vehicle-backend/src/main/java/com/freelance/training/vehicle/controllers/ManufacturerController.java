package com.freelance.training.vehicle.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.freelance.training.vehicle.models.Manufacturer;
import com.freelance.training.vehicle.services.ManufacturerService;

@RestController
@RequestMapping("/api/v1")
public class ManufacturerController {
	
	@Autowired
	private ManufacturerService manService;
	
	@GetMapping("/manufacturers")
	public List<Manufacturer> list(){
		return manService.listAll();
	}
	
	

}
