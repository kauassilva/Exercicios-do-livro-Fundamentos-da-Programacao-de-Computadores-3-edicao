/**
 * @author kauas - 12/08/2022 sexta
 * Livro: Fundamentos da Programação de Computadores
 * Capítulo 5, Exercício Proposto 23, pág. 149
 */

/*
Faça um programa que apresente o menu de opções a seguir, que permita ao usuário
escolher a opção desejada, receba os dados necessários para executar a operação e
mostre o resultado. Verifique a possibilidade de opção inválida e não se preocupe
com as restrições como salário inválido.

Menu de opções:
1. Novo salário
2. Férias
3. Décimo terceiro
4. Sair

Digite a opção desejada.

Na opção 1: receber o salário de um funcionário, calcular e mostrar o novo salário
usando as regras a seguir:

[imagem, pág. 150] [alterei os valores]

Na opção 2: Receber o salário de um funcionário, calcular e mostrar o valor de suas 
férias. Sabe-se que as férias equivalem a seu salário acrescido de um terço do salário.

Na opção 3: Receber o salário de um funcionário e o número de meses de trabalho na
empresa, no máximo doze, calcular e mostrar o valor do décimo terceiro. Sabe-se que
o décimo terceiro equivale a seu salário multiplicado pelo número de meses de trabalho
dividido por 12.

Na opção 4: Sair do programa. 
*/
package capitulo_5.exercicios_propostos;

import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

public class ExercicioProposto23 {

  public static void main(String[] args) {
    Scanner entrada = new Scanner(System.in);
    Locale localBR = new Locale("pt", "br");

    NumberFormat fmtDinheiro = NumberFormat.getCurrencyInstance(localBR);

    int opcao, porcentagem, qtdMes;
    float salario, salNovo, acrescimo, ferias, decmTerceiro;

    /*
     * Estrutura de repetição para coleta dos dados de opção do menu e seus respectivos dados
     * E a obtenção dos respectivos dados 
     */
    do {
      // Estrutura de repetição referente a opção inválida
      do {
        System.out.println("\n--- Menu de opções ---");
        System.out.println("1. Novo salário");
        System.out.println("2. Férias");
        System.out.println("3. Décimo terceiro");
        System.out.println("4. Sair");
        System.out.print("\nDigite a opção desejada: ");
        opcao = entrada.nextInt();

        if (opcao < 1 || opcao > 4) {
          System.out.println("\nOpção inválida, digite novamente!");
        }
      } while (opcao < 1 || opcao > 4);

      switch (opcao) {
        case 1:
          // Estrutura de repetição referente ao salário inválido
          do {
            System.out.print("\nDigite o seu salário atual: R$ ");
            salario = entrada.nextFloat();

            if (salario <= 0) {
              System.out.println("\nSalário inválido, digite novamente!");
            }
          } while (salario <= 0);

          /*
           * Foi alterado os valores para as estruturas condicionais
           * de R$ 210,00 passou para R$ 1200,00
           * de R$ 600,00 passou para R$ 6000,00
           */
          if (salario < 1200) {
            porcentagem = 15;
          } else if (salario >= 1200 && salario <= 6000) {
            porcentagem = 10;
          } else {
            porcentagem = 5;
          }

          acrescimo = (salario * porcentagem) / 100;
          salNovo = salario + acrescimo;

          System.out.println("\nPorcentagem de acréscimo ("+porcentagem+"%): "+fmtDinheiro.format(acrescimo));
          System.out.println("Seu novo salário é "+fmtDinheiro.format(salNovo));
          System.out.println();
          break;

          case 2:
            // Estrutura de repetição referente ao salário inválido
            do {
              System.out.print("\nDigite o seu salário atual: R$ ");
              salario = entrada.nextFloat();

              if (salario <= 0) {
                System.out.println("\nSalário inválido, digite novamente!");
              }
            } while (salario <= 0);

            acrescimo = salario / 3;
            ferias = salario + acrescimo;

            System.out.println("\nForam acrescidos "+fmtDinheiro.format(acrescimo));
            System.out.println("Valor de suas férias: "+fmtDinheiro.format(ferias));
            System.out.println();
          break;

          case 3:
            // Estrutura de repetição referente ao salário inválido
            do {
              System.out.print("\nDigite o seu salário atual: R$ ");
              salario = entrada.nextFloat();

              if (salario <= 0) {
                System.out.println("\nSalário inválido, digite novamente!");
              }
            } while (salario <= 0);

            // Estrutura de repetição referente ao número de mês inválido
            do {
              System.out.print("Digite o número de meses que você trabalhou na empresa esse ano (máximo de 12 meses): ");
              qtdMes = entrada.nextInt();;

              if (qtdMes < 0) {
                System.out.println("\nQuantidade de meses inválida, digite novamente!\n");
              }
            } while (qtdMes < 0);

            decmTerceiro = (salario * qtdMes) / 12;

            System.out.println("Valor do décimo terceiro: "+fmtDinheiro.format(decmTerceiro));
            System.out.println();
      }
    } while (opcao != 4);

    System.out.println();

    entrada.close();
  }
}
