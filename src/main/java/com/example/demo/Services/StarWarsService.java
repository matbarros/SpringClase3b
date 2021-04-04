package com.example.demo.Services;

import com.example.demo.DTO.PersonajesDTO;

public interface StarWarsService {
    PersonajesDTO BuscarPersonaje(String nombre);
}
