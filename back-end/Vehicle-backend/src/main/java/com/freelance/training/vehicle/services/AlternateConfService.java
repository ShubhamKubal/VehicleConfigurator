package com.freelance.training.vehicle.services;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.freelance.training.vehicle.models.AlternateConf;
import com.freelance.training.vehicle.repositories.AlternateConfRepository;

@Service
@Transactional
public class AlternateConfService {
	
	@Autowired
	private AlternateConfRepository altRepo;
	
	public List<AlternateConf> listAll(){
		return altRepo.findAll();
	}
	
	public List<AlternateConf> listAllByConfid(String confid){
		return altRepo.findByConfid(Long.parseLong(confid));
	}

}
