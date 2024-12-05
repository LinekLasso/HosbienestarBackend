package com.martscompany.restapi.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.martscompany.restapi.model.Medicamentos;
import com.martscompany.restapi.repository.MedicamentosRepository;

@Service
public class MedicamentosService {
	
	@Autowired 
	private final MedicamentosRepository medicamentosRepository;
	
	public MedicamentosService(MedicamentosRepository medicamentosRepository) {
		this.medicamentosRepository = medicamentosRepository;
	}
	
	public List<Medicamentos> consultaMedicamentosIdentificacion(String identificacion) {
		return  this.medicamentosRepository.findByNumeroIdentificacionUsuario(identificacion);
	}
	
	/*
	public Medicamentos medicamentos (Medicamentos medicamentos) {
		return this.medicamentosRepository.save(medicamentos);			
	}
	*/
}
