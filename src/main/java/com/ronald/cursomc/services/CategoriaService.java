package com.ronald.cursomc.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ronald.cursomc.domain.Categoria;
import com.ronald.cursomc.repositories.CategoriaRepository;
import com.ronald.cursomc.services.exceptions.ObjectNotFoundException;

@Service
public class CategoriaService {

	@Autowired
	private CategoriaRepository repo;

	public Categoria buscar(Integer id) {
		final Optional<Categoria> findById = repo.findById(id);
		final String msg = "Objeto não encontrado ID: " + id + ", Tipo " + Categoria.class.getName();
		return findById.orElseThrow(() -> new ObjectNotFoundException(msg));
	}
}
