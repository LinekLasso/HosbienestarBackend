package com.martscompany.restapi.DTO; 

public class Login {
	
	String email;
	String contrasena;
	
	public Login() {
		// TODO Auto-generated constructor stub
	}
	
	public Login(String email, String contrasena) {
		super();
		this.email = email;
		this.contrasena = contrasena;
	}
	
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getContrasena() {
		return contrasena;
	}
	public void setContrasena(String contrasena) {
		this.contrasena = contrasena;
	}
	
	

}
