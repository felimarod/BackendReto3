package com.misiontic.app.servicios;

import com.misiontic.app.modelos.Puntaje;
import com.misiontic.app.repositorios.GenericoAbstractoRepositorio;
import com.misiontic.app.repositorios.PuntajeRepositorio;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PuntajeServicio extends GenericoAbstractoServicio<Puntaje, Long> {

    @Autowired
    private PuntajeRepositorio repositorio;

    @Override
    public GenericoAbstractoRepositorio<Puntaje, Long> getService() {
        return repositorio;
    }

    @Override
    public Puntaje guardar(Puntaje entidad) { 
        if (entidad.getId()== null) {
            return repositorio.guardar(entidad);
        } else {
            Optional<Puntaje> c = obtenerPorId(entidad.getId());
            if (!c.isPresent()) {
                return repositorio.guardar(entidad);
            } else {
                return entidad;
            }
        }
    }

    @Override
    public Puntaje actualizar(Puntaje entidad) {
        if(entidad.getId() != null){
            Optional<Puntaje> c = obtenerPorId(entidad.getId());
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
