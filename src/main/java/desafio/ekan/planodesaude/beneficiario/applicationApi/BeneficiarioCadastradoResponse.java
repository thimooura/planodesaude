package desafio.ekan.planodesaude.beneficiario.applicationApi;

import lombok.Builder;
import lombok.Value;

import java.util.UUID;

@Value
@Builder
public class BeneficiarioCadastradoResponse {
    private UUID id;

}
