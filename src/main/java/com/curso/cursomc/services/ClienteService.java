package com.curso.cursomc.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.curso.cursomc.domain.Categoria;
import com.curso.cursomc.domain.Cliente;
import com.curso.cursomc.repositories.CategoriaRepository;
import com.curso.cursomc.repositories.ClienteRepository;

import javassist.tools.rmi.ObjectNotFoundException;

@Service
public class ClienteService {
	
	@Autowired
	public ClienteRepository repo;
	
	public Cliente buscar(Integer id) {
		Optional<Cliente> obj = repo.findById(id);
		
		
		return obj.orElseThrow(() -> new com.curso.cursomc.services.exceptions.ObjectNotFoundException(
		          "Objeto não encontrado \"" + id + "\" Tipo: \"" + Cliente.class.getName() + "\""));
	}

}
