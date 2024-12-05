package com.martscompany.restapi.controller;


import java.util.List;

import org.springframework.http.MediaType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.martscompany.restapi.model.Medicamentos;
import com.martscompany.restapi.service.MedicamentosService;

@RestController
@RequestMapping(path="/medicamentos", method = RequestMethod.GET)
public class MedicamentosController {


	@Autowired
	private final  MedicamentosService medicamentosService;
	
	public MedicamentosController(MedicamentosService medicamentosService) {
		this.medicamentosService = medicamentosService;
	}

	@GetMapping("/medicamentosUsuario")
	public List<Medicamentos> medicamentosIdentificacion(@RequestParam String identificacion){
		return this.medicamentosService.consultaMedicamentosIdentificacion(identificacion);
	}
	
	
}
