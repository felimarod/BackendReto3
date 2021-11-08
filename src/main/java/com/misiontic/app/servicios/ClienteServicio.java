package com.misiontic.app.servicios;

import com.misiontic.app.modelos.Cliente;
import com.misiontic.app.repositorios.ClienteRepositorio;
import com.misiontic.app.repositorios.GenericoAbstractoRepositorio;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ClienteServicio extends GenericoAbstractoServicio<Cliente, Long> {

    @Autowired
    private ClienteRepositorio repositorio;

    @Override
    public GenericoAbstractoRepositorio<Cliente, Long> getService() {
        return repositorio;
    }

    @Override
    public Cliente guardar(Cliente entidad) {        
        if (entidad.getIdClient() == null) {
            return repositorio.guardar(entidad);
        } else {
            Optional<Cliente> c = obtenerPorId(entidad.getIdClient());
            if (!c.isPresent()) {
                return repositorio.guardar(entidad);
            } else {
                return entidad;
            }
        }
    }

    @Override
    public Cliente actualizar(Cliente entidad) {
        if(entidad.getIdClient() != null){
            Optional<Cliente> c = obtenerPorId(entidad.getIdClient());
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
