/**
 * FastFood API
 * API básica para melhoria e implementação.
 * 
 * Enum StatusPedido
 */
package com.kailaine.meGusta.domain.model;

/**
 * Implementa os status de pedido do sistema.
 * ABERTO: Pedido incluido no sistema
 * EM_PREPARACAO: Pedido é aceito pela cozinha
 * FINALIZADO: Pedido pronto para entrega
 * ENTREGUE: Pedido entregue pelo atendimento
 * CANCELADO: Pedido cancelado.
 * 
 * @author Kailaine
 */
public enum StatusPedido {
    ABERTO, EM_PREPARACAO, FINALIZADO, ENTREGUE, CANCELADO
}
