package com.example.APIRestColmena.controllers;


import com.example.APIRestColmena.services.PersonaServicelmpl;
import com.example.APIRestColmena.entities.Persona;


import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.CrossOrigin;

@RestController
@CrossOrigin(origins="*")
@RequestMapping(path = "api/v1/personas")
public class PersonaController extends BaseControllerlmpl<Persona, PersonaServicelmpl>{
    @GetMapping("/search")
    public ResponseEntity<?> search(@RequestParam String filtro){
        try{
            return ResponseEntity.status(HttpStatus.OK).body(servicio.search(filtro));
        }catch (Exception e){
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body(("{\"error\":\""+e.getMessage()+"\"}"));
        }
    }


}
