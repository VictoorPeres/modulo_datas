package br.com.avancard;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class GerarParcelas {
    public static void main(String[] args) throws ParseException {

        Date dateInicial = new SimpleDateFormat("dd/MM/yyyy").parse("18/09/2024");

        Calendar calendar = Calendar.getInstance();
        calendar.setTime(dateInicial);

        for(int i = 1; i <= 12; i++){
            calendar.add(Calendar.MONTH, 1);
            System.out.println(new SimpleDateFormat("dd/MM/yyyy").format(calendar.getTime()));
        }

    }
}
