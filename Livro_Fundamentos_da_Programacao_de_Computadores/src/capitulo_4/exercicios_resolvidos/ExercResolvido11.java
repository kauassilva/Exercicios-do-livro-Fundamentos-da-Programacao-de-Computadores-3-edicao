/**
@author kauas - 14/04/2022 Quinta
Livro: Fundamentos da Programação de Computadores
Capítulo 4, Exercício Resolvido 11, pág.71
*/

/*
Faça um programa que receba a hora do ínicio de um jogo e a hora de trmino
(cada hora é composta por duas variáveis inteiras: hora e minuto). Calcule e
mostre a duração do jogo (horas e minutos), sabendo que o tempo máximo de
duração do jogo é de 24 horas e que ele pode começar em um dia e terminar no dia
seguinte.
*/
package capitulo_4.exercicios_resolvidos;

import java.util.Scanner;

public class ExercResolvido11 {
    
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int hora1, min1, hora2, min2, hora3, min3;
        
        System.out.println("Digite o horário inicial");
        System.out.print("Hora: ");
        hora1 = entrada.nextInt();
        System.out.print("Minuto: ");
        min1 = entrada.nextInt();
        System.out.println("Digite o horário final");
        System.out.print("Hora: ");
        hora2 = entrada.nextInt();
        System.out.print("Minuto: ");
        min2 = entrada.nextInt();
        
        if (min1 > min2) {
            min2 = min2 + 60;
            hora2 = hora2 - 1;
        } else if (hora1 > hora2) {
            hora2 = hora2 + 24;
        }
        
        min3 = min2 - min1;
        hora3 = hora2 - hora1;
        
        System.out.println("Duração do jogo: "+hora3+" hora(s) e "+min3+" minuto(s)");

        entrada.close();
    }
}
