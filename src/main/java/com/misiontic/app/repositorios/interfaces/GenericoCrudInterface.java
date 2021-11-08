package com.misiontic.app.repositorios.interfaces;

import java.io.Serializable;
import java.util.List;
import java.util.Optional;

public interface GenericoCrudInterface<T, ID extends Serializable> {

    List<T> obtenerTodos();

    Optional<T> obtenerPorId(ID id);

    T guardar(T entidad);

    void eliminar(ID id);
}
