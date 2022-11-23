package com.sebbbas.web.servicios;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sebbbas.web.entidades.Mascota;
import com.sebbbas.web.repositorio.MascotaRepositorio;

@Service
public class MascotaServicioImlp implements MascotaServicio {

	
	@Autowired
	private MascotaRepositorio repositorio;
	
	@Override
	public List<Mascota> listarTodasLasMascotas() {
		return repositorio.findAll();
	}

	@Override
	public Mascota guardarMascota(Mascota mascota) {
		return repositorio.save(mascota);
	}

}
