package desafio.ekan.planodesaude.documento.application.service;

import desafio.ekan.planodesaude.beneficiario.application.service.BeneficiarioService;
import desafio.ekan.planodesaude.documento.application.DocumentoRequest;
import desafio.ekan.planodesaude.documento.application.DocumentoResponse;
import desafio.ekan.planodesaude.documento.application.repository.DocumentoRepository;
import desafio.ekan.planodesaude.documento.domain.Documento;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Service;

@Log4j2
@Service
@RequiredArgsConstructor
public class DocumentoApplicationService implements DocumentoService {
    private final DocumentoRepository documentoRepository;
    private final BeneficiarioService beneficiarioService;
    @Override
    public DocumentoResponse salvaDocumento(DocumentoRequest documentoRequest) {
        log.info("[inicia] DocumentoService - salvaDocumento");
        beneficiarioService.buscaBeneficiarioAtravesId(documentoRequest.getIdBeneficiarioCriado());
        Documento documento = documentoRepository.salvaDocumento(new Documento(documentoRequest));
        log.info("[finaliza] DocumentoService - salvaDocumento");
        return DocumentoResponse.builder().idDocumento(documento.getIdDocumento()).build();
    }
}
