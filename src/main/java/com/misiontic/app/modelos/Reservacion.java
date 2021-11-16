/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.misiontic.app.modelos;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.io.Serializable;
import java.util.Date;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import lombok.Data;

@Data
@Entity
@Table(name="reservaciones")
public class Reservacion implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idReservation;
    
    @Temporal(TemporalType.DATE)
    private Date createdDate;
    
    @Temporal(TemporalType.DATE)
    private Date startDate;
    
    @Temporal(TemporalType.DATE)
    private Date devolutionDate;
    
    private String status;
    
    @ManyToOne
    @JoinColumn(name="id_nube")
    @JsonIgnoreProperties("reservations")
    private Nube cloud;
    
    @ManyToOne
    @JoinColumn(name="id_cliente")
    @JsonIgnoreProperties({"reservations", "messages"})
    private Cliente client;
    
    @OneToOne(mappedBy = "reservation", cascade = CascadeType.PERSIST)
    @JsonIgnoreProperties("reservation")
    private Puntaje score;
}
