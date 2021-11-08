package com.misiontic.app.servicios;

import com.misiontic.app.modelos.Nube;
import com.misiontic.app.repositorios.GenericoAbstractoRepositorio;
import com.misiontic.app.repositorios.NubeRepositorio;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class NubeServicio extends GenericoAbstractoServicio<Nube, Long> {

    @Autowired
    private NubeRepositorio repositorio;

    @Override
    public GenericoAbstractoRepositorio<Nube, Long> getService() {
        return repositorio;
    }

    @Override
    public Nube guardar(Nube entidad) {        
        if (entidad.getId() == null) {
            return repositorio.guardar(entidad);
        } else {
            Optional<Nube> c = obtenerPorId(entidad.getId());
            if (!c.isPresent()) {
                return repositorio.guardar(entidad);
            } else {
                return entidad;
            }
        }
    }

    @Override
    public Nube actualizar(Nube entidad) {
        if(entidad.getId() != null){
            Optional<Nube> c = obtenerPorId(entidad.getId());
            if(c.isPresent()){
                return repositorio.guardar(entidad);
            }else{
                return entidad;
            }
        }else{
            return entidad;
        }    }
}
