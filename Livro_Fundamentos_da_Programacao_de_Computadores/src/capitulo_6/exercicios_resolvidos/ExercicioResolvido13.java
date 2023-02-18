/**
 * @author kauas - 02/02/2023 Quinta
 * Livro: Fundamentos da Programação de Computadores
 * Capítulo 6, Exercício Resolvido 13, pág. 175
 */

/*
Faça um programa que preencha um vetor com dez números inteiros, calcule e mostre os números
superiores a cinquenta e suas respectivas posições. O programa deverá mostrar mensagem se não existir
nenhum número nessa condição.
*/

import java.util.Scanner;

public class ExercicioResolvido13 {
    
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int[] vetor = new int[10];
        int i;
        boolean achou;


        // ========== Loop para preencher o vetor de números inteiros ==========
        System.out.println();
        for (i=0; i<10; i++) {
            System.out.print("Digite um número inteiro ("+(i+1)+"/10): ");
            vetor[i] = scanner.nextInt();
        }

        // ========== Loop para encontrar números superiores a 50 ==========
        achou = false;
        System.out.println();
        for (i=0; i<10; i++) {
            if (vetor[i] > 50) {
                System.out.println("Número: "+vetor[i]+", índice: "+i);
                achou = true;
            }
        }

        if (achou == false) {
            System.out.println("\nNão existe nenhum número maior que 50");
        }

    }

}
