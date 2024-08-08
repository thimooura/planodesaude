package desafio.ekan.planodesaude.beneficiario.domain;


import desafio.ekan.planodesaude.beneficiario.application.API.NovoBeneficiarioRequest;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.UUID;

@Getter
@Entity
@NoArgsConstructor(access = AccessLevel.PRIVATE)
public class Beneficiario {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(columnDefinition = "uuid",updatable = false,unique = true,nullable = false)
    private UUID idBeneficiario;
    @NotNull
    private String nome;
    @NotBlank
    private String telefone;
    private LocalDate dataNascimento;
    private LocalDateTime dataInclusao;
    private LocalDateTime dataAtualizacao;


    public Beneficiario(NovoBeneficiarioRequest novoBeneficiarioRequest) {
        this.idBeneficiario = idBeneficiario;
        this.nome = novoBeneficiarioRequest.getNome();
        this.telefone = novoBeneficiarioRequest.getTelefone();
        this.dataNascimento = novoBeneficiarioRequest.getDataNascimento();
        this.dataInclusao = LocalDateTime.now();
    }
}
