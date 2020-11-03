package com.robson.transportadora.dto;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import com.robson.transportadora.entities.Order;
import com.robson.transportadora.entities.Tracking;

public class OrderDTO implements Serializable {
	private static final long serialVersionUID = 1L;

	private Long id;
	private String description;
	
	private List<TrackingDTO> trackings = new ArrayList<>();
	
	public OrderDTO() {
		
	}

	public OrderDTO(Long id, String description) {
		this.id = id;
		this.description = description;
	}
	
	public OrderDTO(Order entity) {
		this.id = entity.getId();
		this.description = entity.getDescription();
	}
	
	public OrderDTO(Order entity, List<Tracking> trackings) {
		this(entity);
		trackings.forEach(tracking -> this.trackings.add(new  TrackingDTO(tracking)));
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public List<TrackingDTO> getTrackings() {
		return trackings;
	}
}
