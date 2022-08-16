/**
 * FastFood API
 * API básica para melhoria e implementação.
 * 
 * Repositório Produto
 */
package com.kailaine.meGusta.domain.repository;

import com.kailaine.meGusta.domain.model.Produto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Repositório Produto
 * @author Kailaine
 */
@Repository
public interface ProdutoRepository extends JpaRepository<Produto, Long>{
    
}
