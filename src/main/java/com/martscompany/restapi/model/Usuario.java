package com.martscompany.restapi.model;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="Usuario")
public class Usuario {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="IDUSUARIO")
	Integer idUsuario;
	@Column(name="NOMBRES")
	String nombres;
	@Column(name="APELLIDOS")
	String apellidos;
	@Column(name="NUMERO_IDENTIFICACION_USUARIO")
	String  numeroIdentificacion;
	@Column(name="EPS")
	String eps;
	@Column(name="EMAIL")
	String email;
	@Column(name="TELEFONO")
	String telefono;
	@Column(name="CONTRASEÑA")
	String contraseña;
	
	public Usuario() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Usuario(Integer idUsuario, String nombres, String apellidos, String numeroIdentificacion, String eps,
			String email, String telefono, String contraseña) {
		super();
		this.idUsuario = idUsuario;
		this.nombres = nombres;
		this.apellidos = apellidos;
		this.numeroIdentificacion = numeroIdentificacion;
		this.eps = eps;
		this.email = email;
		this.telefono = telefono;
		this.contraseña = contraseña;
	}

	public Integer getIdUsuario() {
		return idUsuario;
	}

	public void setIdUsuario(Integer idUsuario) {
		this.idUsuario = idUsuario;
	}

	public String getNombres() {
		return nombres;
	}

	public void setNombres(String nombres) {
		this.nombres = nombres;
	}

	public String getApellidos() {
		return apellidos;
	}

	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	public String getNumeroIdentificacion() {
		return numeroIdentificacion;
	}

	public void setNumeroIdentificacion(String numeroIdentificacion) {
		this.numeroIdentificacion = numeroIdentificacion;
	}

	public String getEps() {
		return eps;
	}

	public void setEps(String eps) {
		this.eps = eps;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	public String getContraseña() {
		return contraseña;
	}

	public void setContraseña(String contraseña) {
		this.contraseña = contraseña;
	}

}
