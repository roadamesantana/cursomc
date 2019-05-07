package com.ronald.cursomc.resources;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.ronald.cursomc.domain.Categoria;

@RestController
@RequestMapping(value = "/categorias")
public class CategoriaResource {

	@RequestMapping(method = RequestMethod.GET)
	public List<Categoria> listar() {
		Categoria cat1 = new Categoria(1, "Informática");
		Categoria cat2 = new Categoria(2, "Escritório");
<<<<<<< HEAD

		return Arrays.asList(cat1, cat2);
	}
=======
		
		System.out.println("Categoria 1: " + cat1);
		System.out.println("Categoria 2: " + cat2);
		
		return Arrays.asList(cat1, cat2);
    }
>>>>>>> 8ee91d8ff0f3a63a17f63094b1abdc1f8d478ecf
}
