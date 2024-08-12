package desafio.ekan.planodesaude.documento.domain;

import java.time.LocalDateTime;
import java.util.UUID;

public class Documento {

    private UUID idBeneficiario;
    private String nome;
    private String CPF;
    private String RG;
    private LocalDateTime DataInclusao;
    private LocalDateTime DataAtualizacao;
}
