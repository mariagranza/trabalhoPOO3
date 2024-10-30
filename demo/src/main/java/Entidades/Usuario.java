package Entidades;

public class Usuario { @Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
private Long id;
    private String nome;
    private String cpf;
    private String senha;
    private String tipoAcesso; // "Gerente" ou "Funcionário"
    // Getters e Setters
}
