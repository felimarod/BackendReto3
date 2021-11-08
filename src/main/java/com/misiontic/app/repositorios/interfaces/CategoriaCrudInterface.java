package com.misiontic.app.repositorios.interfaces;

import com.misiontic.app.modelos.Categoria;
import org.springframework.data.repository.CrudRepository;

public interface CategoriaCrudInterface extends CrudRepository<Categoria, Long>{
    
}
