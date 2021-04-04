package com.example.demo.DTO;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@Data
public class PersonajesDTO {
    private List<PersonajeDTO> personajes;

    public PersonajesDTO(){
        personajes = new ArrayList<>();
    }
    public void setPersonaje(PersonajeDTO p){
        personajes.add(p);
    }
}
