package desafio.ekan.planodesaude.documento.application.api;

import jakarta.persistence.Column;
import jakarta.persistence.Id;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.Value;

import java.time.LocalDateTime;
import java.util.UUID;

@Value
public class DocumentoRequest {

    @Column(columnDefinition = "uuid", name = "idBeneficiarioCadastrado", nullable = false)
    @NotNull
    private UUID idBeneficiarioCriado;
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
