package com.andrekorol.atividade03;

import com.andrekorol.atividade03.datas.Data;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Cria uma instancia da classe Aluno
        Aluno andre = new Aluno("Andre Rossi Korol", 'M', 1810067, Data.gerar("16-04-1997"), false, "019.437.570-12");

        System.out.println("Informacoes do aluno: " + andre.info());

        System.out.println("Atualiza informacoes do aluno...");
        andre.modificaBolsa();
        andre.atualizaMatricula(2110067);

        System.out.println("Novas informacoes do aluno: " + andre.info());

        // Cria uma instancia da classe Professor
        List<String> disciplinasIniciais = new ArrayList<>(Arrays.asList("Circuitos Logicos II", "Circuitos Eletricos II"));

        Professor mestreDaniel = new Professor("Daniel Gutierez", 'M', Data.gerar("15-01-2010"), "456.321.256-12", disciplinasIniciais, 13373.43);

        System.out.println(mestreDaniel.info());

        System.out.println("Atualiza as informacoes do professor...");
        mestreDaniel.adicionaDisciplina("Programacao I");
        mestreDaniel.removeDisciplina("Circuitos Logicos II");
        mestreDaniel.aplicaAumento(1738.42);

        System.out.println(mestreDaniel.info());
    }
}
