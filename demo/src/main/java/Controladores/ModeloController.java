package Controladores;

public class ModeloController {package com.estacionaparking.controller;
import com.estacionaparking.model.Modelo;
import com.estacionaparking.repository.ModeloRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
    @Controller
    public class ModeloController {
        @Autowired
        private ModeloRepository modeloRepository;
        @GetMapping("/modelo")
        public String cadastroModelo(Model model) {
            model.addAttribute("modelo", new Modelo());
            model.addAttribute("modelos", modeloRepository.findAll());
            return "modelo";
        }
        @PostMapping("/salvarModelo")
        public String salvarModelo(Modelo modelo) {
            modeloRepository.save(modelo);
            return "redirect:/modelo";
        }
    }
}
