/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hn.uth.pa2.parcial2.proyecto.app.controladores;

import hn.uth.pa2.parcial2.proyecto.app.modelos.Personas;
import hn.uth.pa2.parcial2.proyecto.app.servicios.Personas_servicios;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 *
 * @author Henry
 */
@Controller
public class Personas_controlador {
    @Autowired
    private Personas_servicios servicios;
    
    @RequestMapping("/")
    public String index(Model model){
        model.addAttribute("lista",servicios.getLista());
        return "index";
    }
    
    @GetMapping("/crear")
    public String AbrirFormularioPersona(Model model){
        model.addAttribute("persona",new Personas());
        return "persona";
    }
    
    @GetMapping("/actualizar/{id}")
    public String AbrirFormularioActualizarPersona(@PathVariable Long id, Model model){
        model.addAttribute("persona",servicios.getEntidad(id));
        return "persona";
    }
    
    @PostMapping("/guardarformulario")
    public String GuardarFormularioPersona(Personas persona, Model model){
        servicios.guardar(persona);
        return "redirect:/";
    }
    
    @GetMapping("/eliminar/{id}")
    public String EliminarFormularioPersona(@PathVariable Long id, Model model){
        servicios.eliminar(id);
        return "redirect:/";
    }
}
