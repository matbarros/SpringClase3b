package com.example.demo.Controllers;

import com.example.demo.Services.StarWarsServiceImp;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StarWarsController {

    StarWarsServiceImp starWarsServiceImp = new StarWarsServiceImp();

    @GetMapping("/buscar/{name}")
    public ResponseEntity buscarPersonaje(@PathVariable String name){
        return new ResponseEntity(starWarsServiceImp.BuscarPersonaje(name), HttpStatus.OK);
    }
}
