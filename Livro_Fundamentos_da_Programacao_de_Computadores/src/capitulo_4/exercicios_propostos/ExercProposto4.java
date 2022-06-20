/**
 * @author kauas - 23/04/2022 sábado
 * Livro: Fundamentos da Programação de Computadores
 * Capítulo 4, Exercício Proposto 4, pág.90
 */

/*
Faça um programa que receba três números e mostre o maior
 */
package capitulo_4.exercicios_propostos;

import java.util.Scanner;

public class ExercProposto4 {

    public static void main(String[] args) {
        // Declaração de variáveis 
        Scanner entrada = new Scanner(System.in);
        float num1, num2, maior = 0;

        // Coletar dados
        System.out.println("\nDigite dois números:");
        num1 = entrada.nextFloat();
        num2 = entrada.nextFloat();

        // Desvio condicional para coletar o maior número
        if (num1 != num2) {
            if (num1 < num2) {
                maior = num2;
            } else if (num2 < num1) {
                maior = num1;
            }

            System.out.println("\nMaior número: " + maior + "\n");
        } else {
            System.out.println("\nOs números são iguais\n");
        }

        entrada.close();
    }
}
