package com.andrekorol.atividade03;

import com.andrekorol.atividade03.datas.DataNascimento;

public class Main {
    public static void main(String[] args) {
        // Cria uma instancia da classe Aluno
        Aluno andre = new Aluno("Andre Rossi Korol", 'M', 1810067, DataNascimento.gerar("16-04-1997"), false, "019-437-570-12");

        System.out.println("Informacoes do aluno: " + andre.info());

        System.out.println("Atualiza informacoes do aluno...");
        andre.modificaBolsa();
        andre.atualizaMatricula(2110067);

        System.out.println("Novas informacoes do aluno: " + andre.info());

        System.out.println(andre.dataNascimento);
    }
}
