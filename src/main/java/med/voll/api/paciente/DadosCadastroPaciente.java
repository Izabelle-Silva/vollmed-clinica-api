package med.voll.api.paciente;

import med.voll.api.endereco.DadosEndereco;
//isso é um DTO

public record DadosCadastroPaciente (
        String nome,
        String email,
        String telefone,
        String cpf,
        DadosEndereco endereco) {
}
