package desafio.ekan.planodesaude.beneficiario.application.service;

import desafio.ekan.planodesaude.beneficiario.application.API.*;
import desafio.ekan.planodesaude.beneficiario.application.repository.BeneficiarioRepository;
import desafio.ekan.planodesaude.beneficiario.domain.Beneficiario;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

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

    @Override
    public List<BeneficiarioListCadastradoResponse> buscaTodosBeneficiarios() {
        log.info("[inicia] BeneficiarioApplicationService - buscaTodosBeneficiarios");
        List<Beneficiario> beneficiario = beneficiarioRepository.buscaTodosBeneficiarios();
        log.info("[finaliza] BeneficiarioApplicationService - buscaTodosBeneficiarios");
        return BeneficiarioListCadastradoResponse.converte(beneficiario);
    }

    @Override
    public BeneficiarioDetalhadoResponse buscaBeneficiarioAtravesId(UUID idBeneficiario) {
        log.info("[inicia] BeneficiarioApplicationService - buscaBeneficiarioAtravesId");
        Beneficiario beneficiario = beneficiarioRepository.buscaBeneficiarioAtravesId(idBeneficiario);
        log.info("[finaliza] BeneficiarioApplicationService - buscaBeneficiarioAtravesId");

        return new BeneficiarioDetalhadoResponse(beneficiario);
    }

    @Override
    public void deletaBeneficiarioAtravesId(UUID idBeneficiario) {
        log.info("[inicia] BeneficiarioApplicationService - deletaBeneficiarioAtravesId");
        Beneficiario beneficiario = beneficiarioRepository.buscaBeneficiarioAtravesId(idBeneficiario);
        beneficiarioRepository.deletaBeneficiario(beneficiario);
        log.info("[finaliza] BeneficiarioApplicationService - deletaBeneficiarioAtravesId");


    }

    @Override
    public void patchAlteraBeneficiario(UUID idBeneficiario, BeneficiarioAlteracaoRequest beneficiarioAlteracaoRequest) {
        log.info("[inicia] BeneficiarioApplicationService - patchAlteraBeneficiario");
        Beneficiario beneficiario = beneficiarioRepository.buscaBeneficiarioAtravesId(idBeneficiario);
        beneficiario.altera(beneficiarioAlteracaoRequest);
        beneficiarioRepository.salva(beneficiario);
        log.info("[finaliza] BeneficiarioApplicationService - patchAlteraBeneficiario");

    }
}
