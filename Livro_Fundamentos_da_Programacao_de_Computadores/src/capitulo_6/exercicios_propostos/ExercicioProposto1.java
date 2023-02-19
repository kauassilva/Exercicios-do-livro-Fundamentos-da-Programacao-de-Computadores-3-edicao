/**
 * @author kauas - 18/02/2023 Sábado
 * Livro: Fundamentos da Programação de Computadores
 * Capítulo 6, Exercício Proposto 1, pág. 190
 */

/*
Faça um programa que preencha um vetor com seis elementos numéricos inteiros. Calcule e mostre:

- todos os números pares;
- a quantidade de números pares;
- todos os números ímpares
- a quantidade de números ímpares.
*/

package capitulo_6.exercicios_propostos;

import java.util.Scanner;

public class ExercicioProposto1 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int[] numeros = new int[6];


        // Preenche o vetor de números inteiros
        System.out.println();
        for (int i=0; i<numeros.length; i++) {
            System.out.print("Digite o "+(i+1)+"º número inteiro: ");
            numeros[i] = scanner.nextInt();
        }


        // Verifica se o número é par
        int qtdPar = 0;
        System.out.print("\nNúmeros pares: ");
        for (int i=0; i<numeros.length; i++) {
            // Mostra o número par e aumenta o contador
            if (numeros[i]%2 == 0) {
                System.out.print(numeros[i]+" ");
                qtdPar++;
            }
        }
        System.out.println("\nQuantidade de números pares: "+qtdPar);


        // Verifica se o número é ímpar
        int qtdImpar = 0;
        System.out.print("\nNúmeros ímpares: ");
        for (int i=0; i<numeros.length; i++) {
            // Mostra o número ímpar e aumenta o contador
            if (numeros[i]%2 != 0) {
                System.out.print(numeros[i]+" ");
                qtdImpar++;
            }
        }
        System.out.println("\nQuantidade de números pares: "+qtdImpar);

    }

}