package com.misiontic.app.repositorios.interfaces;

import com.misiontic.app.modelos.Admin;
import org.springframework.data.repository.CrudRepository;

public interface AdminCrudInterface extends CrudRepository<Admin, Long>{
    
}
