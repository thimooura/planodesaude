package desafio.ekan.planodesaude.beneficiario.applicationApi;

import lombok.Value;

import java.time.LocalDate;


@Value
public class NovoBeneficiarioRequest {
    private String nome;
    private int telefone;
    private LocalDate dataNascimento;
}
