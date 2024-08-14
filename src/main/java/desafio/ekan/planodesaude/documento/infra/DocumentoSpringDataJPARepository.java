package desafio.ekan.planodesaude.documento.infra;

import desafio.ekan.planodesaude.documento.domain.Documento;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface DocumentoSpringDataJPARepository extends JpaRepository<Documento, UUID> {
}
