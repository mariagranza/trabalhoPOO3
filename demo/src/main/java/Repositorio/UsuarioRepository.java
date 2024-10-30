package Repositorio;

public interface UsuarioRepository {package com.estacionaparking.repository;
import com.estacionaparking.model.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;
    public interface UsuarioRepository extends JpaRepository<Usuario, Long> {
    }
}
