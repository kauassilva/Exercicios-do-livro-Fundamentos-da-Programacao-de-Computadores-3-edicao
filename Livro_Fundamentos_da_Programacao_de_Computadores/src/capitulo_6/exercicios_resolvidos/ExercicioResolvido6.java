/**
 * @author kauas - 27/01/2023 Sexta
 * Livro: Fundamentos da Programação de Computadores
 * Capítulo 6, Exercício Proposto 6, pág. 165
 */

/*
Faça um programa que preencha um vetor com dez números inteiros, calcule e mostre o vetor 
resultante de uma ordenação decrescente.

[imagem, pág. 165]
*/

import java.util.Scanner;

public class ExercicioResolvido6 {

  public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);
    
    int[] vetor = new int[10];
    int i, j, aux;
    
    System.out.println();
    for (i=0; i<10; i++) {
      System.out.print("Insira um número inteiro para a posição "+(i+1)+"/10 do vetor:");
      vetor[i] = scanner.nextInt();
    }
    
    scanner.close();
    
    for (i=0; i<10; i++) {
      for (j=0; j<9; j++) {
        if (vetor[j] < vetor[j+1]) {
          aux = vetor[j];
          vetor[j] = vetor[j+1];
          vetor[j+1] = aux;
        }
      }
    }
    
    System.out.println();
    for (i=0; i<10; i++) {
      System.out.print(vetor[i]+" - ");
    }
    System.out.println();
    
  }
  
}
