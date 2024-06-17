package com.martscompany.restapi.service;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.martscompany.restapi.repository.UsuarioRepository;
import com.martscompany.restapi.model.Usuario;



@Service
public class UsuarioService {

		@Autowired
		private final UsuarioRepository usuarioRepository;
		
		public UsuarioService(UsuarioRepository usuarioRepository) {
			this.usuarioRepository = usuarioRepository;
		}
		
		//datos de  usuario
		/*
		 * La funcion es publica
		 * Retorna una lista de Usuarios "List<Usuario>
		 * el nombre de la funcion es listadoUsuario 
		 * esta funcion llama al repositorio "usuarioRepository y utiliza el metodo findAll (buscar todo)
		 * se llama en el return para que este tambien le retorne al Controller
		 * */
		public List<Usuario> listadoUsuario(){
			return this.usuarioRepository.findAll();
		}
		
		public Usuario registro(Usuario usuario) {
			Usuario existeUsuario = new Usuario();
			existeUsuario = this.usuarioRepository.findByNumeroIdentificacion(usuario.getNumeroIdentificacion());
			if (existeUsuario.getNumeroIdentificacion() != null) {
				System.out.print("El usuario ya existe");
				existeUsuario.setNombres("El Usuario ya existe");
				return existeUsuario;
			} else {
				return this.usuarioRepository.save(usuario);
			}
		}
}
