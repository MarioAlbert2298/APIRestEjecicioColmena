package com.example.APIRestColmena.services;

import com.example.APIRestColmena.entities.Persona;

import java.util.List;

public interface PersonaService extends  BaseService<Persona, Long>{

    List<Persona> search(String filtro) throws Exception;


}
