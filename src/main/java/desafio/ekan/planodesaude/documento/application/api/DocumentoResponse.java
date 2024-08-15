package desafio.ekan.planodesaude.documento.application.api;

import lombok.Builder;
import lombok.Value;

import java.util.UUID;

@Value
@Builder
public class DocumentoResponse {
    private UUID idDocumento;
}
