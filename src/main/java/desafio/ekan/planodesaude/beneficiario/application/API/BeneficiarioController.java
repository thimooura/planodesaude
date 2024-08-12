package desafio.ekan.planodesaude.beneficiario.application.API;


import desafio.ekan.planodesaude.beneficiario.application.service.BeneficiarioService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.UUID;

@RestController
@Log4j2
@RequiredArgsConstructor
public class BeneficiarioController implements BeneficiarioAPI {
    private final BeneficiarioService beneficiarioService;

    @Override
    public BeneficiarioCadastradoResponse cadastraBeneficiario(NovoBeneficiarioRequest novoBeneficiarioRequest) {
        log.info("[inicia] beneficiarioController - postBeneficiario");
        BeneficiarioCadastradoResponse beneficiarioCriado = beneficiarioService.criaBeneficiario(novoBeneficiarioRequest);
        log.info("[finaliza] beneficiarioController - postBeneficiario");
        return beneficiarioCriado;
    }

    @Override
    public List<BeneficiarioListCadastradoResponse> getTodosBeneficiarios() {
        log.info("[inicia] BeneficiarioController - getTodosBeneficiarios");
        List<BeneficiarioListCadastradoResponse>beneficiario = beneficiarioService.buscaTodosBeneficiarios();
        log.info("[finaliza] BeneficiarioController - getTodosBeneficiarios");
        return beneficiario;
    }

    @Override
    public BeneficiarioDetalhadoResponse getBeneficiarioAtravesId(UUID idBeneficiario) {
        log.info("[inicia] BeneficiarioController - getBeneficiarioAtravesId");
        log.info("[idBeneficiario] {}", idBeneficiario);
        BeneficiarioDetalhadoResponse beneficiarioDetalhado = beneficiarioService.buscaBeneficiarioAtravesId(idBeneficiario);
        log.info("[finaliza] BeneficiarioController - getBeneficiarioAtravesId");

        return beneficiarioDetalhado;

    }

    @Override
    public void deletaBeneficiarioAtravesId(UUID idBeneficiario) {
        log.info("[inicia] BeneficiarioController - deletaBeneficiarioAtravesId");
        log.info("[idBeneficiario] {}", idBeneficiario);
        log.info("[finaliza] BeneficiarioController - deletaBeneficiarioAtravesId");
    }

    @Override
    public void patchAlteraBeneficiario(UUID idBeneficiario, @Valid BeneficiarioAlteracaoRequest beneficiarioAlteracaoRequest) {
        log.info("[inicia] BeneficiarioController - patchAlteraBeneficiario");
        log.info("[idBeneficiario] {}", idBeneficiario);
        log.info("[finaliza] BeneficiarioController - patchAlteraBeneficiario");

    }
}
