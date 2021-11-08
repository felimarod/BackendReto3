package com.misiontic.app.controlador;

import com.misiontic.app.modelos.Cliente;
import com.misiontic.app.servicios.ClienteServicio;
import com.misiontic.app.servicios.GenericoAbstractoServicio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/Client")
@CrossOrigin("*")
public class ClienteApiRest extends GenericoAbstractApiRest<Cliente, Long> {

    @Autowired
    private ClienteServicio servicio;

    @Override
    public GenericoAbstractoServicio<Cliente, Long> getService() {
        return servicio;
    }
}
