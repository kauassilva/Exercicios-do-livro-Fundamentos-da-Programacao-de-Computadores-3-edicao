import java.util.Scanner;

/**
 * @author kauas - 17/02/2023 Sexta
 * Livro: Fundamentos da Programação de Computadores
 * Capítulo 6, Exercício Proposto 24, pág. 188
 */

/*
Faça um programa que leio um vetor A de dez posições contendo números inteiros. Determine e mostre,
a seguir, quais elementos de A estão repetidos e quantas vezes cada um se repete.

[imagem, pág. 188]

Caso sejam digitados valores como os apresentados no vetor A, o programa deverá mostrar ao final
as seguintes informações:

- o número 5 aparece 2 vezes;
- o número 4 aparece 3 vezes;
- o número 3 aparece 2 vezes;
- o número 18 aparece 3 vezes.
*/

public class ExercicioResolvido24 {
    
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int[] vetorA = new int[10];
        int[] contagem = new int[vetorA.length];

        // Preenche o vetor A
        System.out.println();
        for (int i=0; i<vetorA.length; i++) {
            System.out.print("Digite o " + (i+1) + "º número: ");
            vetorA[i] = scanner.nextInt();
        }

        
        for (int i=0; i<vetorA.length; i++) {
            // Caso o valor não tenha sido repetido
            if (contagem[i] == 0) {
                int repeticoes = 1;

                for (int j=i+1; j<vetorA.length; j++) {
                    if (vetorA[j] == vetorA[i]) {
                        repeticoes++;
                        contagem[j] = 1;
                    }
                }

                if (repeticoes > 1) {
                    System.out.println("O número "+vetorA[i]+" aparece "+repeticoes+" vezes.");
                }
            }
        }

    }
}
