package com.martscompany.restapi.model;

public class RespuestaLogin {
	
	public int errores;
	public String mensaje;
	public Usuario usuario;
	
	
	public RespuestaLogin(int errores, String mensaje, Usuario usuario) {
		super();
		this.errores = errores;
		this.mensaje = mensaje;
		this.usuario = usuario;
	}
	public Usuario getUsuario() {
		return usuario;
	}
	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}
	public RespuestaLogin(int errores, String mensaje) {
		super();
		this.errores = errores;
		this.mensaje = mensaje;
	}
	public RespuestaLogin() {
		// TODO Auto-generated constructor stub
	}
	public int getErrores() {
		return errores;
	}
	public void setErrores(int errores) {
		this.errores = errores;
	}
	public String getMensaje() {
		return mensaje;
	}
	public void setMensaje(String mensaje) {
		this.mensaje = mensaje;
	}
	
	

}
