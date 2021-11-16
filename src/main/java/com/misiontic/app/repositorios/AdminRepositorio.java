package com.misiontic.app.repositorios;

import com.misiontic.app.modelos.Admin;
import com.misiontic.app.repositorios.interfaces.AdminCrudInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public class AdminRepositorio extends GenericoAbstractoRepositorio<Admin, Long> {

    @Autowired
    private AdminCrudInterface interfaceModel;

    @Override
    public CrudRepository<Admin, Long> getDao() {
        return interfaceModel;
    }
}