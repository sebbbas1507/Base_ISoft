package com.sebbbas.web.controlador;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
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
	@GetMapping("/mascotas/editar/{id}")
	public String mostrarFormularioDeEditar(@PathVariable Long id, Model modelo) {
		modelo.addAttribute("mascota", servicio.obtenerMascotaPorId(id));
		return "editar_mascota";
	}
	@PostMapping("/maascotas/{id}")
	public String actualizarMascota(@PathVariable Long id,@ModelAttribute("mascota") Mascota mascota, Model modelo) {
		Mascota mascotaExistente = servicio.obtenerMascotaPorId(id);
		mascotaExistente.setId(id);
		mascotaExistente.setNombre(mascota.getNombre());
		mascotaExistente.setIdentificacion(mascota.getIdentificacion());
		mascotaExistente.setContrasena(mascota.getContrasena());
		mascotaExistente.setTipo_animal(mascota.getTipo_animal());
		mascotaExistente.setRaza(mascota.getRaza());
		mascotaExistente.setSexo(mascota.getSexo());
		mascotaExistente.setEdad(mascota.getEdad());
		mascotaExistente.setNombre_dueno(mascota.getNombre_dueno());
		mascotaExistente.setCelular(mascota.getCelular());
		mascotaExistente.setDireccion(mascota.getDireccion());
		servicio.actualizarMascota(mascotaExistente);
		return "redirect:/mascota";
	}
	
	@GetMapping("/mascotas/{id}")
	public String eliminarMascota(@PathVariable Long id) {
		servicio.eliminarMascota(id);
		return "redirect:/mascotas";
	}

}
