package Entidades;

public class Veiculo {@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
private Long id;
    private String placa;
    private String tipo;
    private String modelo;
    private String statusPagamento; // "Pago" ou "Pendente"
    private String dataHoraEntrada;
    private String dataHoraSaida;
    // Getters e Setters
}
