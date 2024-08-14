package desafio.ekan.planodesaude.beneficiario.application.service;

import desafio.ekan.planodesaude.beneficiario.application.API.*;
import jakarta.validation.Valid;

import java.util.List;
import java.util.UUID;

public interface BeneficiarioService {
    BeneficiarioCadastradoResponse criaBeneficiario(NovoBeneficiarioRequest novoBeneficiarioRequest);
    List<BeneficiarioListCadastradoResponse> buscaTodosBeneficiarios();
    BeneficiarioDetalhadoResponse buscaBeneficiarioAtravesId(UUID idBeneficiario);
    void deletaBeneficiarioAtravesId(UUID idBeneficiario);
    void patchAlteraBeneficiario(UUID idBeneficiario, @Valid BeneficiarioAlteracaoRequest beneficiarioAlteracaoRequest);
}
