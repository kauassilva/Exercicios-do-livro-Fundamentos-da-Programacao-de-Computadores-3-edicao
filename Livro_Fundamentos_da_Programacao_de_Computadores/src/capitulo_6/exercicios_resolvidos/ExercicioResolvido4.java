/**
 * @author kauas - 03/09/2022 Sábado
 * Livro: Fundamentos da Programação de Computadores
 * Capítulo 6, Exercício Resolvido 4, pág. 161
 */

/*
Faça um programa que preencha um vetor com oito números inteiros, calcule e mostre dois vetores
resultantes. O primeiro vetor resultante deve conter os números positivos e o segundo, os números
negativos. Cada vetor resultante vai ter no máximo, oito posições, que não poderão ser completamente
utilizadas.
*/

import java.util.Scanner;

public class ExercicioResolvido4 {
    
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        int tamanho, contP, contN;
        
        tamanho = 8;
        contP = 0;
        contN = 0;
        
        int[] vetNumero = new int[tamanho];
        int[] vetPositivo = new int[tamanho];
        int[] vetNegativo = new int[tamanho];       
        
        // Estrutura de repetição referente a entrada de números inteiros do array
        for (int i=0; i<tamanho; i++) {
            System.out.print("Digite um número inteiro para o índice "+i+" do vetor: ");
            vetNumero[i] = entrada.nextInt();
        }
        
        // Estrutura de repetição para o preenchimento dos vetores de números positivos e negativos
        for (int i=0; i<tamanho; i++) {
            if (vetNumero[i] >= 0) {
                vetPositivo[contP] = vetNumero[i];
                contP++;
            } else {
                vetNegativo[contN] = vetNumero[i];
                contN++;
            }
        }
        
        // Exibir o array de valores positivos
        if (contP == 0) {
            System.out.println("\nVetor de positivos vazio!");          
        } else {
            System.out.print("\nVetor de positivos: [");
            
            for (int i=0; i<contP; i++) {
                if (i != contP-1) {
                    System.out.print(vetPositivo[i]+", ");
                } else {
                    System.out.print(vetPositivo[i]+"]");
                }
            }
        }
        
        // Exibir o array de valores negativos
        if (contN == 0) {
            System.out.println("\nVetor de negativos vazio!");            
        } else {
            System.out.print("\nVetor de negativos: [");
            
            for (int i=0; i<contN; i++) {
                if (i != contN-1) {
                    System.out.print(vetNegativo[i]+", ");
                } else {
                    System.out.print(vetNegativo[i]+"]");
                }
            }
        }
        
        System.out.println("\n");
        
        entrada.close();
    }
}
