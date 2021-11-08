package com.misiontic.app.repositorios;

import com.misiontic.app.modelos.Reservacion;
import com.misiontic.app.repositorios.interfaces.ReservacionCrudInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public class ReservacionRepositorio extends GenericoAbstractoRepositorio<Reservacion, Long> {

    @Autowired
    private ReservacionCrudInterface interfaceModel;

    @Override
    public CrudRepository<Reservacion, Long> getDao() {
        return interfaceModel;
    }
}