package edu.usf.produto.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import edu.usf.produto.model.Produto;

@RestController
@RequestMapping("/teste")
public class ProdutoController {
	
	@GetMapping("")
	public Produto getProduto() {
		Produto p = new Produto();
		p.setId(1L);
		p.setNome("Produto 1");
		return p;
	}
}
