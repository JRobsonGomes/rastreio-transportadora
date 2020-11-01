package com.robson.transportadora.entities;

import java.io.Serializable;
import java.time.Instant;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.robson.transportadora.entities.ununs.TrackingStatus;

@Entity
@Table(name = "tb_tracking")
public class Tracking implements Serializable {
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String location;
	private Instant moment;
	private Integer status;

	@ManyToOne
	@JoinColumn(name = "order_id")
	private Order order;
	
	public Tracking() {
		
	}

	public Tracking(Long id, String location, Instant moment, TrackingStatus status, Order order) {
		super();
		this.id = id;
		this.location = location;
		this.moment = moment;
		this.order = order;
		setStatus(status);
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

	public TrackingStatus getStatus() {
		return TrackingStatus.valueOf(status);
	}

	public void setStatus(TrackingStatus trackingStatus) {
		if (trackingStatus != null) {
			this.status = trackingStatus.getCode();			
		}
	}
	
	@JsonIgnore
	public Order getOrder() {
		return order;
	}

	public void setOrder(Order order) {
		this.order = order;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Tracking other = (Tracking) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}
}
