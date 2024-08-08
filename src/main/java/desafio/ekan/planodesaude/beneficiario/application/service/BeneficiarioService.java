package desafio.ekan.planodesaude.beneficiario.application.service;

import desafio.ekan.planodesaude.beneficiario.application.API.BeneficiarioCadastradoResponse;
import desafio.ekan.planodesaude.beneficiario.application.API.BeneficiarioListCadastradoResponse;
import desafio.ekan.planodesaude.beneficiario.application.API.NovoBeneficiarioRequest;

import java.util.List;

public interface BeneficiarioService {
    BeneficiarioCadastradoResponse criaBeneficiario(NovoBeneficiarioRequest novoBeneficiarioRequest);

    List<BeneficiarioListCadastradoResponse> buscaTodosBeneficiarios();
}
