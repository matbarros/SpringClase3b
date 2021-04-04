package com.example.demo.Repository;

import com.example.demo.DTO.PersonajeDTO;
import com.example.demo.DTO.PersonajesDTO;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.stereotype.Repository;
import org.springframework.util.ResourceUtils;

import java.io.File;
import java.util.List;

@Repository
public class StarWarsRepositoryImp implements StarWarsRepository{

    @Override
    public PersonajesDTO buscarPersonaje(String nombre){

        List<PersonajeDTO> result = loadDataBase();
        PersonajesDTO personajesDTO = new PersonajesDTO();
        for(PersonajeDTO p: result){
            if(p.getName().contains(nombre)){
                personajesDTO.setPersonaje(p);
            }
        }

        return personajesDTO;
    }

    @Override
    public List<PersonajeDTO> loadDataBase(){
        File file = null;
        try {
            //file = new File("classpath:food.json");
            file = ResourceUtils.getFile("classpath:starwars.json");
        }catch (Exception e){
            e.printStackTrace();
        }
        ObjectMapper objectMapper = new ObjectMapper();
        TypeReference<List<PersonajeDTO>> typeref = new TypeReference<>() {};

        List<PersonajeDTO> response = null;
        try {
            response = objectMapper.readValue(file,typeref);
        }catch (Exception e){
            e.printStackTrace();
        }

        return response;
        //TypeReference<List<CaloriasDTO>> typeref = new TypeReference<List<CaloriasDTO>>(){};

    }
}
