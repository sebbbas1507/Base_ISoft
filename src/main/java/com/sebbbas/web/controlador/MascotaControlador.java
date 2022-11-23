package com.sebbbas.web.controlador;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.sebbbas.web.entidades.Mascota;
import com.sebbbas.web.servicios.MascotaServicio;

@Controller
public class MascotaControlador {
	
	@Autowired
	private MascotaServicio servicio;
	
	@GetMapping({"/mascotas","/"})
	public String listarMascotas(Model modelo) {
		modelo.addAttribute("mascotas", servicio.listarTodasLasMascotas());
		return "mascotas";
	}
	@GetMapping("/mascotas/nuevo")
	public String crearMascotaFormulario(Model modelo) {
		Mascota mascota = new Mascota();
		modelo.addAttribute("mascota", mascota);
		return "crear_mascota";
	}
	@PostMapping("/mascotas")
	public String guardarMascota(@ModelAttribute("mascota") Mascota mascota) {
		servicio.guardarMascota(mascota);
		return "redirect:mascotas";
	}

}
