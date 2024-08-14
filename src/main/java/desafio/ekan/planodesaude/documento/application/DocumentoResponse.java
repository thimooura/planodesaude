package desafio.ekan.planodesaude.documento.application;

import lombok.Builder;
import lombok.Value;

import java.util.UUID;

@Value
@Builder
public class DocumentoResponse {
    private UUID idDocumento;
}
