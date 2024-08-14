package desafio.ekan.planodesaude.documento.application.repository;

import desafio.ekan.planodesaude.documento.domain.Documento;

public interface DocumentoRepository {
    Documento salvaDocumento(Documento documento);
}
