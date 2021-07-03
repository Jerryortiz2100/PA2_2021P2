/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hn.uth.pa2.parcial2.proyecto.app.controladores;

import hn.uth.pa2.parcial2.proyecto.app.servicios.Personas_servicios;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
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
} 
