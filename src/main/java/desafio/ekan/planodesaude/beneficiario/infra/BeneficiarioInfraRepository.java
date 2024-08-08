package desafio.ekan.planodesaude.beneficiario.infra;

import desafio.ekan.planodesaude.beneficiario.application.repository.BeneficiarioRepository;
import desafio.ekan.planodesaude.beneficiario.domain.Beneficiario;
import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Repository;

@Repository
@Log4j2
public class BeneficiarioInfraRepository implements BeneficiarioRepository {

    @Override
    public Beneficiario salva(Beneficiario beneficiario) {
        log.info("[inicia] BeneficiarioInfraRepository - salva");
        beneficiarioSpringDataJPARepository.save(beneficiario);
        log.info("[finaliza] BeneficiarioInfraRepository - salva");
        return beneficiario;
    }
}
