import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.List;

public class Professor extends Funcionario {
    private List<String> disciplinas;

    public Professor(String nome, String endereco, String cidade, String cep, int estado, int telefone,
                     LocalDate dataContratacao, BigDecimal salario, List<String> disciplinas) {
        super(nome, endereco, cidade, cep, estado, telefone, dataContratacao, salario);
        this.disciplinas = disciplinas;
    }

    public List<String> getDisciplinas() {
        return disciplinas;
    }

    public void setDisciplinas(List<String> disciplinas) {
        this.disciplinas = disciplinas;
    }
}
