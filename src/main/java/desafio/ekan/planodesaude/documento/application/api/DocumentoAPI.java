package desafio.ekan.planodesaude.documento.application.api;

import jakarta.validation.Valid;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.UUID;

@RestController
@RequestMapping("/v1/documento")
public interface DocumentoAPI {
    @PostMapping
    @ResponseStatus(code = HttpStatus.CREATED)
    DocumentoResponse postDocumento(@Valid @RequestBody DocumentoRequest documentoRequest);

    @GetMapping(value = "/{idDocumento}")
    @ResponseStatus(code = HttpStatus.OK)
    DocumentoDetalhadoResponse getDocumentoPorId(@PathVariable UUID idDocumento);

    @PatchMapping(value = "/{idDocumento}")
    @ResponseStatus(code = HttpStatus.NO_CONTENT)
    void patchAlteraDocumento(@PathVariable UUID idDocumento, @RequestBody @Valid DocumentoAlteracaoRequest documentoAlteracaoRequest);

    @DeleteMapping(value = "/{idDocumento}")
    @ResponseStatus(code = HttpStatus.NO_CONTENT)
    void deleteDocumento(@PathVariable UUID idDocumento);
}
