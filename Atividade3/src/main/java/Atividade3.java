import datas.Data;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Atividade3 {
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

        Professor mestreDaniel = new Professor("Daniel Gutierez", 'M', Data.gerar("15-01-2010"), "456.321.256-12",
                disciplinasIniciais, BigDecimal.valueOf(13373.43));

        System.out.println(mestreDaniel.info());

        System.out.println("Atualiza as informacoes do professor...");
        mestreDaniel.adicionaDisciplina("Programacao I");
        mestreDaniel.removeDisciplina("Circuitos Logicos II");
        mestreDaniel.aplicaAumento(BigDecimal.valueOf(1738.42));

        System.out.println(mestreDaniel.info());

        // Cria uma instancia da classe Carro
        Carro dreamCar = new Carro("Lamborghini", "Sian FKP 37", (short) 2020, "BTC-1738", false);

        System.out.println(dreamCar.info());

        System.out.println("Atualiza informacoes do carro...");
        dreamCar.atualizaLicenciamento();
        dreamCar.atualizaPlaca("ETH-1337");

        System.out.println(dreamCar.info());

        // Cria uma instancia da classe Sapato
        Sapato huarache = new Sapato("Nike", "Huarache", "azul", 599);
        huarache.atualizaPreco(499);
        System.out.println(huarache.info());

        // Cria uma instancia da classe Cabeca
        Cabeca minhaCabeca = new Cabeca((float) 8.2, 15, (float) 4.7, true);
        minhaCabeca.arranca();
        System.out.println(minhaCabeca.info());

        // Cria uma instancia da classe Olho
        Olho meuOlho = new Olho("caramelo", false);
        System.out.println(meuOlho.info());

        System.out.println("Altera caracteristicas do olho...");
        meuOlho.mudaCor("azul");
        meuOlho.abre();
        System.out.println(meuOlho.info());
    }
}
