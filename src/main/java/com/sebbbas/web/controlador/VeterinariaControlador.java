package com.sebbbas.web.controlador;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.sebbbas.web.entidades.Veterinaria;
import com.sebbbas.web.repositorio.VeterinariaRepositorio;

@Controller
public class VeterinariaControlador {

	@Autowired
	private VeterinariaRepositorio veterinariaRepositorio;
	
	@GetMapping("/veterinarios")
	public String listarVeterinarios(Model modelo) {
		List<Veterinaria> listaVeterinarios = veterinariaRepositorio.findAll();
		modelo.addAttribute("listaVeterinarios", listaVeterinarios);
		return "veterinarios";
	}
	@GetMapping("/veterinarios/nuevo")
	public String mostrarFormularioDeNuevoVeterinario(Model modelo) {
		modelo.addAttribute("veterinaria", new Veterinaria());
		return "veterinaria_formulario";
	}
	
	@PostMapping("/veterinarios/guardar")
	public String guardarVeterinaria(Veterinaria veterinaria) {
		veterinariaRepositorio.save(veterinaria);
		return "redirect:/veterinarios";
	}
	
	
}
