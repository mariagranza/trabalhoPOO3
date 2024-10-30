package Controladores;

public class VeiculoController {package com.estacionaparking.controller;
import com.estacionaparking.model.Veiculo;
import com.estacionaparking.repository.VeiculoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
    @Controller
    public class VeiculoController {
        @Autowired
        private VeiculoRepository veiculoRepository;
        @GetMapping("/cadastroVeiculo")
        public String cadastroVeiculo(Model model) {
            model.addAttribute("veiculo", new Veiculo());
            return "cadastroVeiculo";
        }
        @PostMapping("/salvarVeiculo")
        public String salvarVeiculo(Veiculo veiculo) {
            veiculoRepository.save(veiculo);
            return "redirect:/listaVeiculos";
        }
        @GetMapping("/listaVeiculos")
        public String listaVeiculos(Model model) {
            model.addAttribute("veiculos", veiculoRepository.findAll());
            return "listaVeiculos";
        }
    }
}
