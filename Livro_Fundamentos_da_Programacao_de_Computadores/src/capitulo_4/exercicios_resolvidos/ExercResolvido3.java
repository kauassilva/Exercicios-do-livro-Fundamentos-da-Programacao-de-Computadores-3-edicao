/**
@author kauas - 14/04/2022 Quinta
Livro: Fundamentos da Programação de Computadores
Capítulo 4, Exercício Resolvido 3, pág.63
*/

/*
Faça um programa que receba dois números e mostre o maior.
*/
package capitulo_4.exercicios_resolvidos;

import java.util.Scanner;

public class ExercResolvido3 {
   
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        float num1, num2;
        
        System.out.println("Digite dois números: ");
        num1 = entrada.nextFloat();
        num2 = entrada.nextFloat();
        
        if (num1 > num2) {
            System.out.println("O maior número é "+num1);
        } else if (num1 < num2) {
            System.out.println("O maior número é "+num2);
        } else if (num1 == num2) {
            System.out.println("Ambos os números são iguais");
        } else {
            System.out.println("Algo inesperado ocorreu...");
        }

        entrada.close();
    }
}
