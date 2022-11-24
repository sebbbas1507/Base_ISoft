package com.sebbbas.web.entidades;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name ="veterinarios")
public class Veterinaria {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	
	@Column(name = "nombre_veterinario",nullable = false, length =50)
	private String nombre_veterinario;
	
	public Veterinaria() {
		
	}

	public Veterinaria(Integer id, String nombre_veterinario) {
		super();
		this.id = id;
		this.nombre_veterinario = nombre_veterinario;
	}
	
	public Veterinaria(Integer id) {
		super();
		this.id = id;
	}
	
	public Veterinaria(String nombre_veterinario) {
		super();
		this.nombre_veterinario = nombre_veterinario;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNombre_veterinario() {
		return nombre_veterinario;
	}

	public void setNombre_veterinario(String nombre_veterinario) {
		this.nombre_veterinario = nombre_veterinario;
	}
	
	

	


	
}
