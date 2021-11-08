package com.misiontic.app.repositorios;

import com.misiontic.app.repositorios.interfaces.GenericoCrudInterface;
import org.springframework.data.repository.CrudRepository;

import java.io.Serializable;
import java.util.List;
import java.util.Optional;

public abstract class GenericoAbstractoRepositorio<T, ID extends Serializable> implements GenericoCrudInterface<T, ID> {

    public abstract CrudRepository<T, ID> getDao();

    @Override
    public List<T> obtenerTodos() {
        return (List<T>) getDao().findAll();
    }

    @Override
    public Optional<T> obtenerPorId(ID id) {
        return getDao().findById(id);
    }

    @Override
    public T guardar(T entidad) {
        return getDao().save(entidad);
    }

    @Override
    public void eliminar(ID id) {
        getDao().deleteById(id);
    }
}
