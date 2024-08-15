package desafio.ekan.planodesaude.documento.application.service;

import desafio.ekan.planodesaude.documento.application.api.DocumentoRequest;
import desafio.ekan.planodesaude.documento.application.api.DocumentoResponse;
import desafio.ekan.planodesaude.documento.application.api.DocumentoAlteracaoRequest;
import desafio.ekan.planodesaude.documento.domain.Documento;

import java.util.UUID;

public interface DocumentoService {
    DocumentoResponse salvaDocumento(DocumentoRequest documentoRequest);
    Documento buscaDocumentoPorId(UUID idDocumento);
    void alteraDocumento(UUID idDocumento, DocumentoAlteracaoRequest documentoAlteracaoRequest);
    void deletaDocumento(UUID idDocumento);
}
