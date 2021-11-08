package com.misiontic.app.modelos;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name="mensajes")
public class Mensaje implements Serializable{
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idMessage;
    private String messageText;
    
    @ManyToOne
    @JoinColumn(name = "id_cloud")
    @JsonIgnoreProperties({"messages", "reservations"})
    private Nube cloud;
    
    @ManyToOne
    @JoinColumn(name = "id_client")
    @JsonIgnoreProperties({"messages", "reservations"})
    private Cliente client;
}
