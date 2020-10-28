import java.math.BigDecimal;
import java.time.LocalDate;

public class Funcionario extends Pessoa {
    private LocalDate dataContratacao;
    private BigDecimal salario;

    public Funcionario(String nome, String endereco, String cidade, String cep, int estado, int telefone,
                       LocalDate dataContratacao, BigDecimal salario) {
        super(nome, endereco, cidade, cep, estado, telefone);
        this.dataContratacao = dataContratacao;
        this.salario = salario;
    }

    public LocalDate getDataContratacao() {
        return dataContratacao;
    }

    public void setDataContratacao(LocalDate dataContratacao) {
        this.dataContratacao = dataContratacao;
    }

    public BigDecimal getSalario() {
        return salario;
    }

    public void setSalario(BigDecimal salario) {
        this.salario = salario;
    }
}
