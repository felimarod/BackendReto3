package com.misiontic.app.controlador;

import com.misiontic.app.servicios.GenericoAbstractoServicio;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.io.Serializable;
import java.util.List;
import java.util.Optional;

public abstract class GenericoAbstractApiRest<T, ID extends Serializable> {

    public abstract GenericoAbstractoServicio<T, ID> getService();

    @GetMapping("/all")
    public List<T> obtenerTodos(T entidad) {
        return getService().obtenerTodos();
    }

    @GetMapping("/{id}")
    public Optional<T> obtenerPorId(@PathVariable("id") ID id) {
        return getService().obtenerPorId(id);
    }

    @PostMapping("/save")
    @ResponseStatus(HttpStatus.CREATED)
    public void guardar(@RequestBody T entidad) {
        getService().guardar(entidad);  
    }

    @PutMapping("/update")
    @ResponseStatus(HttpStatus.CREATED)
    public T actualizar(@RequestBody T entidad) {
        return getService().actualizar(entidad);
    }

    @DeleteMapping("/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public boolean eliminar(@PathVariable("id") ID id) {
        return getService().eliminar(id);
    }
}
