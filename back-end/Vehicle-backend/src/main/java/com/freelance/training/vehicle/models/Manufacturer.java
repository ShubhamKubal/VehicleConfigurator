package com.freelance.training.vehicle.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@JsonIgnoreProperties( { "hibernateLazyInitializer", "handler" } )
public class Manufacturer {
	
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long man_id;
	private String man_name;
	public Long getMan_id() {
		return man_id;
	}
	public void setMan_id(Long man_id) {
		this.man_id = man_id;
	}
	public String getMan_name() {
		return man_name;
	}
	public void setMan_name(String man_name) {
		this.man_name = man_name;
	}

}
