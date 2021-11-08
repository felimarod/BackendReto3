package com.misiontic.app.controlador;

import com.misiontic.app.modelos.Mensaje;
import com.misiontic.app.servicios.GenericoAbstractoServicio;
import com.misiontic.app.servicios.MensajeServicio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/Message")
@CrossOrigin("*")
public class MensajeApiRest extends GenericoAbstractApiRest<Mensaje, Long> {

    @Autowired
    private MensajeServicio servicio;

    @Override
    public GenericoAbstractoServicio<Mensaje, Long> getService() {
        return servicio;
    }
}
