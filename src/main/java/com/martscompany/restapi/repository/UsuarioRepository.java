package com.martscompany.restapi.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.martscompany.restapi.model.Usuario;

public interface UsuarioRepository extends JpaRepository<Usuario, Integer> {

	Usuario findByNumeroIdentificacion(String identificacion);
}
