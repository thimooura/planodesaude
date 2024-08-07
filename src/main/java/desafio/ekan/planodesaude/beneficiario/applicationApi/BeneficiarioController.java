package desafio.ekan.planodesaude.beneficiario.applicationApi;


import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@Log4j2
@RequestMapping("/beneficiario")
public class BeneficiarioController implements BeneficiarioAPI {
    @Override
    public beneficiarioCadastradoResponse cadastraBeneficiario(NovoBeneficiarioRequest novoBeneficiario) {
        return null;
    }
}
