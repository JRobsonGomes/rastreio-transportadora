package com.robson.transportadora.dto;

import java.time.Instant;

import com.robson.transportadora.entities.Tracking;

public class TrackingDTO {

	private Long id;
	private String location;
	private Instant moment;
	private Integer status;
	
	public TrackingDTO() {
		
	}

	public TrackingDTO(Long id, String location, Instant moment, Integer status) {
		super();
		this.id = id;
		this.location = location;
		this.moment = moment;
		this.status = status;
	}
	
	public TrackingDTO(Tracking entity) {
		this.id = entity.getId();
		this.location = entity.getLocation();
		this.moment = entity.getMoment();
		this.status = entity.getStatus().getCode();
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public Instant getMoment() {
		return moment;
	}

	public void setMoment(Instant moment) {
		this.moment = moment;
	}

	public Integer getStatus() {
		return status;
	}

	public void setStatus(Integer status) {
		this.status = status;
	}
}
