package com.martscompany.restapi.controller;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.martscompany.restapi.service.UsuarioService;
import com.martscompany.restapi.model.Usuario;
import com.martscompany.restapi.model.RespuestaLogin;
import com.martscompany.restapi.DTO.Login;

@RestController
@RequestMapping(path="/usuario", method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE)
public class UsuarioController {
	
	
	@Autowired
	private  UsuarioService usuarioService;

	
	
	@PostMapping("/login")
	public RespuestaLogin loginGestor(@RequestBody Login usuarioLogin){
		return this.usuarioService.login(usuarioLogin);
	}
	
	//esta tomando Get como metodo http (URL)
	@GetMapping("/listaUsuarios")
	public List<Usuario> listaUsuario(){
		return this.usuarioService.listadoUsuario();
	}
	
	@PostMapping(path = "/registroUsuario")
	public Usuario registro(@RequestBody Usuario usuario) {
		return this.usuarioService.registro(usuario);
	}
	
	
	
}
