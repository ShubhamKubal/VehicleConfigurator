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
	
	public List<Configuration> listByVarId(String varid){
		return confRepo.findByVarId(Long.parseLong(varid));
	}

}
