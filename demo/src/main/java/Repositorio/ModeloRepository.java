package Repositorio;

public interface ModeloRepository {package com.estacionaparking.repository;
import com.estacionaparking.model.Modelo;
import org.springframework.data.jpa.repository.JpaRepository;
    public interface ModeloRepository extends JpaRepository<Modelo, Long> {
    }

}
