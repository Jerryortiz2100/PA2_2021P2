 /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hn.uth.pa2.parcial2.proyecto.app.repositorios;

import hn.uth.pa2.parcial2.proyecto.app.modelos.Personas;
import org.springframework.data.repository.CrudRepository;

/**
 *
 * @author Henry
 */
public interface PersonasRepositorio extends CrudRepository<Personas, Object>{
    
}
