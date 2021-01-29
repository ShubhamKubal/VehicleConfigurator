package com.freelance.training.vehicle.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.freelance.training.vehicle.models.Configuration;
import com.freelance.training.vehicle.services.ConfigurationService;

@RestController
@RequestMapping("/api/v1")
@CrossOrigin( origins = "http://localhost:4200")
public class ConfigurationController {
	
	@Autowired
	private ConfigurationService confService;
	
	@GetMapping("/configurations")
	public List<Configuration> list(){
		return confService.listAll();
	}
	
	@GetMapping("/configurations/{varid}")
	public List<Configuration> listByVarId(@PathVariable String varid){
		return confService.listByVarId(varid);
	}

}
