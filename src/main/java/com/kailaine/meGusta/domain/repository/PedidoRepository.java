/**
 * FastFood API
 * API básica para melhoria e implementação.
 * 
 * Repositório: Pedido
 */
package com.kailaine.meGusta.domain.repository;

import com.kailaine.meGusta.domain.model.Pedido;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Repositório Pedido
 * 
 * @author Kailaine
 */
public interface PedidoRepository extends JpaRepository<Pedido, Long>{
    
    List<Pedido> findByStatus(String status);

}