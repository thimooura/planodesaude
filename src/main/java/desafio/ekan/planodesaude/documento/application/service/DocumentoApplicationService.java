package desafio.ekan.planodesaude.documento.application.service;

import desafio.ekan.planodesaude.beneficiario.application.service.BeneficiarioService;
import desafio.ekan.planodesaude.documento.application.api.DocumentoRequest;
import desafio.ekan.planodesaude.documento.application.api.DocumentoResponse;
import desafio.ekan.planodesaude.documento.application.api.DocumentoAlteracaoRequest;
import desafio.ekan.planodesaude.documento.application.repository.DocumentoRepository;
import desafio.ekan.planodesaude.documento.domain.Documento;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Service;

import java.util.UUID;

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

    @Override
    public Documento buscaDocumentoPorId(UUID idDocumento) {
        log.info("[inicia] DocumentoService - buscaDocumentoPorId");
        Documento documento = documentoRepository.buscaDocumentoAtravesId(idDocumento);
        log.info("[finaliza] DocumentoService - buscaDocumentoPorId");
        return documento;
    }

    @Override
    public void alteraDocumento(UUID idDocumento, DocumentoAlteracaoRequest documentoAlteracaoRequest) {
        log.info("[inicia] DocumentoService - alteraDocumento");
        Documento documento = documentoRepository.buscaDocumentoAtravesId(idDocumento);
        documento.altera(documentoAlteracaoRequest);
        documentoRepository.salvaDocumento(documento);
        log.info("[finaliza] DocumentoService - alteraDocumento");

    }

    @Override
    public void deletaDocumento(UUID idDocumento) {
        log.info("[inicia] DocumentoApplicationService - deletaPoder");
        Documento documento = documentoRepository.buscaDocumentoAtravesId(idDocumento);
        documentoRepository.deletaDocumento(documento);
        log.info("[finaliza] DocumentoApplicationService - deletaPoder");
    }
    }

