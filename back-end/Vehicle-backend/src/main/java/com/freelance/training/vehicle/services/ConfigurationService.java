package com.freelance.training.vehicle.services;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.freelance.training.vehicle.models.Configuration;
import com.freelance.training.vehicle.repositories.ConfigurationRepository;

@Service
@Transactional
public class ConfigurationService {
	
	@Autowired
	private ConfigurationRepository confRepo;
	
	public List<Configuration> listAll(){
		return confRepo.findAll();
	}
	
	public List<Configuration> listAllByVarId(String varid){
		return confRepo.findByVarId(Long.parseLong(varid));
	}
	
	public List<Configuration> listDefaultByVarid(String varid){
		return confRepo.findDefaultByVarid(Long.parseLong(varid));
	}
	
	public List<Configuration> listInteriorByVarid(String varid){
		return confRepo.findInteriorByVarid(Long.parseLong(varid));
	}
	
	public List<Configuration> listExteriorByVarid(String varid){
		return confRepo.findExteriorByVarid(Long.parseLong(varid));
	}
	
	public List<Configuration> listAccessoriesByVarid(String varid){
		return confRepo.findAccessoriesByVarid(Long.parseLong(varid));
	}
	
	public List<Configuration> listDefaultConfigurableByVarid(String varid){
		return confRepo.findDefaultConfigurableByVarid(Long.parseLong(varid));
	}
	
	public List<Configuration> listInteriorConfigurableByVarid(String varid){
		return confRepo.findInteriorConfigurableByVarid(Long.parseLong(varid));
	}
	
	public List<Configuration> listExteriorConfigurableByVarid(String varid){
		return confRepo.findExteriorConfigurableByVarid(Long.parseLong(varid));
	}
	
	public List<Configuration> listAccessoriesConfigurableByVarid(String varid){
		return confRepo.findAccessoriesConfigurableByVarid(Long.parseLong(varid));
	}

}
