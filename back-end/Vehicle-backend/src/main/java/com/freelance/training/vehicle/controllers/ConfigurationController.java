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
		return confService.listAllByVarId(varid);
	}
	
	@GetMapping("/configurations/default/{varid}")
	public List<Configuration> listDefaultByVarid(@PathVariable String varid){
		return confService.listDefaultByVarid(varid);
	}
	
	@GetMapping("/configurations/interior/{varid}")
	public List<Configuration> listInteriorByVarid(@PathVariable String varid){
		return confService.listInteriorByVarid(varid);
	}
	
	@GetMapping("/configurations/exterior/{varid}")
	public List<Configuration> listExteriorByVarid(@PathVariable String varid){
		return confService.listExteriorByVarid(varid);
	}
	
	@GetMapping("/configurations/accessories/{varid}")
	public List<Configuration> listAccessoriesByVarid(@PathVariable String varid){
		return confService.listAccessoriesByVarid(varid);
	}
	
	@GetMapping("/configurations/default/configurable/{varid}")
	public List<Configuration> listDefaultConfigurableByVarid(@PathVariable String varid){
		return confService.listDefaultConfigurableByVarid(varid);
	}
	
	@GetMapping("/configurations/interior/configurable/{varid}")
	public List<Configuration> listInteriorConfigurableByVarid(@PathVariable String varid){
		return confService.listInteriorConfigurableByVarid(varid);
	}
	
	@GetMapping("/configurations/exterior/configurable/{varid}")
	public List<Configuration> listExteriorConfigurableByVarid(@PathVariable String varid){
		return confService.listExteriorConfigurableByVarid(varid);
	}
	
	@GetMapping("/configurations/accessories/configurable/{varid}")
	public List<Configuration> listAccessoriesConfigurableByVarid(@PathVariable String varid){
		return confService.listAccessoriesConfigurableByVarid(varid);
	}

}
