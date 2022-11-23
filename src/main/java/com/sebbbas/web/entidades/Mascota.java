package com.sebbbas.web.entidades;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name ="mascotas")
public class Mascota {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(name= "nombre", nullable = false, length = 50)
	private String nombre;
	
	@Column(name = "identificacion",nullable = false, length =50, unique = true)
	private int identificacion;
	
	@Column(name = "contrasena",nullable = false, length =50)
	private String contrasena;
	
	@Column(name = "tipo_animal",nullable = false, length =50)
	private String tipo_animal;
	
	@Column(name = "raza",nullable = false, length =50)
	private String raza;
	
	@Column(name = "edad",nullable = false, length =50)
	private int edad;
	
	@Column(name = "sexo",nullable = false, length =50)
	private String sexo;
	
	@Column(name = "nombre_dueno",nullable = false, length =50)
	private String nombre_dueno;
	
	@Column(name = "celular",nullable = false, length =50)
	private int celular;
	
	@Column(name = "direccion",nullable = false, length =50)
	private String direccion;
	
	
	public Mascota() {
		
	}


	public Mascota(Long id, String nombre, int identificacion, String contrasena, String tipo_animal, String raza,
			int edad, String sexo, String nombre_dueno, int celular, String direccion) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.identificacion = identificacion;
		this.contrasena = contrasena;
		this.tipo_animal = tipo_animal;
		this.raza = raza;
		this.edad = edad;
		this.sexo = sexo;
		this.nombre_dueno = nombre_dueno;
		this.celular = celular;
		this.direccion = direccion;
	}

	public Mascota( String nombre, int identificacion, String contrasena, String tipo_animal, String raza,
			int edad, String sexo, String nombre_dueno, int celular, String direccion) {
		super();
		this.nombre = nombre;
		this.identificacion = identificacion;
		this.contrasena = contrasena;
		this.tipo_animal = tipo_animal;
		this.raza = raza;
		this.edad = edad;
		this.sexo = sexo;
		this.nombre_dueno = nombre_dueno;
		this.celular = celular;
		this.direccion = direccion;
	}

	public Long getId() {
		return id;
	}


	public void setId(Long id) {
		this.id = id;
	}


	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public int getIdentificacion() {
		return identificacion;
	}


	public void setIdentificacion(int identificacion) {
		this.identificacion = identificacion;
	}


	public String getContrasena() {
		return contrasena;
	}


	public void setContrasena(String contrasena) {
		this.contrasena = contrasena;
	}


	public String getTipo_animal() {
		return tipo_animal;
	}


	public void setTipo_animal(String tipo_animal) {
		this.tipo_animal = tipo_animal;
	}


	public String getRaza() {
		return raza;
	}


	public void setRaza(String raza) {
		this.raza = raza;
	}


	public int getEdad() {
		return edad;
	}


	public void setEdad(int edad) {
		this.edad = edad;
	}


	public String getSexo() {
		return sexo;
	}


	public void setSexo(String sexo) {
		this.sexo = sexo;
	}


	public String getNombre_dueno() {
		return nombre_dueno;
	}


	public void setNombre_dueno(String nombre_dueno) {
		this.nombre_dueno = nombre_dueno;
	}


	public int getCelular() {
		return celular;
	}


	public void setCelular(int celular) {
		this.celular = celular;
	}


	public String getDireccion() {
		return direccion;
	}


	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}


	@Override
	public String toString() {
		return "Mascota [id=" + id + ", nombre=" + nombre + ", identificacion=" + identificacion + ", contrasena="
				+ contrasena + ", tipo_animal=" + tipo_animal + ", raza=" + raza + ", edad=" + edad + ", sexo=" + sexo
				+ ", nombre_dueno=" + nombre_dueno + ", celular=" + celular + ", direccion=" + direccion + "]";
	}
 
	
	
}
