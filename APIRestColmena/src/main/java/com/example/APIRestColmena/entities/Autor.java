package com.example.APIRestColmena.entities;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="autor")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Autor  extends  Base{

    @Column(name="nombre")
    private String nombre;
    @Column(name="apellido")
    private String apellido;
    @Column(name="biografia", length = 15000)
    private String biografia;


}
