package desafio.ekan.planodesaude.beneficiario.application.API;


import desafio.ekan.planodesaude.beneficiario.application.service.BeneficiarioService;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

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
        return null;
    }
}
