package desafio.ekan.planodesaude.beneficiario.application.API;

import lombok.Value;

import java.time.LocalDate;

@Value
public class NovoBeneficiarioRequest {
    private String nome;
    private String telefone;
    private LocalDate dataNascimento;
}
