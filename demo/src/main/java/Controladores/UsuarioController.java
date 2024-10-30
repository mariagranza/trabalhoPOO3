package Controladores;

public class UsuarioController {package com.estacionaparking.controller;
import com.estacionaparking.model.Usuario;
import com.estacionaparking.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
    @Controller
    public class UsuarioController {
        @Autowired
        private UsuarioRepository usuarioRepository;
        @GetMapping("/cadastroUsuario")
        public String cadastroUsuario(Model model) {
            model.addAttribute("usuario", new Usuario());
            return "cadastroUsuario";
        }
        @PostMapping("/salvarUsuario")
        public String salvarUsuario(Usuario usuario) {
            usuarioRepository.save(usuario);
            return "redirect:/listaUsuarios";
        }
        @GetMapping("/listaUsuarios")
        public String listaUsuarios(Model model) {
            model.addAttribute("usuarios", usuarioRepository.findAll());
            return "listaUsuarios";
        }
    }
}
