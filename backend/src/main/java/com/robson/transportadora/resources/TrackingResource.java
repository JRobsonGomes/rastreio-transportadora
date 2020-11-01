package com.robson.transportadora.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.robson.transportadora.dto.TrackingDTO;
import com.robson.transportadora.services.TrackingService;

@RestController
@RequestMapping(value = "/trackings")
public class TrackingResource {

	@Autowired 
	private TrackingService service;
	
	@GetMapping
	public ResponseEntity<List<TrackingDTO>> findAll() {
		List<TrackingDTO> list = service.findAll();
		return ResponseEntity.ok().body(list);
	}

	@GetMapping(value = "/{id}")
	public ResponseEntity<TrackingDTO> findById(@PathVariable Long id) {
		TrackingDTO obj = service.findById(id);
		return ResponseEntity.ok().body(obj);
	}
}
