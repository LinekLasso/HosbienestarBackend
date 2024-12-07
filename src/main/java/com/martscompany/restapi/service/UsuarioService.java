package com.martscompany.restapi.service;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.martscompany.restapi.repository.UsuarioRepository;
import com.martscompany.restapi.model.RespuestaLogin;
import com.martscompany.restapi.model.Usuario;
import com.martscompany.restapi.DTO.Login;

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
		
		public RespuestaLogin registro(Usuario usuario) {
			Usuario existeUsuario = this.usuarioRepository.findByEmailOrNumeroIdentificacion(usuario.getEmail(), usuario.getNumeroIdentificacion());
			RespuestaLogin respuesta = new RespuestaLogin();
			if(existeUsuario == null ) {
				respuesta.setErrores(0);
				respuesta.setMensaje("Registro exitoso");
				respuesta.setUsuario(this.usuarioRepository.save(usuario));
			}else {
				respuesta.setErrores(-1);
				respuesta.setMensaje("El usuario ya se encuentra registrado en base de datos");
			}
			return respuesta;	
		}
		
		
		public RespuestaLogin login(Login usuarioLogin){
			Usuario existeUsuario = this.usuarioRepository.findByEmailAndContrasena(usuarioLogin.getEmail(), usuarioLogin.getContrasena());
			RespuestaLogin respuesta = new RespuestaLogin();
			if(existeUsuario != null ) {
				respuesta.setErrores(0);
				respuesta.setMensaje("login exitoso");
				respuesta.setUsuario(existeUsuario);
			}else {
				respuesta.setErrores(-1);
				respuesta.setMensaje("correo o contraseña incorrectos");
			}
			
			return respuesta;
		}
		
}
