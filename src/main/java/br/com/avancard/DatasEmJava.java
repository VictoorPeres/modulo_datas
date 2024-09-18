package br.com.avancard;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class DatasEmJava {

    public static void main(String[] args) {
    Date date = new Date();

try {
    System.out.println("Data em milisegundo: " + date.getTime());

    System.out.println("Dia do mês: " + date.getDate());

    System.out.println("Dia da semana: " + date.getDay());

    System.out.println("Hora: " + date.getHours());

    System.out.println("Minuto da hora: " + date.getMinutes());

    System.out.println("Segundos: " + date.getSeconds());

    System.out.println("Ano: " + (date.getYear() + 1900));



    /* ---------------------------SIMPLE DATE FORMAT--------------------------------- */
    SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy hh:mm:ss");
    System.out.println("Data atual em formato padrão string: " + simpleDateFormat.format(date));


    simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm.ss");
    System.out.println("Data em formato para banco de dados: " + simpleDateFormat.parse("1993-06-21 18:05.10"));


    simpleDateFormat = new SimpleDateFormat("dd/mm/yyyy");
    System.out.println("Objeto Date: " + simpleDateFormat.parse("21/06/1993"));


    /* ---------------------CALENDAR------------------- */
    Calendar calendar = Calendar.getInstance().getInstance();

    System.out.println("Calendar em milisegundo: " + calendar.getTimeInMillis());

    System.out.println("Calendar do mês: " + calendar.get(calendar.DAY_OF_MONTH));

    System.out.println("Calendar da semana: " + (calendar.get(Calendar.DAY_OF_WEEK) - 1));

    System.out.println("Calendar Hora: " + calendar.get(calendar.HOUR_OF_DAY));

    System.out.println("Calendar minuto da hora: " + calendar.get(calendar.MINUTE));

    System.out.println("Calendar segundos: " + calendar.get(Calendar.SECOND));

    System.out.println("Calendar ano: " + calendar.get(Calendar.YEAR));

    System.out.println("Calendar data atual em formato padrão string: " + simpleDateFormat.format(calendar.getTime()));

    System.out.println("Data em formato para banco de dados: " + simpleDateFormat.format(calendar.getTime() ));
}catch (ParseException e) {
    e.printStackTrace();
    System.out.println("Erro: " + e.getMessage());
}
    }
}
