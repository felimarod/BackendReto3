package com.misiontic.app.controlador;

import com.misiontic.app.modelos.Nube;
import com.misiontic.app.servicios.GenericoAbstractoServicio;
import com.misiontic.app.servicios.NubeServicio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/Cloud")
@CrossOrigin("*")
public class NubeApiRest extends GenericoAbstractApiRest<Nube, Long> {

    @Autowired
    private NubeServicio servicio;

    @Override
    public GenericoAbstractoServicio<Nube, Long> getService() {
        return servicio;
    }
}
