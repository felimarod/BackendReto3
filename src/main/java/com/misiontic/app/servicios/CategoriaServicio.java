package com.misiontic.app.servicios;

import com.misiontic.app.modelos.Categoria;
import com.misiontic.app.repositorios.CategoriaRepositorio;
import com.misiontic.app.repositorios.GenericoAbstractoRepositorio;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CategoriaServicio extends GenericoAbstractoServicio<Categoria, Long> {

    @Autowired
    private CategoriaRepositorio repositorio;

    @Override
    public GenericoAbstractoRepositorio<Categoria, Long> getService() {
        return repositorio;
    }

    @Override
    public Categoria guardar(Categoria entidad) {        
        if (entidad.getId() == null) {
            return repositorio.guardar(entidad);
        } else {
            Optional<Categoria> c = obtenerPorId(entidad.getId());
            if (!c.isPresent()) {
                return repositorio.guardar(entidad);
            } else {
                return entidad;
            }
        }
    }

    @Override
    public Categoria actualizar(Categoria entidad) {
        if(entidad.getId() != null){
            Optional<Categoria> c = obtenerPorId(entidad.getId());
            if(c.isPresent()){
                return repositorio.guardar(entidad);
            }else{
                return entidad;
            }
        }else{
            return entidad;
        }    }
}
