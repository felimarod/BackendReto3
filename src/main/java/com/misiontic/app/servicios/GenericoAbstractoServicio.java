package com.misiontic.app.servicios;


import com.misiontic.app.repositorios.GenericoAbstractoRepositorio;

import java.io.Serializable;
import java.util.List;
import java.util.Optional;

public abstract class GenericoAbstractoServicio<T, ID extends Serializable> {

    public abstract GenericoAbstractoRepositorio<T, ID> getService();

    public abstract T guardar(T entidad);

    public abstract T actualizar(T entidad);

    public List<T> obtenerTodos() {
        return getService().obtenerTodos();
    }

    public Optional<T> obtenerPorId(ID id) {
        return getService().obtenerPorId(id);
    }

    public boolean eliminar(ID id) {
        return obtenerPorId(id).map(t -> {
            getService().eliminar(id);
            return true;
        }).orElse(false);
    }

}
