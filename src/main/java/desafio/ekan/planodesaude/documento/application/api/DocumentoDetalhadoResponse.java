package desafio.ekan.planodesaude.documento.application.api;

import desafio.ekan.planodesaude.documento.domain.Documento;
import jakarta.persistence.Column;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.Value;

import java.time.LocalDateTime;
import java.util.UUID;
@Value
public class DocumentoDetalhadoResponse {
    private UUID idDocumento;
    private UUID idBeneficiarioCriado;
    private String nome;
    private String CPF;
    private String RG;
    private LocalDateTime DataInclusao;

public DocumentoDetalhadoResponse(Documento documento){
    this.idDocumento = documento.getIdDocumento();
    this.idBeneficiarioCriado = documento.getIdBeneficiarioCriado();
    this.nome = documento.getNome();
    this.CPF = documento.getCPF();
    this.RG = documento.getRG();
    this.DataInclusao = LocalDateTime.now();

}


}
