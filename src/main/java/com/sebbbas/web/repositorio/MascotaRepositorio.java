package com.sebbbas.web.repositorio;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.sebbbas.web.entidades.Mascota;

@Repository
public interface MascotaRepositorio extends JpaRepository<Mascota, Long> {

	
}
