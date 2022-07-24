/**
 * @author kauas - 22/07/2022 sexta
 * Livro: Fundamentos da Programação de Computadores
 * Capítulo 5, Exercício Proposto 1, pág. 146
 */

/*
Faça um programa que leia cinco grupos de quatro valores (A, B, C, D) e
mostre-os na ordem lida. Em seguida, organize-os em ordem crescente e
decrescente.
*/
package capitulo_5.exercicios_propostos;

import java.text.NumberFormat;
import java.util.Scanner;

public class ExercicioProposto1 {
    
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        NumberFormat fmtNumero = NumberFormat.getNumberInstance();
        
        float vetor[] = new float[4];
        float aux;
        
        // Estrutura de repetição para a repetição dos processos 5 vezes
        for (int i=1; i<=5; i++) {
            System.out.println("\n\nDigite valores para o "+i+"º grupo\n");
            // Estrutura de repetição para a coleta de dados
            for (int j=0; j<vetor.length; j++) {
                System.out.print("Digite o "+(j+1)+"º número: ");
                vetor[j] = entrada.nextFloat();                    
            }

            System.out.print("\nOrdem digitada: "+fmtNumero.format(vetor[0]));

            // Estrutura de repetição para exibir a ordem digitada
            for (int d=1; d<vetor.length; d++) {
                System.out.print(" - "+fmtNumero.format(vetor[d]));
            }

            // Estrutura de repetição para ordenar em ordem crescente
            for (int q=0; q<vetor.length; q++) {
                for (int c=0; c<vetor.length; c++) {
                    if (vetor[q] < vetor[c]) {
                        aux = vetor[q];
                        vetor[q] = vetor[c];
                        vetor[c] = aux;
                    }
                }
            }

            System.out.print("\nOrdem crescente: "+fmtNumero.format(vetor[0]));

            // Estrutura de repetição para exibir a ordem crescente
            for (int s=1; s<vetor.length; s++) {
                System.out.print(" < "+fmtNumero.format(vetor[s]));
            }

            // Estrutura de repetição para ordenar em ordem decrescente
            for (int q=0; q<vetor.length; q++) {
                for (int c=0; c<vetor.length; c++) {
                    if (vetor[q] > vetor[c]) {
                        aux = vetor[q];
                        vetor[q] = vetor[c];
                        vetor[c] = aux;
                    }
                }
            }

            System.out.print("\nOrdem decrescente: "+fmtNumero.format(vetor[0]));

            // Estrutura de repetição para exibir a ordem decrescente
            for (int s=1; s<vetor.length; s++) {
                System.out.print(" > "+fmtNumero.format(vetor[s]));
            }
        }
                
        System.out.println("\n");
        
        entrada.close();
    }
}
