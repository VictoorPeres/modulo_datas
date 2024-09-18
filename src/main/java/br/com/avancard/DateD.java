package br.com.avancard;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class DateD {
    public static void main(String[] args) {

        long dias = ChronoUnit.WEEKS.between(LocalDate.parse("2024-06-18"), LocalDate.now());// total de dias de uma data ate a data de hoje
        System.out.println("Dias: " + dias);

    }
}
