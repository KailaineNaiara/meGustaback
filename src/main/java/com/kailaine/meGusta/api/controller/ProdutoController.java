/**
 * FastFood API
 * API básica para melhoria e implementação.
 * 
 * Controller ProdutoController
 */
package com.kailaine.meGusta.api.controller;

import com.kailaine.meGusta.domain.model.Produto;
import com.kailaine.meGusta.domain.repository.ProdutoRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Implementa RestController de Produto
 * @author Kailaine
 */
@RestController
public class ProdutoController {
    @Autowired
    private ProdutoRepository produtoRepository;
    
    @GetMapping("/produto")
    public List<Produto> showAllProduto() {
        return produtoRepository.findAll();
    }
    
    // TODO Implementar metodo showById
    // TODO Implementar métodos POST PUT DELETE
    
    
}
