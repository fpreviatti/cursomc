package com.curso.cursomc.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.curso.cursomc.domain.Produto;
import com.curso.cursomc.repositories.ProdutoRepository;

@Service
public class ProdutoService {
	
	@Autowired
	public ProdutoRepository repo;
	
	public Produto buscar(Integer id) {
		Optional<Produto> obj = repo.findById(id);
		return obj.orElse(null);
	}

	
}
