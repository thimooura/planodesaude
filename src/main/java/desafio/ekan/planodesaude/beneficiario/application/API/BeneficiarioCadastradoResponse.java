package desafio.ekan.planodesaude.beneficiario.application.API;

import lombok.Builder;
import lombok.Value;

import java.util.UUID;

@Value
@Builder
public class BeneficiarioCadastradoResponse {
    private UUID idBeneficiario;

}
