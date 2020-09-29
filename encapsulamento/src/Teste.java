import java.time.LocalDate;

public class Teste {
    public static void main(String[] args) {
        Cliente cliente = new Cliente();
        cliente.setCPF("438.567.245-12");
        cliente.setEmail("azurediamond@bash.org");
        cliente.setConfirmacaoEmail("azurediamond@bash.org");
        cliente.setSenha("hunter2");
        cliente.setConfirmacaoSenha("hunter2");
        cliente.setNome("Azure");
        cliente.setSobrenome("Diamond");
        cliente.setNascimento(LocalDate.parse("1980-03-16"));
        cliente.setRG("30.763.336-0");
        cliente.setSexo('M');
        cliente.setCEP("21164-025");
        cliente.setEndereco("Avenida Uruguai");
        cliente.setNumero((short) 1337);
        cliente.setBairro("Barra da Tijuca");
        cliente.setComplemento("apt.35");
        cliente.setCidade("Rio de Janeiro");
        cliente.setEstado("RJ");
        cliente.setTelefone("21 3344-5566");
        cliente.setCelular("21 98453-5235");

        System.out.println("Dados de Login:\nCPF: " + cliente.getCPF() + ", E-mail: " + cliente.getEmail() +
                ", confirmacao E-mail: " + cliente.getConfirmacaoEmail() + ", Senha: " + cliente.getSenha() +
                ", confirmacao Senha: " + cliente.getConfirmacaoSenha());

        System.out.println("\nDados de Contato:\nNome: " + cliente.getNome() + ", Sobrenome: " +
                cliente.getSobrenome() + ", Nascimento: " + cliente.getNascimento() +
                ", RG: " + cliente.getRG() + ", Sexo: " + cliente.getSexo() + ", CEP: " +
                cliente.getCEP() + ", Endereco: " + cliente.getEndereco() + ", N°: "
                + cliente.getNumero() + ", Bairro: " + cliente.getBairro() + ", Complemento: " +
                cliente.getComplemento() + ", Cidade: " + cliente.getCidade() + ", Estado: " +
                cliente.getEstado() + ", DDD+Telefone: " + cliente.getTelefone() +
                ", DDD+Celular: " + cliente.getCelular());
    }
}
