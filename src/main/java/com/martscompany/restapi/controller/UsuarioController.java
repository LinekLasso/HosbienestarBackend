package com.martscompany.restapi.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.martscompany.restapi.service.UsuarioService;
import com.martscompany.restapi.model.Usuario;


@RestController
@RequestMapping(path="/usuario")
public class UsuarioController {
	
	
	@Autowired
	private  UsuarioService usuarioService;
	
	/*
	@PostMapping("/login")
	public Optional<Usuario> loginGestor(@RequestBody Usuario body){
		Usuario usuario = new Usuario();
		
		usuario.setCorreo(body.getCorreo());
		usuario.setContraseña(body.getContraseña());
		
		
		Object usuarioService;
		return (() usuarioService).loginUsuario(usuario.getCorreo(), usuario.getContraseña());
	}
	*/

	
	//esta tomando Get como metodo http (URL)
	@GetMapping("/listaUsuarios")
	public List<Usuario> listaUsuario(){
		return this.usuarioService.listadoUsuario();
	}
	
	@PostMapping("/registroUsuario")
	public Usuario registro(@RequestBody Usuario usuario) {

		return this.usuarioService.registro(usuario);
	}
	
	
	
}
