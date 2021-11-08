package com.misiontic.app.repositorios;

import com.misiontic.app.modelos.Mensaje;
import com.misiontic.app.repositorios.interfaces.MensajeCrudInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public class MensajeRepositorio extends GenericoAbstractoRepositorio<Mensaje, Long> {

    @Autowired
    private MensajeCrudInterface interfaceModel;


    @Override
    public CrudRepository<Mensaje, Long> getDao() {
        return interfaceModel;
    }
}