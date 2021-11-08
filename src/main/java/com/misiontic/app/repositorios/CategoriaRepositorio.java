package com.misiontic.app.repositorios;

import com.misiontic.app.modelos.Categoria;
import com.misiontic.app.repositorios.interfaces.CategoriaCrudInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public class CategoriaRepositorio extends GenericoAbstractoRepositorio<Categoria, Long> {

    @Autowired
    private CategoriaCrudInterface interfaceModel;


    @Override
    public CrudRepository<Categoria, Long> getDao() {
        return interfaceModel;
    }
}