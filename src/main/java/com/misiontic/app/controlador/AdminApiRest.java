package com.misiontic.app.controlador;

import com.misiontic.app.modelos.Admin;
import com.misiontic.app.servicios.GenericoAbstractoServicio;
import com.misiontic.app.servicios.AdminServicio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/Admin")
@CrossOrigin("*")
public class AdminApiRest extends GenericoAbstractApiRest<Admin, Long> {

    @Autowired
    private AdminServicio servicio;

    @Override
    public GenericoAbstractoServicio<Admin, Long> getService() {
        return servicio;
    }
}
