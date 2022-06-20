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
        // Declaração de variáveis
        Calendar cal = Calendar.getInstance();
        Date d = new Date();
        int dia, mes, ano, hora, min;
        
        // Coletar hora e data atual
        cal.setTime(d);
        
        // Atribuindo a data e hora
        dia = cal.get(Calendar.DAY_OF_MONTH);
        mes = cal.get(Calendar.MONTH) + 1;
        ano = cal.get(Calendar.YEAR);
        hora = cal.get(Calendar.HOUR);
        min = cal.get(Calendar.MINUTE);
        
        // Exibir dados
        System.out.print(dia+"/"+mes+"/"+ano+" - ");
        
        // Desvio condicional referente ao mês
        switch (mes) {
            case 1 -> System.out.println("Janeiro");
            case 2 -> System.out.println("Fevereiro");
            case 3 -> System.out.println("Março");
            case 4 -> System.out.println("Abril");
            case 5 -> System.out.println("Maio");
            case 6 -> System.out.println("Junho");
            case 7 -> System.out.println("Julho");
            case 8 -> System.out.println("Agosto");
            case 9 -> System.out.println("Setembro");
            case 10 -> System.out.println("Outubro");
            case 11 -> System.out.println("Novembro");
            case 12 -> System.out.println("Dezembro");
            default -> {
            }
        }
        
        // Exibir dado
        System.out.println("Hora atual: "+hora+":"+min);
    }
}
