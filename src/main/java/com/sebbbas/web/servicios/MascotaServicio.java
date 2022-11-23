package com.sebbbas.web.servicios;

import java.util.List;

import com.sebbbas.web.entidades.Mascota;

public interface MascotaServicio {

	public List<Mascota> listarTodasLasMascotas();
	
	public Mascota guardarMascota(Mascota mascota);
}
