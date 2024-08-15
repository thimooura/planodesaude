package desafio.ekan.planodesaude.documento.application.repository;

import desafio.ekan.planodesaude.documento.domain.Documento;

import java.util.UUID;

public interface DocumentoRepository {
    Documento salvaDocumento(Documento documento);
    Documento buscaDocumentoAtravesId(UUID idDocumento);
    void deletaDocumento(Documento documento);
}
