package desafio.ekan.planodesaude.documento.infra;

import desafio.ekan.planodesaude.documento.application.repository.DocumentoRepository;
import desafio.ekan.planodesaude.documento.domain.Documento;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Repository;

@Log4j2
@Repository
@RequiredArgsConstructor
public class DocumentoInfraRepository implements DocumentoRepository {
    private final DocumentoSpringDataJPARepository documentoSpringDataJPARepository;

    @Override
    public Documento salvaDocumento(Documento documento) {
        documentoSpringDataJPARepository.save(documento);
        return documento;
    }
}
