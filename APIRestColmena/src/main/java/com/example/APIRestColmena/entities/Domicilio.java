package com.example.APIRestColmena.entities;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.*;


@Entity
@Table(name="domicilio")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Domicilio extends Base{

    @Column(name="calle")
    private String calle;
    @Column(name="numero")
    private int numero;

    @ManyToOne(optional = false)
    @JoinColumn(name="fk_localidad")
    private Localidad localidad;



}
