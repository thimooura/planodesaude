package desafio.ekan.planodesaude.beneficiario.application.API;

import desafio.ekan.planodesaude.beneficiario.domain.Beneficiario;
import lombok.Value;

import java.time.LocalDateTime;
import java.util.UUID;

@Value
public class BeneficiarioDetalhadoResponse {
    private UUID idBeneficiario;
    private String nome;
    private String telefone;
    private String dataInclusao;

    public BeneficiarioDetalhadoResponse(Beneficiario beneficiario) {
        this.idBeneficiario = beneficiario.getIdBeneficiario();
        this.nome = beneficiario.getNome();
        this.telefone = beneficiario.getTelefone();
        this.dataInclusao = String.valueOf(LocalDateTime.now());
    }

    }

