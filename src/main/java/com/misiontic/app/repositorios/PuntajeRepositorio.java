package com.misiontic.app.repositorios;

import com.misiontic.app.modelos.Puntaje;
import com.misiontic.app.repositorios.interfaces.PuntajeCrudInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public class PuntajeRepositorio extends GenericoAbstractoRepositorio<Puntaje, Long> {

    @Autowired
    private PuntajeCrudInterface interfaceModel;

    @Override
    public CrudRepository<Puntaje, Long> getDao() {
        return interfaceModel;
    }
}