package com.misiontic.app.repositorios.interfaces;

import com.misiontic.app.modelos.Reservacion;
import org.springframework.data.repository.CrudRepository;

public interface ReservacionCrudInterface extends CrudRepository<Reservacion, Long>{
    
}
