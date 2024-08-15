package desafio.ekan.planodesaude.documento.domain;

import desafio.ekan.planodesaude.documento.application.api.DocumentoRequest;
import desafio.ekan.planodesaude.documento.application.api.DocumentoAlteracaoRequest;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;
import java.util.UUID;

@Entity
@Getter
@NoArgsConstructor
public class Documento {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID idDocumento;
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

    public Documento(DocumentoRequest documentoRequest) {
        this.idBeneficiarioCriado = documentoRequest.getIdBeneficiarioCriado();
        this.nome = documentoRequest.getNome();
        this.CPF = documentoRequest.getCPF();
        this.RG = documentoRequest.getRG();
        this.DataInclusao = LocalDateTime.now();
    }

    public void altera(DocumentoAlteracaoRequest documentoAlteracaoRequest) {
        this.nome = documentoAlteracaoRequest.getNome();
        this.CPF = documentoAlteracaoRequest.getCPF();
        this.RG = documentoAlteracaoRequest.getRG();
        this.DataAtualizacao  = LocalDateTime.now();
    }
}
