package com.misiontic.app.controlador;

import com.misiontic.app.modelos.Puntaje;
import com.misiontic.app.servicios.GenericoAbstractoServicio;
import com.misiontic.app.servicios.PuntajeServicio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/Score")
@CrossOrigin("*")
public class PuntajeApiRest extends GenericoAbstractApiRest<Puntaje, Long> {

    @Autowired
    private PuntajeServicio servicio;

    @Override
    public GenericoAbstractoServicio<Puntaje, Long> getService() {
        return servicio;
    }
}
