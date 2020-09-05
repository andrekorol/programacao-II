package com.andrekorol.atividade03;

import java.time.LocalDate;

public class Aluno {
    String nome;
    char sexo;  // 'M' ou 'F'
    long matricula;
    LocalDate dataNascimento;
    boolean bolsista;
    String cpf;

    // Constructor para Aluno
    public Aluno(String nome, char sexo, long matricula, LocalDate dataNascimento, boolean bolsista, String cpf) {
        this.nome = nome;
        this.sexo = sexo;
        this.matricula = matricula;
        this.dataNascimento = dataNascimento;
        this.bolsista = bolsista;
        this.cpf = cpf;
    }

    public void modificaBolsa() {
        this.bolsista = !this.bolsista;
    }

    public void atualizaMatricula(long novaMatricula) {
        this.matricula = novaMatricula;
    }

    public String info() {
        return this.nome + ", " + (this.bolsista ? "" : "nao ") + "bolsista, matricula " + this.matricula;
    }
}
