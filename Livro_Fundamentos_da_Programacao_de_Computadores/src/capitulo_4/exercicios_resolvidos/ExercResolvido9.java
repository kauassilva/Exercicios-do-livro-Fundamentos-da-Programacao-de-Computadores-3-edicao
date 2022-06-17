/**
@author kauas - 14/04/2022 Quinta
Livro: Fundamentos da Programação de Computadores
Capítulo 4, Exercício Resolvido 9, pág.68
*/

/*
Faça um programa que mostre a data e a hora do sistema nos seguintes formatos:
DD/MM/AAAA - mês por extenso e hora:minuto
*/
package capitulo_4.exercicios_resolvidos;

import java.util.Calendar;
import java.util.Date;

public class ExercResolvido9 {
    
    public static void main(String[] args) {
        Calendar cal = Calendar.getInstance();
        Date d = new Date();
        int dia, mes, ano, hora, min;
        
        cal.setTime(d);
        
        dia = cal.get(Calendar.DAY_OF_MONTH);
        mes = cal.get(Calendar.MONTH) + 1;
        ano = cal.get(Calendar.YEAR);
        hora = cal.get(Calendar.HOUR);
        min = cal.get(Calendar.MINUTE);
        
        System.out.print(dia+"/"+mes+"/"+ano+" - ");
        
        if (mes == 1) {
            System.out.println("Janeiro");
        } else if (mes == 2) {
            System.out.println("Fevereiro");
        } else if (mes == 3) {
            System.out.println("Março");
        } else if (mes == 4) {
            System.out.println("Abril");
        } else if (mes == 5) {
            System.out.println("Maio");
        } else if (mes == 6) {
            System.out.println("Junho");
        } else if (mes == 7) {
            System.out.println("Julho");
        } else if (mes == 8) {
            System.out.println("Agosto");
        } else if (mes == 9) {
            System.out.println("Setembro");
        } else if (mes == 10) {
            System.out.println("Outubro");
        } else if (mes == 11) {
            System.out.println("Novembro");
        } else if (mes == 12) {
            System.out.println("Dezembro");
        }
        System.out.println("Hora atual: "+hora+":"+min);
    }
}
