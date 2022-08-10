/**
 * @author kauas - 10/08/2022 quarta
 * Livro: Fundamentos da Programação de Computadores
 * Capítulo 5, Exercício Proposto 19, pág. 149
 */

/*
Faça um programa que receba o tipo da ação, ou seja, uma letra a ser comercializada
na bolsa de valores, o preço de compra e o preço de venda de cada ação e que
calcule e mostre:

- O lucro de cada ação comercializada;
- A quantidade de ações com lucro superior a R$ 1.000,00;
- A quantidade de ações com lucro inferior a R$ 200,00;
- O lucro total da empresa;

Finalize com tipo de ação 'F'.
*/
package capitulo_5.exercicios_propostos;

import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

public class ExercicioProposto19 {
  
  public static void main(String[] args) {
    Scanner entrada = new Scanner(System.in);
    Locale localBR = new Locale("pt", "BR");

    NumberFormat fmtDinheiro = NumberFormat.getCurrencyInstance(localBR);

    char tipo;
    float precoCompra, precoVenda, lucroAcao, lucroTotal;
    int qtdAcaoSuperior, qtdAcaoInferior;

    qtdAcaoSuperior = 0;
    qtdAcaoInferior = 0;
    lucroTotal = 0;

    System.out.println("\nPara encerrar a entrada de dados, digite 'F' para o tipo de ação!");
    System.out.print("Digite o tipo da ação (uma letra): ");
    tipo = Character.toUpperCase(entrada.nextLine().charAt(0));

    /* 
     * Estrutura de repetição para entrada dos dados de preço de compra e venda, e o tipo de ação
     * e os processos para obtenção do lucro de cada ação, quantidade de ações e o lucro total
    */
    while (tipo != 'F') {
      // Estrutura de repetição referente a preço de compra inválido
      do {
        System.out.print("Digite o preço de compra da ação "+tipo+": ");
        precoCompra = entrada.nextFloat();

        if (precoCompra <= 0) {
          System.out.println("\nPreço de compra inválido, digite novamente!\n");
        }
      } while (precoCompra <= 0);

      // Estrutura de repetição referente a preço de venda inválido
      do {
        System.out.print("Digite o preço de venda da ação "+tipo+": ");
        precoVenda = entrada.nextFloat();

        if (precoVenda <= 0) {
          System.out.println("\nPreço de venda inválido, digite novamente!\n");
        }
      } while (precoVenda <= 0);
      entrada.nextLine();

      lucroAcao = precoVenda - precoCompra;

      if (lucroAcao > 1000) {
        qtdAcaoSuperior++;
      } else if (lucroAcao > 0 && lucroAcao < 200) {
        qtdAcaoInferior++;
      }

      lucroTotal += lucroAcao;

      System.out.println("\nLucro/Despesa obtido da ação "+tipo+": "+fmtDinheiro.format(lucroAcao));

      System.out.println("\n-----------------------------------------------------------------\n");
      System.out.println("Para encerrar a entrada de dados, digite 'F' para o tipo de ação!");
      System.out.print("Digite o tipo da ação (uma letra): ");
      tipo = Character.toUpperCase(entrada.nextLine().charAt(0));
    }

    System.out.println("\n");
    System.out.println("Quantidade de ações com lucro superior a R$ 1.000,00: "+qtdAcaoSuperior);
    System.out.println("Quantidade de ações com lucro inferior a R$ 200,00: "+qtdAcaoInferior);
    System.out.println("Lucro/Despesa total da empresa: "+fmtDinheiro.format(lucroTotal));
    System.out.println();

    entrada.close();
  }
}
