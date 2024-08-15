package desafio.ekan.planodesaude.documento.application.api;

import jakarta.persistence.Column;
import jakarta.validation.constraints.NotBlank;
import lombok.Value;
import org.hibernate.validator.constraints.br.CPF;


@Value
public class DocumentoAlteracaoRequest {
    private String nome;
    @NotBlank
    @CPF
    @Column(unique = true)
    private String CPF;
    @NotBlank
    @Column(unique = true)
    private String RG;
}
