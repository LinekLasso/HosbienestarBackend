package com.martscompany.restapi.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import com.martscompany.restapi.model.Medicamentos;

public interface MedicamentosRepository extends JpaRepository<Medicamentos,Integer>{

	List<Medicamentos> findByNumeroIdentificacionUsuario(String numeroIdentificacionUsuario);
 }
