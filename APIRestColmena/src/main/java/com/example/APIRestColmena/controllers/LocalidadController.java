package com.example.APIRestColmena.controllers;

import com.example.APIRestColmena.entities.Localidad;
import com.example.APIRestColmena.services.LocalidadServicelmpl;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins="*")
@RequestMapping(path = "api/v1/localidades")
public class LocalidadController extends  BaseControllerlmpl<Localidad, LocalidadServicelmpl>{
}
