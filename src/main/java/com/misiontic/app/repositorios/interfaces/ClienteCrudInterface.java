package com.misiontic.app.repositorios.interfaces;

import com.misiontic.app.modelos.Cliente;
import org.springframework.data.repository.CrudRepository;

public interface ClienteCrudInterface extends CrudRepository<Cliente, Long>{
    
}
