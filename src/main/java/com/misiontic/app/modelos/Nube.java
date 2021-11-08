package com.misiontic.app.modelos;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

@Data
@Entity
@Table(name="nubes")
public class Nube implements Serializable{
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String brand;
    private int year;
    private String description;
    
    @ManyToOne
    @JoinColumn(name = "id_category")
    @JsonIgnoreProperties("clouds")
    private Categoria category;
    
    @OneToMany(mappedBy = "cloud", cascade = CascadeType.PERSIST)
    @JsonIgnoreProperties({"cloud", "client"})
    private List<Mensaje> messages;
    
    @OneToMany(mappedBy = "cloud", cascade = CascadeType.PERSIST)
    @JsonIgnoreProperties({"cloud", "client"})
    private List<Reservacion> reservations;
}
