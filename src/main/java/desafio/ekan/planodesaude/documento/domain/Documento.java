package desafio.ekan.planodesaude.documento.domain;

import jakarta.persistence.Column;
import jakarta.persistence.Id;
import jakarta.validation.constraints.NotBlank;
import org.hibernate.validator.constraints.br.CPF;

import java.time.LocalDateTime;
import java.util.UUID;

public class Documento {
    @Id
    private UUID idBeneficiario;
    @NotBlank
    private String nome;
    @NotBlank
    @org.hibernate.validator.constraints.br.CPF
    @Column(unique = true)
    private String CPF;
    @NotBlank
    @Column(unique = true)
    private String RG;
    private LocalDateTime DataInclusao;
    private LocalDateTime DataAtualizacao;
}
