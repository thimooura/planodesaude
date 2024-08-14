package desafio.ekan.planodesaude.documento.application.api;

import desafio.ekan.planodesaude.documento.application.DocumentoRequest;
import desafio.ekan.planodesaude.documento.application.DocumentoResponse;
import desafio.ekan.planodesaude.documento.application.service.DocumentoService;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.web.bind.annotation.RestController;

@Log4j2
@RestController
@RequiredArgsConstructor
public class DocumentoController implements DocumentoAPI {

    private final DocumentoService documentoService;

    @Override
    public DocumentoResponse postDocumento(DocumentoRequest documentoRequest) {
        log.info("[inicia] DocumentoController - postDocumento");
        DocumentoResponse documento = documentoService.salvaDocumento(documentoRequest);
        log.info("[finaliza] DocumentoController - postDocumento");
        return documento;
    }
}
