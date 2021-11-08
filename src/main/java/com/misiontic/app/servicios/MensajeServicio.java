package com.misiontic.app.servicios;

import com.misiontic.app.modelos.Mensaje;
import com.misiontic.app.repositorios.GenericoAbstractoRepositorio;
import com.misiontic.app.repositorios.MensajeRepositorio;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MensajeServicio extends GenericoAbstractoServicio<Mensaje, Long> {

    @Autowired
    private MensajeRepositorio repositorio;

    @Override
    public GenericoAbstractoRepositorio<Mensaje, Long> getService() {
        return repositorio;
    }

    @Override
    public Mensaje guardar(Mensaje entidad) {        
        if (entidad.getIdMessage() == null) {
            return repositorio.guardar(entidad);
        } else {
            Optional<Mensaje> c = obtenerPorId(entidad.getIdMessage());
            if (!c.isPresent()) {
                return repositorio.guardar(entidad);
            } else {
                return entidad;
            }
        }
    }

    @Override
    public Mensaje actualizar(Mensaje entidad) {
        if(entidad.getIdMessage() != null){
            Optional<Mensaje> c = obtenerPorId(entidad.getIdMessage());
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
