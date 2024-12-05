package com.martscompany.restapi.DTO;

public class Medicamentos {

	String idMedicamentos;
	String numeroIdentificacionUsuario;
	String concentracion;
	String lote;
	String cantidad;
	String registroInvima;
	String fechaVendicimiento;
	String usuarioIdUsuario;
	String via;
	String dosis;
	String frecuenciaHoras;
	
	public Medicamentos() {
		// TODO Auto-generated constructor stub
	}
	
	public Medicamentos(String idMedicamentos, String numeroIdentificacionUsuario, String nombreMedicamento, String concentracion, String lote,
			String cantidad, String registroInvima, String fechaVendicimiento, String usuarioIdUsuario, String via, String dosis, String frecuenciaHoras) {
		super();
		this.idMedicamentos = idMedicamentos;
		this.numeroIdentificacionUsuario = numeroIdentificacionUsuario;
		this.concentracion = concentracion;
		this.lote = lote;
		this.cantidad = cantidad;
		this.registroInvima = registroInvima;
		this.fechaVendicimiento = fechaVendicimiento;
		this.usuarioIdUsuario = usuarioIdUsuario;
		this.via = via;
		this.dosis = dosis;
		this.frecuenciaHoras = frecuenciaHoras;
	}

	
	public String getIdMedicamentos() {
		return idMedicamentos;
	}
	public void setIdMedicamentos(String idMedicamentos) {
		this.idMedicamentos = idMedicamentos;
	}
	public String getNumeroIdentificacionUsuario() {
		return numeroIdentificacionUsuario;
	}
	public void setNumeroIdentificacionUsuario(String numeroIdentificacionUsuario) {
		this.numeroIdentificacionUsuario = numeroIdentificacionUsuario;
	}
	public String getConcentracion() {
		return concentracion;
	}
	public void setConcentracion(String concentracion) {
		this.concentracion = concentracion;
	}
	public String getLote() {
		return lote;
	}
	public void setLote(String lote) {
		this.lote = lote;
	}
	public String getCantidad() {
		return cantidad;
	}
	public void setCantidad(String cantidad) {
		this.cantidad = cantidad;
	}
	public String getRegistroInvima() {
		return registroInvima;
	}
	public void setRegistroInvima(String registroInvima) {
		this.registroInvima = registroInvima;
	}
	public String getFechaVendicimiento() {
		return fechaVendicimiento;
	}
	public void setFechaVendicimiento(String fechaVendicimiento) {
		this.fechaVendicimiento = fechaVendicimiento;
	}
	public String getUsuarioIdUsuario() {
		return usuarioIdUsuario;
	}
	public void setUsuarioIdUsuario(String usuarioIdUsuario) {
		this.usuarioIdUsuario = usuarioIdUsuario;
	}
	public String getVia() {
		return via;
	}
	public void setVia(String via) {
		this.via = via;
	}
	public String getDosis() {
		return dosis;
	}
	public void setDosis(String dosis) {
		this.dosis = dosis;
	}
	public String getFrecuenciaHoras() {
		return frecuenciaHoras;
	}
	public void setFrecuenciaHoras(String frecuenciaHoras) {
		this.frecuenciaHoras = frecuenciaHoras;
	}

	
}
