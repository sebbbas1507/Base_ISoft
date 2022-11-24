package com.sebbbas.web.entidades;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity
public class Cita {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	
	@Column(name = "asunto_cita",nullable = false, length =128)
	private String asunto_cita;
	
	private String descripcion;
	
	private String fecha;
	
	@ManyToOne
	@JoinColumn(name= "veterinaria_id")
	private Veterinaria veterinaria;

	public Cita(Integer id, String asunto_cita, String descripcion, String fecha, Veterinaria veterinaria) {
		super();
		this.id = id;
		this.asunto_cita = asunto_cita;
		this.descripcion = descripcion;
		this.fecha = fecha;
		this.veterinaria = veterinaria;
	}

	public Cita() {
		super();
	}

	public Cita(String asunto_cita, String descripcion, String fecha, Veterinaria veterinaria) {
		super();
		this.asunto_cita = asunto_cita;
		this.descripcion = descripcion;
		this.fecha = fecha;
		this.veterinaria = veterinaria;
	}

	public Cita(String asunto_cita) {
		super();
		this.asunto_cita = asunto_cita;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getAsunto_cita() {
		return asunto_cita;
	}

	public void setAsunto_cita(String asunto_cita) {
		this.asunto_cita = asunto_cita;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public String getFecha() {
		return fecha;
	}

	public void setFecha(String fecha) {
		this.fecha = fecha;
	}

	public Veterinaria getVeterinaria() {
		return veterinaria;
	}

	public void setVeterinaria(Veterinaria veterinaria) {
		this.veterinaria = veterinaria;
	}


	
}
