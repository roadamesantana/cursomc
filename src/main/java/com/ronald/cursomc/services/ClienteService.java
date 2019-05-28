package com.ronald.cursomc.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ronald.cursomc.domain.Cliente;
import com.ronald.cursomc.repositories.ClienteRepository;
import com.ronald.cursomc.services.exceptions.ObjectNotFoundException;

@Service
public class ClienteService {

	@Autowired
	private ClienteRepository repo;

	public Cliente buscar(Integer id) {
		final Optional<Cliente> findById = repo.findById(id);
		final String msg = "Objeto não encontrado ID: " + id + ", Tipo " + Cliente.class.getName();
		return findById.orElseThrow(() -> new ObjectNotFoundException(msg));
	}
}
