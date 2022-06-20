/**
@author kauas - 27/03/2022 Domingo
Livro: Fundamentos da Programação de Computadores
Capítulo 3, Exercício Resolvido 24, pág.49
*/

/*
Faça um programa que receba uma hora formada por hora e minutos (um número
real), calcule e mostre a hora digitada apenas em minutos. Lembre-se que:
- Para quatro e meia, deve-se digitar 4.30;
- Os minutos vão de 0 a 59
*/
package capitulo_3.exercicios_resolvidos;

import java.util.Scanner;

public class ExercResolvido24 {

    public static void main(String[] args) {
        // Declaração de variáveis
        Scanner entrada = new Scanner(System.in);
        float horaMin, min, convHoraMin;
        int hora, minTotal;
        
        // Coletar dado
        System.out.print("Digite uma hora (Exemplo: 4h30 -> 4,30): ");
        horaMin = entrada.nextFloat();
        
        // Operações referentes a conversão de horas para minutos
        hora = (int) horaMin;
        min = horaMin - hora;
        min = min * 100;
        convHoraMin = hora * 60;
        minTotal = (int) (convHoraMin + min);
        
        // Exibir dado
        System.out.println("\nAs horas informadas em minutos é "+minTotal);

        entrada.close();
    }
    
}
