package com.example.APIRestColmena.services;

import com.example.APIRestColmena.entities.Localidad;
import com.example.APIRestColmena.repositories.BaseRepository;
import org.springframework.stereotype.Service;

@Service
public class LocalidadServicelmpl extends  BaseServiceImpl<Localidad, Long> implements LocalidadService{
    public LocalidadServicelmpl(BaseRepository<Localidad,Long> baseRepository){
        super(baseRepository);
    }
}
