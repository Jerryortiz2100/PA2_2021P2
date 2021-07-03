/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hn.uth.pa2.parcial2.proyecto.app.servicios;

import hn.uth.pa2.parcial2.proyecto.app.modelos.Personas;
import hn.uth.pa2.parcial2.proyecto.app.repositorios.PersonasRepositorio;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Henry
 */

@Service
public class Personas_servicios {
    @Autowired
    private PersonasRepositorio repositorio;
    
    public void guardar(Personas persona){
        repositorio.save(persona);
    }
    public void eliminar(Long id){
        repositorio.deleteById(id);
    }
    
    public Optional<Personas> getEntidad(Long id){
        return repositorio.findById(id);
    }
    
    public List<Personas> getLista(){
        return (List<Personas>) repositorio.findAll();
    }
}
