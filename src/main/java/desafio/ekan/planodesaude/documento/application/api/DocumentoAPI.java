package desafio.ekan.planodesaude.documento.application.api;

import desafio.ekan.planodesaude.documento.application.DocumentoRequest;
import desafio.ekan.planodesaude.documento.application.DocumentoResponse;
import jakarta.validation.Valid;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/documento")
public interface DocumentoAPI {
    @PostMapping
    @ResponseStatus(code = HttpStatus.CREATED)
    DocumentoResponse postDocumento(@Valid @RequestBody DocumentoRequest documentoRequest);
}
