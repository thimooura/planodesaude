package desafio.ekan.planodesaude.beneficiario.application.API;

import lombok.Value;

import java.time.LocalDate;

@Value
public class BeneficiarioAlteracaoRequest {
    private String nome;
    private String telefone;
    private LocalDate dataNascimento;
}
