/**
 * @author kauas - 14/08/2022 domingo
 * Livro: Fundamentos da Programação de Computadores
 * Capítulo 5, Exercício Proposto 24, pág. 150
 */

/*
Faça um programa que receba um conjunto de valores inteiros e positivos, calcule e
mostre o maior e o menor valor do conjunto. Considere que:

- Para encerrar a entrada de dados, deve ser digitado o valor zero;
- Para valores negativos, deve ser enviada uma mensagem;
- Os valores negativos ou iguais a zero não entrarão nos cálculos.
*/
package capitulo_5.exercicios_propostos;

import java.util.Scanner;

public class ExercicioProposto24 {

  public static void main(String[] args) {
    Scanner entrada = new Scanner(System.in);

    int i, valor, maior, menor;

    i = 1;

    System.out.println("\nPara encerrar a entrada de dados digite 0 para o valor!");

    // Estrutura de repetição referente a valor inválido
    do {
      System.out.print("Digite o "+i+"º valor inteiro e positivo: ");
      valor = entrada.nextInt();

      if (valor < 0) {
        System.out.println("\nValor inválido, digite novamente!\n");
      }
    } while (valor < 0);

    maior = valor;
    menor = valor;

    /*
     * Estrutura de repetição referente a coleta de valor
     * e identificar o maior e o menor valor do conjunto
     * 
     */
    while (valor != 0) {
      if (maior < valor) {
        maior = valor;
      }

      if (menor > valor) {
        menor = valor;
      }

      i++;

      System.out.println("\nPara encerrar a entrada de dados digite 0 para o valor!");

      // Estrutura de repetição referente a valor inválido
      do {
        System.out.print("Digite o "+i+"º valor inteiro e positivo: ");
        valor = entrada.nextInt();

        if (valor < 0) {
          System.out.println("\nValor inválido, digite novamente!\n");
        }
      } while (valor < 0);
    }

    System.out.println("\nMaior valor do conjunto: "+maior);
    System.out.println("Menor valor do conjunto: "+menor+"\n");

    entrada.close();
  }
}
