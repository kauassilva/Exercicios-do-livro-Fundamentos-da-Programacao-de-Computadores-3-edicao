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
        Scanner entrada = new Scanner(System.in);
        float horaMin, hora, min, convHoraMin, minTotal;
        
        System.out.print("Digite uma hora (Exemplo: 4h30 -> 4.30): ");
        horaMin = entrada.nextFloat();
        
        hora = (int) horaMin;
        min = horaMin - hora;
        min = min * 100;
        convHoraMin = hora * 60;
        minTotal = convHoraMin + min;
        
        System.out.println("As horas informadas em minutos é "+(int)minTotal);

        entrada.close();
    }
    
}
