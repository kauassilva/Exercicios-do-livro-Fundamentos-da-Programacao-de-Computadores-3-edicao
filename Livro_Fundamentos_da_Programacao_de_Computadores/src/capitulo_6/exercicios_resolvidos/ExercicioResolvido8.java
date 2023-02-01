/**
 * @author kauas - 27/01/2023 Sexta
 * Livro: Fundamentos da Programação de Computadores
 * Capítulo 6, Exercício Proposto 8, pág. 167
 */

/*
Faça um programa que preencha dois vetores com cinco elementos numéricos cada e, depois,
ordene-os de maneira crescente. Deverá ser gerado um terceiro vetor com dez posições,
composto pela junção dos elementos dos vetores anteriores, também ordenado de maneira crescente.

[imagem, pág. 167]
*/

package capitulo_6.exercicios_resolvidos;

import java.util.Scanner;

public class ExercicioResolvido8 {
  
  public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);

    int[] vetor1 = new int[5];
    int[] vetor2 = new int[5];
    int[] vetor3 = new int[vetor1.length+vetor2.length];
    int i, j, aux;

    // preenchendo o primeiro vetor
    System.out.println();
    for (i=0; i<vetor1.length; i++) {
      System.out.print("Digite um número para o primeiro vetor ("+(i+1)+"/"+vetor1.length+"): ");
      vetor1[i] = scanner.nextInt();
    }

    // preenchendo o segundo vetor
    System.out.println();
    for (i=0; i<vetor2.length; i++) {
      System.out.print("Digite um número para o segundo vetor ("+(i+1)+"/"+vetor2.length+"): ");
      vetor2[i] = scanner.nextInt();
    }

    // ordenando o primeiro vetor
    for (i=0; i<vetor1.length; i++) {
      for (j=0; j<vetor1.length-1; j++) {
        if (vetor1[j] > vetor1[j+1]) {
          aux = vetor1[j];
          vetor1[j] = vetor1[j+1];
          vetor1[j+1] = aux;
        }
      }
    }

    // ordenando o segundo vetor
    for (i=0; i<vetor2.length; i++) {
      for (j=0; j<vetor2.length-1; j++) {
        if (vetor2[j] > vetor2[j+1]) {
          aux = vetor2[j];
          vetor2[j] = vetor2[j+1];
          vetor2[j+1] = aux;
        }
      }
    }

    j = 0;

    // preenchendo o terceiro vetor
    for (i=0; i<5; i++) {
      vetor3[j] = vetor1[i];
      j++;
      vetor3[j] = vetor2[i];
      j++;
    }

    // ordenando o terceiro vetor
    for (i=0; i<vetor3.length; i++) {
      for (j=0; j<vetor3.length-1; j++) {
        if (vetor3[j] > vetor3[j+1]) {
          aux  = vetor3[j];
          vetor3[j] = vetor3[j+1];
          vetor3[j+1] = aux;
        }
      }
    }

    // exibindo o primeiro vetor
    System.out.print("\nVetor #1 = ");
    for (i=0; i<vetor1.length; i++) {
      System.out.print(vetor1[i]+" - ");
    }

    // exibindo o segundo vetor
    System.out.print("\n\nVetor #2 = ");
    for (i=0; i<vetor2.length; i++) {
      System.out.print(vetor2[i]+" - ");
    }

    // exibindo o terceiro vetor
    System.out.print("\n\nVetor #3 = ");
    for (i=0; i<vetor3.length; i++) {
      System.out.print(vetor3[i]+" - ");
    }    

  }

}
