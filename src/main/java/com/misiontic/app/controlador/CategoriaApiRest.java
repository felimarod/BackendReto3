package com.misiontic.app.controlador;

import com.misiontic.app.modelos.Categoria;
import com.misiontic.app.servicios.CategoriaServicio;
import com.misiontic.app.servicios.GenericoAbstractoServicio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/Category")
@CrossOrigin("*")
public class CategoriaApiRest extends GenericoAbstractApiRest<Categoria, Long> {

    @Autowired
    private CategoriaServicio servicio;

    @Override
    public GenericoAbstractoServicio<Categoria, Long> getService() {
        return servicio;
    }
}
