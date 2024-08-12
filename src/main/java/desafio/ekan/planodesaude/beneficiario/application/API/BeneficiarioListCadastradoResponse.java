package desafio.ekan.planodesaude.beneficiario.application.API;

import desafio.ekan.planodesaude.beneficiario.domain.Beneficiario;
import lombok.Value;

import java.util.List;
import java.util.UUID;
import java.util.stream.Collectors;

@Value
public class BeneficiarioListCadastradoResponse {
    private UUID idBeneficiario;
    private String nome;
    private String telefone;

    public static List<BeneficiarioListCadastradoResponse> converte(List<Beneficiario> beneficiario) {
    return beneficiario.stream()
            .map(BeneficiarioListCadastradoResponse ::new)
            .collect(Collectors.toList());
    }

    public BeneficiarioListCadastradoResponse(Beneficiario beneficiario) {
        this.idBeneficiario = beneficiario.getIdBeneficiario();
        this.nome = beneficiario.getNome();
        this.telefone = beneficiario.getTelefone();
    }
}
