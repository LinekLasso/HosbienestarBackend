package com.martscompany.restapi.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

import jakarta.persistence.Column;

@Entity
@Table(name="medicamentos")
public class Medicamentos {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="IDMEDICAMENTOS")
	Integer idMedicamentos;
	@Column(name="NUMERO_IDENTIFICACION_USUARIO")
	String  numeroIdentificacionUsuario;
	@Column(name="NOMBRE_MEDICAMENTO")
	String nombreMedicamento;
	@Column(name="CONCENTRACION")
	String  concentracion;
	@Column(name="LOTE")
	String lote;
	@Column(name="CANTIDAD")
	String cantidad;
	@Column(name="REGISTRO_INVIMA")
	String registroInvima;
	@Column(name="FECHA_VENCIMIENTO")
	String fechaVencimiento;
	@Column(name="VIA")
	String via;
	@Column(name="DOSIS")
	String dosis;
	@Column(name="FRECUENCIA_HORAS")
	String frecuenciaHoras;
	
	public Medicamentos() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Medicamentos(Integer idMedicamentos, String numeroIdentificacionUsuario, String nombreMedicamento,
			String concentracion, String lote, String cantidad, String registroInvima, String fechaVencimiento,
			String via, String dosis, String frecuenciaHoras) {
		super();
		this.idMedicamentos = idMedicamentos;
		this.numeroIdentificacionUsuario = numeroIdentificacionUsuario;
		this.nombreMedicamento = nombreMedicamento;
		this.concentracion = concentracion;
		this.lote = lote;
		this.cantidad = cantidad;
		this.registroInvima = registroInvima;
		this.fechaVencimiento = fechaVencimiento;
		this.via = via;
		this.dosis = dosis;
		this.frecuenciaHoras = frecuenciaHoras;
	}

	public Integer getIdMedicamentos() {
		return idMedicamentos;
	}

	public void setIdMedicamentos(Integer idMedicamentos) {
		this.idMedicamentos = idMedicamentos;
	}

	public String getNumeroIdentificacionUsuario() {
		return numeroIdentificacionUsuario;
	}

	public void setNumeroIdentificacionUsuario(String numeroIdentificacionUsuario) {
		this.numeroIdentificacionUsuario = numeroIdentificacionUsuario;
	}

	public String getNombreMedicamento() {
		return nombreMedicamento;
	}

	public void setNombreMedicamento(String nombreMedicamento) {
		this.nombreMedicamento = nombreMedicamento;
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

	public String getFechaVencimiento() {
		return fechaVencimiento;
	}

	public void setFechaVencimiento(String fechaVencimiento) {
		this.fechaVencimiento = fechaVencimiento;
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

	

