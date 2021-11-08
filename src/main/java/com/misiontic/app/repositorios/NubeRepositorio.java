package com.misiontic.app.repositorios;

import com.misiontic.app.modelos.Nube;
import com.misiontic.app.repositorios.interfaces.NubeCrudInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public class NubeRepositorio extends GenericoAbstractoRepositorio<Nube, Long> {

    @Autowired
    private NubeCrudInterface interfaceModel;


    @Override
    public CrudRepository<Nube, Long> getDao() {
        return interfaceModel;
    }
}