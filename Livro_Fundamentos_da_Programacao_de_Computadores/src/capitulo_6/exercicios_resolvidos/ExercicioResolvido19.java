import java.util.Scanner;

/**
 * @author kauas - 17/02/2023 Sexta
 * Livro: Fundamentos da Programação de Computadores
 * Capítulo 6, Exercício Proposto 19, pág. 181
 */

/*
Faça um programa que preencha dois vetores, A e B, com vinte caracteres cada. A seguir, troque o 1º
elemento de A com o 20º de B, o 2º de A com o 19º de B, e assim por diante, até trocar o 20º de A com
o 1º de B. Mostre os vetores antes e depois da troca.

[imagem, pág. 181]
*/

public class ExercicioResolvido19 {
    
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        char[] vetorA = new char[20];
        char[] vetorB = new char[20];
        int i, j;
        char aux;


        // ========== Loop para preencher o vetor A ==========
        System.out.println();
        for (i=0; i<vetorA.length; i++) {
            System.out.print("Digite um caracter para o primeiro vetor ("+(i+1)+"/20): ");
            vetorA[i] = scanner.next().charAt(0);
        }

        
        // ========== Loop para preencher o vetor B ==========
        System.out.println();
        for (i=0; i<vetorB.length; i++) {
            System.out.print("Digite um caracter para o segundo vetor ("+(i+1)+"/20): ");
            vetorB[i] = scanner.next().charAt(0);
        }


        // ========== Loop para exibir o vetor A ==========
        System.out.print("\nVetor A:");
        for (i=0; i<vetorA.length; i++) {
            System.out.print(" "+vetorA[i]);
        }


        // ========== Loop para exibir o vetor B ==========
        System.out.print("\nVetor B:");
        for (i=0; i<vetorB.length; i++) {
            System.out.print(" "+vetorB[i]);
        }


        // ========== Loop para trocar os caracteres dos vetores ==========
        j = 19;
        for (i=0; i<vetorA.length; i++) {
            aux = vetorA[i];
            vetorA[i] = vetorB[j];
            vetorB[j] = aux;
            j--;
        }


        // ========== Loop para exibir o novo vetor A ==========
        System.out.print("\n\nNovo vetor A:");
        for (i=0; i<vetorA.length; i++) {
            System.out.print(" "+vetorA[i]);
        }


        // ========== Loop para exibir o novo vetor B ==========
        System.out.print("\nNovo vetor B:");
        for (i=0; i<vetorB.length; i++) {
            System.out.print(" "+vetorB[i]);
        }

    }

}
