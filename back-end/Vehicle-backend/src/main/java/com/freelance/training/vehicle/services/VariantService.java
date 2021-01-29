package com.freelance.training.vehicle.services;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.freelance.training.vehicle.models.Variant;
import com.freelance.training.vehicle.repositories.VariantRepository;

@Service
@Transactional
public class VariantService {
	
	@Autowired
	private VariantRepository variantRepo;
	
	public List<Variant> listAll(){
		return variantRepo.findAll();
	}
	
	public List<Variant> listBySegidAndManid(String segid,String manid){
		return variantRepo.findBySedidAndManid(Long.parseLong(segid), Long.parseLong(manid));
	}

}
