package com.sebbbas.web.controlador;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.sebbbas.web.entidades.Cita;
import com.sebbbas.web.entidades.Veterinaria;
import com.sebbbas.web.repositorio.CitaRepositorio;
import com.sebbbas.web.repositorio.VeterinariaRepositorio;

@Controller
public class CitaControlador {

	@Autowired
	private CitaRepositorio citaRepositorio;
	
	
	@Autowired
	private VeterinariaRepositorio veterinariaRepositorio
	;
	@GetMapping("cita/nueva")
	public String mostrarFormularioDeCita( Model modelo) {
		List<Veterinaria> listaVeterinarios = veterinariaRepositorio.findAll();
		modelo.addAttribute("cita", new Cita());
		modelo.addAttribute("listaVeterinarios", listaVeterinarios);
		return "cita_formulario";
	}
	
	@PostMapping("/citas/guardar")
	public String guardarCita(Cita cita) {
		citaRepositorio.save(cita);
		return "redirect:/";
	}
}
