import java.time.LocalDate;

public class Aluno extends Pessoa {
    private long matricula;
    private LocalDate dataNascimento;
    private boolean bolsista;

    public Aluno(String nome, String endereco, String cidade, String cep, int estado, int telefone, long matricula,
                 LocalDate dataNascimento, boolean bolsista) {
        super(nome, endereco, cidade, cep, estado, telefone);
        this.matricula = matricula;
        this.dataNascimento = dataNascimento;
        this.bolsista = bolsista;
    }

    public long getMatricula() {
        return matricula;
    }

    public void setMatricula(long matricula) {
        this.matricula = matricula;
    }

    public LocalDate getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(LocalDate dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public boolean isBolsista() {
        return bolsista;
    }

    public void setBolsista(boolean bolsista) {
        this.bolsista = bolsista;
    }
}
