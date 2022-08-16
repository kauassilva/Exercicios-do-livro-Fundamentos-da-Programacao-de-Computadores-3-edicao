/**
 * @author kauas - 16/08/2022 terça
 * Livro: Fundamentos da Programação de Computadores
 * Capítulo 6, Exercício Proposto 1, pág. 159
 */

/*
Faça um programa que preencha um vetor com noves números inteiros, calcule e
mostre os números primos e suas respectivas posições.
*/
package capitulo_6.exercicios_resolvidos;

import java.util.Scanner;

public class ExercicioResolvido1 {
  
  public static void main(String[] args) {
    Scanner entrada = new Scanner(System.in);

    int tam, cont;
    int num[];

    tam = 9;
    num = new int[tam];

    System.out.println();

    // Estrutura de repetição para preenchimento do vetor de números inteiros
    for (int i=0; i<tam; i++) {
      System.out.print("Digite um valor para o índice "+i+": ");
      num[i] = entrada.nextInt();
    }

    System.out.println();

    /* 
     * Estrutura de repetição para validação de valores primos contidos no vetor de números inteiros
     * e exibir os números primos e seu índice
     */
    for (int i=0; i<tam; i++) {
      cont = 0;

      // Estrutura de repetição para validar condição de número primo
      for (int j=1; j<=num[i]; j++) {
        if (num[i]%j == 0) {
          cont++;
        }
      }

      if (cont == 2) {
        System.out.println("Número primo: "+num[i]);
        System.out.println("Índice: "+i);
      }
    }

    System.out.println();

    entrada.close();
  }
}
