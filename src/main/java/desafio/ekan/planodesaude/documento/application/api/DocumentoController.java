package desafio.ekan.planodesaude.documento.application.api;

import desafio.ekan.planodesaude.documento.application.service.DocumentoService;
import desafio.ekan.planodesaude.documento.domain.Documento;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;

@Log4j2
@RestController
@RequiredArgsConstructor
public class DocumentoController implements DocumentoAPI {
    private final DocumentoService documentoService;

    @Override
    public DocumentoResponse postDocumento(DocumentoRequest documentoRequest) {
        log.info("[inicia] DocumentoController - postDocumento");
        log.info("[ID_DOCUMENTO] {}", documentoRequest.getIdBeneficiarioCriado());
        DocumentoResponse documento = documentoService.salvaDocumento(documentoRequest);
        log.info("[finaliza] DocumentoController - postDocumento");
        return documento;
    }

    @Override
    public DocumentoDetalhadoResponse getDocumentoPorId(UUID idDocumento) {
        log.info("[inicia] DocumentoController - getDocumentoPorId");
        log.info("[ID_DOCUMENTO] {}", idDocumento);
        Documento documento = documentoService.buscaDocumentoPorId(idDocumento);
        log.info("[finaliza] DocumentoController - getDocumentoPorId");
        return new DocumentoDetalhadoResponse(documento);
    }

    @Override
    public void patchAlteraDocumento(UUID idDocumento, DocumentoAlteracaoRequest documentoAlteracaoRequest) {
        log.info("[inicia] DocumentoController - patchAlteraDocumento");
        log.info("[ID_DOCUMENTO] {}", idDocumento);
        documentoService.alteraDocumento(idDocumento, documentoAlteracaoRequest);
        log.info("[finaliza] DocumentoController - patchAlteraDocumento");
    }

    @Override
    public void deleteDocumento(UUID idDocumento) {
        log.info("[inicia] DocumentoController - deleteDocumento");
        log.info("[ID_DOCUMENTO] {}", idDocumento);
        documentoService.deletaDocumento(idDocumento);
        log.info("[finaliza] DocumentoController - deleteDocumento");

    }


}
