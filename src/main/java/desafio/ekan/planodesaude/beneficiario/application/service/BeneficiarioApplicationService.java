package desafio.ekan.planodesaude.beneficiario.application.service;

import desafio.ekan.planodesaude.beneficiario.application.API.BeneficiarioCadastradoResponse;
import desafio.ekan.planodesaude.beneficiario.application.API.NovoBeneficiarioRequest;
import desafio.ekan.planodesaude.beneficiario.application.repository.BeneficiarioRepository;
import desafio.ekan.planodesaude.beneficiario.domain.Beneficiario;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Service;

@Service
@Log4j2
@RequiredArgsConstructor
public class BeneficiarioApplicationService implements BeneficiarioService {
    private final BeneficiarioRepository beneficiarioRepository;
    @Override
    public BeneficiarioCadastradoResponse criaBeneficiario(NovoBeneficiarioRequest novoBeneficiarioRequest) {
                log.info("[inicia] BeneficiarioApplicationService - criaBeneficiario");
                Beneficiario beneficiario = beneficiarioRepository.salva(new Beneficiario(novoBeneficiarioRequest));
                log.info("[finaliza] BeneficiarioApplicationService - criaBeneficiario");
        return BeneficiarioCadastradoResponse.builder()
                .idBeneficiario(beneficiario.getIdBeneficiario())
                .build();
    }
}
