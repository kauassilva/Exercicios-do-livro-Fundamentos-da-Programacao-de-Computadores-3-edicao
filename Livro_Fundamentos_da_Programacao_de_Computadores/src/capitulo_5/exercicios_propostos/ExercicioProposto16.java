/**
 * @author kauas - 09/08/2022 terça
 * Livro: Fundamentos da Programação de Computadores
 * Capítulo 5, Exercício Proposto 16, pág. 148
 */

/*
Faça um programa que receba várias idades, calcule e mostre a média das idades
digitadas. Finalize digitando idade igual a zero.
*/
package capitulo_5.exercicios_propostos;

import java.util.Scanner;

public class ExercicioProposto16 {
    
  public static void main(String[] args) {
    Scanner entrada = new Scanner(System.in);

    int idade, i, media, soma;

    i = 1;
    soma = 0;

    System.out.println("\nPara encerrar o sistema, digite 0 para idade.");
    System.out.print("Digite a "+i+"ª idade: ");
    idade = entrada.nextInt();

    // Estrutura de repetição para a soma das idades
    while (idade != 0) {
      soma = soma + idade;

      i++;
      System.out.println("\nPara encerrar o sistema, digite 0 para idade.");
      System.out.print("Digite a "+i+"ª idade: ");
      idade = entrada.nextInt();
    }

    media = soma / (i-1);

    System.out.println("\nMédia das idades: "+media+" anos\n");

    entrada.close();
  }
}
