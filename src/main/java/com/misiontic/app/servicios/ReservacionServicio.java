package com.misiontic.app.servicios;

import com.misiontic.app.modelos.Reservacion;
import com.misiontic.app.repositorios.GenericoAbstractoRepositorio;
import com.misiontic.app.repositorios.ReservacionRepositorio;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ReservacionServicio extends GenericoAbstractoServicio<Reservacion, Long> {

    @Autowired
    private ReservacionRepositorio repositorio;

    @Override
    public GenericoAbstractoRepositorio<Reservacion, Long> getService() {
        return repositorio;
    }

    @Override
    public Reservacion guardar(Reservacion entidad) {        
        if (entidad.getIdReservation()== null) {
            entidad.setStatus("created");
            return repositorio.guardar(entidad);
        } else {
            Optional<Reservacion> c = obtenerPorId(entidad.getIdReservation());
            if (!c.isPresent()) {
                return repositorio.guardar(entidad);
            } else {
                return entidad;
            }
        }
    }

    @Override
    public Reservacion actualizar(Reservacion entidad) {
        if(entidad.getIdReservation() != null){
            Optional<Reservacion> c = obtenerPorId(entidad.getIdReservation());
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
