package com.example.APIRestColmena.services;


import com.example.APIRestColmena.entities.Autor;
import com.example.APIRestColmena.repositories.AutorRepository;
import com.example.APIRestColmena.repositories.BaseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AutorServicelmpl extends BaseServiceImpl<Autor, Long> implements AutorService{
    @Autowired
    private AutorRepository autorRepository;
    public AutorServicelmpl(BaseRepository<Autor, Long> baseRepository){
        super(baseRepository);
    }

}
