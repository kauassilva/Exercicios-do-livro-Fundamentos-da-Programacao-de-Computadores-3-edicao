/**
 * @author kauas - 12/08/2022 sexta
 * Livro: Fundamentos da Programação de Computadores
 * Capítulo 5, Exercício Proposto 22, pág. 149
 */

/*
Faça um programa que receba a idade e a altura de várias pessoas, calcule e mostre
a média das alturas daquelas com mais de 50 anos. Para encerrar a entrada de dados,
digite idade menor ou igual a zero.
*/
package capitulo_5.exercicios_propostos;

import java.text.NumberFormat;
import java.util.Scanner;

public class ExercicioProposto22 {
  
  public static void main(String[] args) {
    Scanner entrada = new Scanner(System.in);

    NumberFormat fmtNumero = NumberFormat.getNumberInstance();

    int i, idade, cont;
    float altura, somaAltura, mediaAltura;

    i = 1;
    cont = 0;
    somaAltura = 0;

    System.out.println("\nDigite um número menor ou igual a 0, para encerrar a entrada de dados!");

    // Estrutura de repetição referente a idade inválida
    do {
      System.out.println("\n--- Pessoa Nº "+i+" ---");
      System.out.print("Digite sua idade: ");
      idade = entrada.nextInt();

      if (idade > 120) {
        System.out.println("\nCaramba, mais de 120 anos? Digite novamente com a idade correta!");
      }
    } while (idade > 120);

    /*
     * Estrutura de repetição para coleta dos dados de idade e altura, e
     * Fazer a soma das alturas para posteriormente calcular a média das alturas
     */
    while (idade > 0 ) {
      // Estrutura de repetição referente a altura inválida
      do {
        System.out.print("Digite sua altura em metros: ");
        altura = entrada.nextFloat();

        if (altura < 0.2) {
          System.out.println(altura+" m? Isso é impossivel, digite novamente!");
        } else if (altura > 2.55) {
          System.out.println(altura+" m? Isso é impossivel, digite novamente!");
        }
      } while (altura < 0.23 || altura > 2.51);

      if (idade >= 50) {
        cont++;
        somaAltura += altura;
      }

      i++;

      System.out.println("\nDigite um número menor ou igual a 0, para encerrar a entrada de dados!");

      // Estrutura de repetição referente a idade inválida
      do {
        System.out.println("\n--- Pessoa Nº "+i+" ---");
        System.out.print("Digite sua idade: ");
        idade = entrada.nextInt();
  
        if (idade > 120) {
          System.out.println("\nMais de 120 anos? Digite novamente com a idade correta!");
        }
      } while (idade > 120);
    }

    mediaAltura = somaAltura / cont;

    System.out.println();
    System.out.println("Média das alturas daqueles com mais de 50 anos: "+fmtNumero.format(mediaAltura)+" m");
    System.out.println();
    
    entrada.close();
  }
}
