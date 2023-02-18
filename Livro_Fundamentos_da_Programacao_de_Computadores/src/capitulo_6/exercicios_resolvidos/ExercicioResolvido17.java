import java.util.Scanner;

/**
 * @author kauas - 17/02/2023 Sexta
 * Livro: Fundamentos da Programação de Computadores
 * Capítulo 6, Exercício Resolvido 17, pág. 179
 */

/*
Faça um programa que receba seis números inteiros e mostre:

- os números pares digitados;
- a soma dos números pares digitados;
- os números ímpares digitados; e
- a quantidade de números ímpares digitados.

[imagem, pág. 179]
*/

public class ExercicioResolvido17 {
    
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        int[] vetor = new int[6];
        int i;
        int soma, qtdImpar;


        // ========== Preenchimento do vetor ==========
        System.out.println();
        for (i=0; i<vetor.length; i++) {
            System.out.print("Digite um número inteiro ("+i+"/5): ");
            vetor[i] = scanner.nextInt();
        }


        // ========== Números pares ==========
        soma = 0;
        System.out.println("\nOs números pares são:");
        for (i=0; i<vetor.length; i++) {
            if (vetor[i]%2 == 0) {
                System.out.println("Número "+vetor[i]+" na posição "+i);
                soma += vetor[i];
            }
        }
        System.out.println("\nSoma dos pares: "+soma);

        
        // ========== Números ímpares ==========
        qtdImpar = 0;
        System.out.println("\nOs números ímpares são:");
        for (i=0; i<vetor.length; i++) {
            if (vetor[i]%2 != 0) {
                System.out.println("Número "+vetor[i]+" na posição "+i);
                qtdImpar++;
            }
        }
        System.out.println("\nQuantidade de ímpares: "+qtdImpar);

    }
}
