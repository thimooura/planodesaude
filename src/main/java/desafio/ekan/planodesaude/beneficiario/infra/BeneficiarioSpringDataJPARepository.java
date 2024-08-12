package desafio.ekan.planodesaude.beneficiario.infra;

import desafio.ekan.planodesaude.beneficiario.domain.Beneficiario;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

public interface BeneficiarioSpringDataJPARepository extends JpaRepository<Beneficiario, UUID> {
    Optional<Beneficiario> findById(UUID IdBeneficiario);
}
