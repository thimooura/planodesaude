package desafio.ekan.planodesaude.beneficiario.application.service;

import desafio.ekan.planodesaude.beneficiario.application.API.BeneficiarioCadastradoResponse;
import desafio.ekan.planodesaude.beneficiario.application.API.NovoBeneficiarioRequest;

public interface BeneficiarioService {
    BeneficiarioCadastradoResponse criaBeneficiario(NovoBeneficiarioRequest novoBeneficiarioRequest);
}
