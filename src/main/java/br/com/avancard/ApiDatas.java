package br.com.avancard;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class ApiDatas {
    public static void main(String[] args) {

        /* Nova API de data a partir do Java 8 */

        LocalDate dataAtual = LocalDate.now();
        System.out.println("Data atual: " + dataAtual);

        LocalTime horaAtual = LocalTime.now();
        System.out.println("Hora atual: " + horaAtual);

        LocalDateTime dataAtualHoraAtual = LocalDateTime.now();
        System.out.println("Data e hora atual: " + dataAtualHoraAtual.format(DateTimeFormatter.ofPattern("dd/MM/yyyy hh:mm:ss"))); //Formatando data e hora de acordo com o padrao brasileiro

    }
}
