/**
 * @author kauas - 05/02/2023 Domingo
 * Livro: Fundamentos da Programação de Computadores
 * Capítulo 6, Exercício Resolvido 15, pág. 176
 */

/*
Faça um programa que preencha um primeiro vetor com dez números inteiros, e um segundo vetor
com cinco números inteiros. O programa deverá mostrar uma lista dos números do primeiro vetor com
seus respectivos divisores armazenados no segundo vetor, bem como suas posiçõees.
Exemplo de saída do programa:

[imagem, pág. 176]

Número 5
Divisível por 5 na posição 3

Número 12
Divisível por 3 na posição 1
Divisível por 2 na posição 5

Número 4
Divisível por 2 na posição 5

Número 7
Não possui divisores no segundo vetor

Número 10
Divisível por 5 na posição 3
Divisível por 2 na posição 5
*/

import java.util.Scanner;

public class ExercicioResolvido15 {
    
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int[] vetor1 = new int[10];
        int[] vetor2 = new int[5];
        int i, j;
        int div;
        boolean achou;


        // ========== Loop para preencher o primeiro vetor ==========
        System.out.println("\n--- Dados do vetor 1 ---");
        for (i=0; i<10; i++) {
            System.out.print("Digite um número inteiro ("+(i+1)+"/10): ");
            vetor1[i] = scanner.nextInt();
        }


        // ========== Loop para preencher o segundo vetor ==========
        System.out.println("\n--- Dados do vetor 2 ---");
        for (i=0; i<5; i++) {
            System.out.print("Digite um número inteiro ("+(i+1)+"/5): ");
            vetor2[i] = scanner.nextInt();
        }


        // ========== Loop para verificar números divisíveis e exibí-los ==========
        System.out.println("\n--------------------\n");
        for (i=0; i<10; i++) {
            achou = false;
            System.out.println("Número "+vetor1[i]);

            for (j=0; j<5; j++) {
                div = vetor1[i] % vetor2[j];

                if (div == 0) {
                    System.out.println("Divisível por "+vetor2[j]+" na posição "+(j+1));
                    achou = true;
                }
            }

            if (achou == false) {
                System.out.println("Não possui divisores no segundo vetor");
            }
            
            System.out.println();
        }

    }

}
