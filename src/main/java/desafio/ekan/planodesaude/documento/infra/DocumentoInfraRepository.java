package desafio.ekan.planodesaude.documento.infra;

import desafio.ekan.planodesaude.documento.application.repository.DocumentoRepository;
import desafio.ekan.planodesaude.documento.domain.Documento;
import desafio.ekan.planodesaude.handler.APIException;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Log4j2
@Repository
@RequiredArgsConstructor
public class DocumentoInfraRepository implements DocumentoRepository {
    private final DocumentoSpringDataJPARepository documentoSpringDataJPARepository;

    @Override
    public Documento salvaDocumento(Documento documento) {
        log.info("[inicia] DocumentoInfraRepository - salvaDocumento");
        documentoSpringDataJPARepository.save(documento);
        log.info("[finaliza] DocumentoInfraRepository - salvaDocumento");
        return documento;
    }

    @Override
    public Documento buscaDocumentoAtravesId(UUID idDocumento) {
        log.info("[inicia] DocumentoInfraRepository - buscaDocumentoAtravesId");
        Documento documento = documentoSpringDataJPARepository.findById(idDocumento)
                .orElseThrow(() -> APIException.build(HttpStatus.NOT_FOUND, "Documento não encontrado!"));
        log.info("[finaliza] DocumentoInfraRepository - buscaDocumentoAtravesId");
        return documento;
    }

    @Override
    public void deletaDocumento(Documento documento) {
            log.info("[inicia] DocumentoInfraRepository - deletaPoder");
            documentoSpringDataJPARepository.delete(documento);
            log.info("[finaliza] DocumentoInfraRepository - deletaPoder");
        
    }

}
