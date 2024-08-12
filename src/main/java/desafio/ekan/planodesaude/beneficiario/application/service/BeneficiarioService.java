package desafio.ekan.planodesaude.beneficiario.application.service;

import desafio.ekan.planodesaude.beneficiario.application.API.BeneficiarioCadastradoResponse;
import desafio.ekan.planodesaude.beneficiario.application.API.BeneficiarioDetalhadoResponse;
import desafio.ekan.planodesaude.beneficiario.application.API.BeneficiarioListCadastradoResponse;
import desafio.ekan.planodesaude.beneficiario.application.API.NovoBeneficiarioRequest;

import java.util.List;
import java.util.UUID;

public interface BeneficiarioService {
    BeneficiarioCadastradoResponse criaBeneficiario(NovoBeneficiarioRequest novoBeneficiarioRequest);
    List<BeneficiarioListCadastradoResponse> buscaTodosBeneficiarios();
    BeneficiarioDetalhadoResponse buscaBeneficiarioAtravesId(UUID idBeneficiario);
    void deletaBeneficiarioAtravesId(UUID idBeneficiario);

}
