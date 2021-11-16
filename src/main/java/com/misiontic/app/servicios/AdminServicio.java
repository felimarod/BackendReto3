package com.misiontic.app.servicios;

import com.misiontic.app.modelos.Admin;
import com.misiontic.app.repositorios.GenericoAbstractoRepositorio;
import com.misiontic.app.repositorios.AdminRepositorio;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AdminServicio extends GenericoAbstractoServicio<Admin, Long> {

    @Autowired
    private AdminRepositorio repositorio;

    @Override
    public GenericoAbstractoRepositorio<Admin, Long> getService() {
        return repositorio;
    }

    @Override
    public Admin guardar(Admin entidad) { 
        if (entidad.getId()== null) {
            return repositorio.guardar(entidad);
        } else {
            Optional<Admin> c = obtenerPorId(entidad.getId());
            if (!c.isPresent()) {
                return repositorio.guardar(entidad);
            } else {
                return entidad;
            }
        }
    }

    @Override
    public Admin actualizar(Admin entidad) {
        if(entidad.getId() != null){
            Optional<Admin> c = obtenerPorId(entidad.getId());
            if(c.isPresent()){
                return repositorio.guardar(entidad);
            }else{
                return entidad;
            }
        }else{
            return entidad;
        }    
    }
}
