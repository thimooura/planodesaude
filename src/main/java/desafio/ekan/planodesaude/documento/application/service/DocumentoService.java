package desafio.ekan.planodesaude.documento.application.service;

import desafio.ekan.planodesaude.documento.application.DocumentoRequest;
import desafio.ekan.planodesaude.documento.application.DocumentoResponse;

public interface DocumentoService {
    DocumentoResponse salvaDocumento(DocumentoRequest documentoRequest);

}
