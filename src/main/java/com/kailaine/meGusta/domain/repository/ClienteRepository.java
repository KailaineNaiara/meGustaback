/**
 * FastFood API
 * API básica para melhoria e implementação.
 * 
 * Repository: Cliente
 */
package com.kailaine.meGusta.domain.repository;

import com.kailaine.meGusta.domain.model.Cliente;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Repositório Cliente
 * @author Kailaine
 */
@Repository
public interface ClienteRepository extends JpaRepository<Cliente, Long>{
    
    List<Cliente> findByNome(String nome);
    List<Cliente> findByNomeContaining(String nome);
    Cliente findById(long id);
    

}
