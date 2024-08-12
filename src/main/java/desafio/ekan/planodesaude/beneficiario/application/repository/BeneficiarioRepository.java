package desafio.ekan.planodesaude.beneficiario.application.repository;

import desafio.ekan.planodesaude.beneficiario.application.API.BeneficiarioListCadastradoResponse;
import desafio.ekan.planodesaude.beneficiario.domain.Beneficiario;

import java.util.List;
import java.util.UUID;

public interface BeneficiarioRepository {
    Beneficiario salva(Beneficiario beneficiario);

    List<Beneficiario> buscaTodosBeneficiarios();

    Beneficiario buscaBeneficiarioAtravesId(UUID idBeneficiario);

}
