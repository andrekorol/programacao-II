import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.List;

public class Professor {
    String nome;
    char sexo;  // 'M' ou 'F'
    LocalDate dataContratacao;
    String cpf;
    List<String> disciplinas;
    BigDecimal salario;

    // Constructor
    public Professor(String nome, char sexo, LocalDate dataContratacao, String cpf, List<String> disciplinas, BigDecimal salario) {
        this.nome = nome;
        this.sexo = sexo;
        this.dataContratacao = dataContratacao;
        this.cpf = cpf;
        this.disciplinas = disciplinas;
        this.salario = salario;
    }

    public String info() {
        return "Professor " + this.nome + ", ministra as disciplinas de "
                + this.disciplinas.toString() + ", e recebe um salario de R$ " + this.salario;
    }

    public void adicionaDisciplina(String novaDisciplina) {
        if (!this.disciplinas.contains(novaDisciplina))
            this.disciplinas.add(novaDisciplina);
    }

    public void removeDisciplina(String disciplina) {
        this.disciplinas.remove(disciplina);
    }

    public void aplicaAumento(BigDecimal valorAumento) {
        this.salario = this.salario.add(valorAumento);
    }
}
