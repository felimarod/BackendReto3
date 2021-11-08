package com.misiontic.app.repositorios;

import com.misiontic.app.modelos.Cliente;
import com.misiontic.app.repositorios.interfaces.ClienteCrudInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public class ClienteRepositorio extends GenericoAbstractoRepositorio<Cliente, Long> {

    @Autowired
    private ClienteCrudInterface interfaceModel;


    @Override
    public CrudRepository<Cliente, Long> getDao() {
        return interfaceModel;
    }
}