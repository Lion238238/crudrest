package com.belval.crudest.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.belval.crudest.model.Produto;

@RestController
public class ProdutoController {

	public ResponseEntity<Produto> criarProduto(
			@RequestBody Produto produto) {

	   System.out.println(produto.toString());
	   
	   return ResponseEntity
			   .status(HttpStatus.CREATED))
	           .body(produto);
	}
	
}
