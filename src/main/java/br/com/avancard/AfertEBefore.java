package br.com.avancard;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class AfertEBefore {
    public static void main(String[] args) {
    try {
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

        Date dataVencimentoBoleto = sdf.parse("15/09/2024");
        Date dataAtual = sdf.parse("10/09/2024");
        if(dataAtual.after(dataVencimentoBoleto)){ //O AFTER permite compararmos se a data 1 é maior que a data 2
            System.out.println("Seu boleto esta vencido!");
        }else{
            System.out.println("Seu boleto não esta vencido");
        }

        if(dataAtual.before(dataVencimentoBoleto)){//O BEFORE permite compararmos se a data 1 é menor que a data 2
            System.out.println("Seu boleto não esta vencido");
        }else{
            System.out.println("Seu boleto esta vencido!");
        }
    }
    catch (ParseException e) {
        e.printStackTrace();
    }
    }
}
