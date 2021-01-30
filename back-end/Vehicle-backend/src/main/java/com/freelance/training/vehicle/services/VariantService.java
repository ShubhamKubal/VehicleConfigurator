package com.freelance.training.vehicle.services;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.freelance.training.vehicle.models.Variant;
import com.freelance.training.vehicle.repositories.VariantRepository;

/**
 * communicates with DAO layer to perform CRUD operations on variant table
 * @author shubham
 *
 */
@Service
@Transactional
public class VariantService {
	
	@Autowired
	private VariantRepository variantRepo;
	
	/**
	 * returns variants from variant table
	 * @return List<Variant>
	 */
	public List<Variant> listAll(){
		return variantRepo.findAll();
	}
	
	/**
	 * returns variants which are belongs to particular segment and manufacturer
	 * @param segid
	 * @param manid
	 * @return List<Variant>
	 */
	public List<Variant> listBySegidAndManid(String segid,String manid){
		return variantRepo.findBySegidAndManid(Long.parseLong(segid), Long.parseLong(manid));
	}

}
