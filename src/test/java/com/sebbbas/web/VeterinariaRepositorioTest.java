package com.sebbbas.web;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase.Replace;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.annotation.Rollback;

import com.sebbbas.web.entidades.Veterinaria;
import com.sebbbas.web.repositorio.VeterinariaRepositorio;

@DataJpaTest
@AutoConfigureTestDatabase(replace = Replace.NONE)
@Rollback(false)
public class VeterinariaRepositorioTest {

	@Autowired
	private VeterinariaRepositorio repositorio;
	
	@Test
	public void testCrearCita() {
		Veterinaria veterinariaGuardada = repositorio.save(new Veterinaria("Veterinario_Carlos"));
		assertThat(veterinariaGuardada.getId()).isGreaterThan(0);
	}

}
