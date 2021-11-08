package com.misiontic.app.repositorios.interfaces;

import com.misiontic.app.modelos.Mensaje;
import org.springframework.data.repository.CrudRepository;

public interface MensajeCrudInterface extends CrudRepository<Mensaje, Long>{
    
}
