package desafio.ekan.planodesaude.beneficiario.application.API;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/v1/beneficiario")
public interface BeneficiarioAPI {

    @PostMapping
    @ResponseStatus(code = HttpStatus.CREATED)
    BeneficiarioCadastradoResponse cadastraBeneficiario(@RequestBody NovoBeneficiarioRequest novoBeneficiario);
}
