package com.example.demo.Repository;

import com.example.demo.DTO.PersonajeDTO;
import com.example.demo.DTO.PersonajesDTO;

import java.util.List;

public interface StarWarsRepository {
    PersonajesDTO buscarPersonaje(String nombre);
    List<PersonajeDTO> loadDataBase();
}
