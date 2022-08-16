/**
 * FastFood API
 * API básica para melhoria e implementação.
 * 
 * Service: PedidoService
 */
package com.kailaine.meGusta.domain.service;

import com.kailaine.meGusta.domain.model.Pedido;
import com.kailaine.meGusta.domain.model.StatusPedido;
import com.kailaine.meGusta.domain.repository.PedidoRepository;
import java.time.LocalDateTime;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;



/**
 * Classe de Serviço de Pedidos para validações de regras de negócio e acesso a base de dados.
 * @author Kailaine
 */

@Service
public class PedidoService {
    
    @Autowired
    private PedidoRepository pedidoRepository;
    
    public Pedido salvar(Pedido pedido) {
        // Atualiza campos abertoEm e status
        pedido.setAbertoEm(LocalDateTime.now());
        pedido.setStatus(StatusPedido.ABERTO);
        
        return pedidoRepository.save(pedido);
    }
    
}
