import java.util.Scanner;

/**
 * @author kauas - 06/02/2023 Segunda
 * Livro: Fundamentos da Programação de Computadores
 * Capítulo 6, Exercício Proposto 16, pág. 178
 */

/*
Faça um programa que preencha um vetor com dez números inteiros e um segundo vetor com cinco
números inteiros. Calcule e mostre dois vetores resultantes. O primeiro vetor resultante será composto
pelos números pares, gerados pelo elemento do primeiro vetor somado a todos os elementos do segundo
vetor; o segundo será composto pelos números ímpares gerados pelo elemento do primeiro vetor somado
a todos os elementos do segundo vetor.

[imagem, pág. 178]
*/


public class ExercicioResolvido16 {
    
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int[] vetor1 = new int[10];
        int[] vetor2 = new int[5];
        int[] vetorPar = new int[10];
        int[] vetorImpar = new int[10];
        int i, j;
        int posLivre1, posLivre2;
        int soma=0;


        // ========== Loop para preencher o primeiro vetor ==========
        System.out.println("\n--- Primeiro vetor ---");
        for (i=0; i<10; i++) {
            System.out.print("Digite um número inteiro ("+(i+1)+"/10): ");
            vetor1[i] = scanner.nextInt();
        }


        // ========== Loop para preencher o segundo vetor ==========
        System.out.println("\n--- Segundo vetor ---");
        for (i=0; i<5; i++) {
            System.out.print("Digite um número inteiro ("+(i+1)+"/5): ");
            vetor2[i] = scanner.nextInt();
        }

        posLivre1 = 0;
        posLivre2 = 0;


        // ========== Loop para validar números pares e ímpares ==========
        for (i=0; i<10; i++) {
            soma = vetor1[i];

            for (j=0; j<5; j++) {
                soma = soma + vetor2[j];
            }

            if (soma%2 == 0) {
                vetorPar[posLivre1] = soma;
                posLivre1++;
            } else {
                vetorImpar[posLivre2] = soma;
                posLivre2++;
            }
        } 


        // ========== Loop para exibir vetor de números pares ==========
        System.out.println();
        for (i=0; i<posLivre1; i++) {
            System.out.print(vetorPar[i]+" - ");
        }


        // ========== Loop para exibir vetor de números ímpares ==========
        System.out.println();
        for (i=0; i<posLivre2; i++) {
            System.out.print(vetorImpar[i]+" - ");
        }

    }

}
