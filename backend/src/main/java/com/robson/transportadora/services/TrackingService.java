package com.robson.transportadora.services;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.robson.transportadora.dto.TrackingDTO;
import com.robson.transportadora.entities.Tracking;
import com.robson.transportadora.repositories.TrackingRepository;


@Service
public class TrackingService {

	@Autowired
	private TrackingRepository repository;

	@Transactional(readOnly = true)
	public List<TrackingDTO> findAll() {
		List<Tracking> list = repository.findAll();
		return list.stream().map(x -> new TrackingDTO(x)).collect(Collectors.toList());
	}

	@Transactional(readOnly = true)
	public TrackingDTO findById(Long id) {
		Optional<Tracking> obj = repository.findById(id);
		Tracking entity = obj.orElseThrow(() -> new RuntimeException("Recurso não encontrado"));
		return new TrackingDTO(entity);
	}
}
