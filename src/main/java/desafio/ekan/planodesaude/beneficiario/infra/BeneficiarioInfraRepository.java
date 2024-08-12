package desafio.ekan.planodesaude.beneficiario.infra;

import desafio.ekan.planodesaude.beneficiario.application.repository.BeneficiarioRepository;
import desafio.ekan.planodesaude.beneficiario.domain.Beneficiario;
import desafio.ekan.planodesaude.handler.APIException;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.UUID;

@Repository
@Log4j2
@RequiredArgsConstructor
public class BeneficiarioInfraRepository implements BeneficiarioRepository {
        private final BeneficiarioSpringDataJPARepository beneficiarioSpringDataJPARepository;
    @Override
    public Beneficiario salva(Beneficiario beneficiario) {
        log.info("[inicia] BeneficiarioInfraRepository - salva");
        beneficiarioSpringDataJPARepository.save(beneficiario);
        log.info("[finaliza] BeneficiarioInfraRepository - salva");
        return beneficiario;
    }

    @Override
    public List<Beneficiario> buscaTodosBeneficiarios() {
        log.info("[inicia] BeneficiarioInfraRepository - buscaTodosBeneficiarios");
        List<Beneficiario> todosBeneficiarios = beneficiarioSpringDataJPARepository.findAll();
        log.info("[finaliza] BeneficiarioInfraRepository - buscaTodosBeneficiarios");
        return todosBeneficiarios;
    }
    @Override
    public Beneficiario buscaBeneficiarioAtravesId(UUID idBeneficiario) {
        log.info("[inicia] BeneficiarioInfraRepository - BuscaBeneficiarioAtravesId");
        Beneficiario beneficiario = beneficiarioSpringDataJPARepository.findById(idBeneficiario)
                .orElseThrow(() -> APIException.build(HttpStatus.NOT_FOUND, "Beneficiario não encontrado!"));
        log.info("[finaliza] BeneficiarioInfraRepository - BuscaBeneficiarioAtravesId");

        return beneficiario;
    }


}
