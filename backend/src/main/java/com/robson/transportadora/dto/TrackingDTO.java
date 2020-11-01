package com.robson.transportadora.dto;

import java.time.Instant;

import com.robson.transportadora.entities.Tracking;
import com.robson.transportadora.entities.ununs.TrackingStatus;

public class TrackingDTO {

	private Long id;
	private String location;
	private Instant moment;
	private Integer status;
	
	public TrackingDTO() {
		
	}

	public TrackingDTO(Long id, String location, Instant moment, TrackingStatus status) {
		super();
		this.id = id;
		this.location = location;
		this.moment = moment;
		setStatus(status);
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

	public String getStatus() {
		return TrackingStatus.valueOf(status).getDescricao();
	}

	public void setStatus(TrackingStatus trackingStatus) {
		if (trackingStatus != null) {
			this.status = trackingStatus.getCode();			
		}
	}
}
