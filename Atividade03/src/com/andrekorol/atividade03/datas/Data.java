package com.andrekorol.atividade03.datas;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;

public final class Data {
    public static LocalDate gerar(String data) {
        // Inicializa uma data de nascimento de classe LocalDate
        LocalDate dataNascimento = null;
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        try {
            dataNascimento = LocalDate.parse(data, dtf);
        } catch (DateTimeParseException e) {
            e.printStackTrace();
        }
        return dataNascimento;
    }
}
