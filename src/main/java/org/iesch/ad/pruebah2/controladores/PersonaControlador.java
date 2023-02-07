package org.iesch.ad.pruebah2.controladores;



import org.iesch.ad.pruebah2.repositorio.PersonaRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/api/persona/")
public class PersonaControlador {
    @Autowired
    PersonaRepositorio personaRepositorio;

    @GetMapping("obtenerTodasPersonas")
    public ResponseEntity<?> obtenerTodasPersonas(){
        return personaRepositorio.findAll().isEmpty() ? ResponseEntity.notFound().build() : ResponseEntity.ok(personaRepositorio.findAll());
    }





}