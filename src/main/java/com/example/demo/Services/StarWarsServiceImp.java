package com.example.demo.Services;

import com.example.demo.DTO.PersonajesDTO;
import com.example.demo.Repository.StarWarsRepositoryImp;
import org.springframework.stereotype.Service;


@Service
public class StarWarsServiceImp implements StarWarsService{

    StarWarsRepositoryImp repository = new StarWarsRepositoryImp();

    @Override
    public PersonajesDTO BuscarPersonaje(String nombre){
        return repository.buscarPersonaje(nombre);
    }
}
