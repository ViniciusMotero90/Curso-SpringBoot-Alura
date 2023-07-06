package med.voll.api.medico;

import jakarta.validation.constraints.NotNull;

import java.util.UUID;

public record DadosAtualizacaoMedico(
        @NotNull
        long id,
        String nome,
        String telefone,
        DadosEndereco endereco) {
}
