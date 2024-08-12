package desafio.ekan.planodesaude.beneficiario.application.API;

import jakarta.validation.Valid;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/v1/beneficiario")
public interface BeneficiarioAPI {

    @PostMapping
    @ResponseStatus(code = HttpStatus.CREATED)
    BeneficiarioCadastradoResponse cadastraBeneficiario(@Valid @RequestBody NovoBeneficiarioRequest novoBeneficiario);

    @GetMapping
    @ResponseStatus(code = HttpStatus.OK)
    List<BeneficiarioListCadastradoResponse> getTodosBeneficiarios();

    @GetMapping(value = "/{idBeneficiario}")
    @ResponseStatus(code = HttpStatus.OK)
    BeneficiarioDetalhadoResponse getBeneficiarioAtravesId (@PathVariable UUID idBeneficiario);

}
