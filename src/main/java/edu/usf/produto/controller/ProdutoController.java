package edu.usf.produto.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import edu.usf.produto.model.Produto;
import edu.usf.produto.repository.ProdutoRepository;

@RestController
@RequestMapping("/produtos")
public class ProdutoController {
	@Autowired ProdutoRepository produtoRepository;
	
	@RequestMapping(path="", method=RequestMethod.GET)
	public List<Produto> find() {
		return produtoRepository.findAll();			
	}
	
	@RequestMapping(path="", method=RequestMethod.POST)
	public Produto save(@RequestBody Produto produto) {
		return produtoRepository.save(produto);
	}
	
	@RequestMapping(path="/{id}", method=RequestMethod.DELETE)
	public HttpEntity<?> delete(@PathVariable Long id) {
		produtoRepository.delete(id);
		return new ResponseEntity(HttpStatus.OK);
	}	
	
}
