package com.example.APIRestColmena.services;


import com.example.APIRestColmena.entities.Persona;
import com.example.APIRestColmena.repositories.BaseRepository;
import com.example.APIRestColmena.repositories.PersonaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PersonaServicelmpl extends BaseServiceImpl<Persona, Long> implements PersonaService{
    @Autowired
    private PersonaRepository personaRepository;
    public PersonaServicelmpl(BaseRepository<Persona, Long> baseRepository){
        super(baseRepository);
    }

    @Override
    public List<Persona> search(String filtro) throws Exception {
        try{
            List<Persona> personas= personaRepository.findByNombreContainingOrApellidoContaining(filtro,filtro);
            return personas;
        }catch(Exception e){
            throw new Exception(e.getMessage());
        }



    }
}
