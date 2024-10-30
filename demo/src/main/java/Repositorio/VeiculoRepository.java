package Repositorio;

public interface VeiculoRepository {package com.estacionaparking.repository;
import com.estacionaparking.model.Veiculo;
import org.springframework.data.jpa.repository.JpaRepository;
    public interface VeiculoRepository extends JpaRepository<Veiculo, Long> {
    }
}
