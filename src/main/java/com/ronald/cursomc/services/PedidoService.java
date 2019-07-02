package com.ronald.cursomc.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ronald.cursomc.domain.Pedido;
import com.ronald.cursomc.repositories.PedidoRepository;
import com.ronald.cursomc.services.exceptions.ObjectNotFoundException;

@Service
public class PedidoService {

	@Autowired
	private PedidoRepository repo;

	public Pedido buscar(Integer id) {
		final Optional<Pedido> findById = repo.findById(id);
		final String msg = "Objeto não encontrado ID: " + id + ", Tipo " + Pedido.class.getName();
		return findById.orElseThrow(() -> new ObjectNotFoundException(msg));
	}
}
