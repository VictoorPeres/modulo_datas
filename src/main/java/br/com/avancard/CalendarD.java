package br.com.avancard;

import java.text.ParseException;
import java.util.Calendar;
import java.text.SimpleDateFormat;

public class CalendarD {
    public static void main(String[] args) throws ParseException {

        Calendar calendar = Calendar.getInstance(); //Pega a data atual

        calendar.setTime(new SimpleDateFormat("dd/MM/yyyy").parse("18/09/2024"));

        calendar.add(Calendar.DAY_OF_MONTH, 1);// Somando um dia

        System.out.println("Somando um dia: " + new SimpleDateFormat("dd/MM/yyyy").format(calendar.getTime()));

        calendar.add(Calendar.MONTH, 1);
        System.out.println("Somando um mês: " + new SimpleDateFormat("dd/MM/yyyy").format(calendar.getTime()));

        calendar.add(Calendar.YEAR, 1);
        System.out.println("Somando um ano: " + new SimpleDateFormat("dd/MM/yyyy").format(calendar.getTime()));

    }

}
