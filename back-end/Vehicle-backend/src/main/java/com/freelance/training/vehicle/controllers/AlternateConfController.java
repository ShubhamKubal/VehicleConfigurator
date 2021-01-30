package com.freelance.training.vehicle.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.freelance.training.vehicle.models.AlternateConf;
import com.freelance.training.vehicle.services.AlternateConfService;

@RestController
@RequestMapping("/api/v1")
@CrossOrigin( origins = "http://localhost:4200")
public class AlternateConfController {
	
	@Autowired
	private AlternateConfService altService;
	
	@GetMapping("/alternateconfs")
	public List<AlternateConf> list(){
		return altService.listAll();
	}
	
	@GetMapping("/alternateconfs/{confid}")
	public List<AlternateConf> listByConfid(@PathVariable String confid){
		return altService.listAllByConfid(confid);
	}

}
