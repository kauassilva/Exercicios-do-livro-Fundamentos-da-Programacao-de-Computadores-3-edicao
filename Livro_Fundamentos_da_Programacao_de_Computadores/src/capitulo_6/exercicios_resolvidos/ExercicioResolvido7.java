/**
 * @author kauas - 27/01/2023 Sexta
 * Livro: Fundamentos da Programação de Computadores
 * Capítulo 6, Exercício Resolvido 7, pág. 166
 */

/*
Faça um programa que, no momento de preencher um vetor de oito números inteiros, já os
armazene de forma crescente.
*/

import java.util.Scanner;

public class ExercicioResolvido7 {
  
  public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);

    int[] vetor = new int[8];
    int i, j, z, aux;

    System.out.println();
    for (i=0; i<vetor.length; i++) {
      System.out.print("Insira um número inteiro "+(i+1)+"/8: ");
      aux = scanner.nextInt();

      for (j=0; j<i && vetor[j] < aux; j++) {
      }

      for (z=i; z>=j+1; z--) {
        vetor[z] = vetor[z-1];
      }

      vetor[j] = aux;
    }

    System.out.println();
    for (i=0; i<vetor.length; i++) {
      System.out.print(vetor[i]+" - ");
    }
    System.out.println();
  }

}
