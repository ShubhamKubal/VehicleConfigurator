package com.freelance.training.vehicle.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@JsonIgnoreProperties( { "hibernateLazyInitializer", "handler" } )
public class Segment {
	
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long seg_id;
	private String seg_name;
	
	public Long getSeg_id() {
		return seg_id;
	}
	public void setSeg_id(Long seg_id) {
		this.seg_id = seg_id;
	}
	public String getSeg_name() {
		return seg_name;
	}
	public void setSeg_name(String seg_name) {
		this.seg_name = seg_name;
	}

}
