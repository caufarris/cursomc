package com.caufarris.cursomc.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.caufarris.cursomc.domain.Categoria;
import com.caufarris.cursomc.repositories.CategoriaRepository;

import javassist.tools.rmi.ObjectNotFoundException;

import java.util.Optional;

@Service
public class CategoriaService {
	
	@Autowired
	private CategoriaRepository repo;
	
	public Categoria find(Integer id) throws ObjectNotFoundException {  
		Optional<Categoria> obj = repo.findById(id);  
		return obj.orElseThrow(() -> new ObjectNotFoundException(
				"Objeto não encontrado! Id: " + id + ", Tipo: " + Categoria.class.getName())); } 

}
