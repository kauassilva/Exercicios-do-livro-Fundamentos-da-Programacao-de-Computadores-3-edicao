/**
 * @author kauas - 14/08/2022 domingo
 * Livro: Fundamentos da Programação de Computadores
 * Capítulo 5, Exercício Proposto 25, pág. 150
 */

/*
Uma agência bancária possui varios clientes que podem fazer investimentos com
rendimentos mensais conforme a tabela a seguir:

[imagem, pág. 150]

Faça um programa que leia o código do cliente, o tipo do investimento e o valor
investido, e que calcule e mostre o rendimento mensal de acordo com o tipo do
investimento. No final, o programa deverá mostrar o total investido e o total de
juros pagos.
A leitura terminará quando o código do cliente digitado for menor ou igual a 0.
*/
package capitulo_5.exercicios_propostos;

import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

public class ExercicioProposto25 {

  public static void main(String[] args) {
    Scanner entrada = new Scanner(System.in);
    Locale localBR = new Locale("pt", "br");

    NumberFormat fmtDinheiro = NumberFormat.getCurrencyInstance(localBR);

    int i, codigo, tipo;
    float valor, porcentagem, rendMensal, totalInvestido, totalJuros;

    i = 1;
    porcentagem = 0;
    totalInvestido = 0;
    totalJuros = 0;

    System.out.println("\nPara encerrar a entrada de dados, digite um valor menor ou igual a 0 para o código!");
    System.out.print("\nDigite o código do "+i+"º cliente: ");
    codigo = entrada.nextInt();

    /*
     * Estrutura de repetição referente a coleta de dados
     * Calcular rendimento mensal, total investido e o total de juros a pagar
     */
    while (codigo > 0) {
      // Estrutura de repetição referente ao tipo de investimento inválido
      do {
        System.out.println("Qual tipo de investimento deseja investir?");
        System.out.println("1 - Poupança | Rendimento mensal: 1,5%");
        System.out.println("2 - Poupança plus | Rendimento mensal: 2%");
        System.out.println("3 - Fundos de renda fixa | Rendimento mensal: 4%");
        System.out.print("Digite o número do investimento: ");
        tipo = entrada.nextInt();

        if (tipo < 1 || tipo > 3) {
          System.out.println("\nTipo de investimento inválido, digite novamente!\n");
        }
      } while (tipo < 1 || tipo > 3);

      // Estrutura de repetição referente a valor inválido
      do {
        System.out.print("Digite o valor a ser investido: ");
        valor = entrada.nextFloat();

        if (valor <= 0) {
          System.out.println("\nValor inválido, digite novamente!\n");
        }
      } while (valor <= 0);

      switch (tipo) {
        case 1:
          porcentagem = 1.5F;
          break;
        case 2:
          porcentagem = 2;
          break;
        case 3:
          porcentagem  = 4;
          break;
      }

      totalInvestido += valor;
      rendMensal = (valor * porcentagem) / 100;
      totalJuros += rendMensal;

      System.out.println("\n\nRendimento mensal a obter: "+fmtDinheiro.format(rendMensal));

      i++;

      System.out.println("\n-----------------------------------------\n");
      System.out.println("Para encerrar a entrada de dados, digite um valor menor ou igual a 0 para o código!");
      System.out.print("\nDigite o código do "+i+"º cliente: ");
      codigo = entrada.nextInt();
    }

    System.out.println("\n\n\nTotal investido: "+fmtDinheiro.format(totalInvestido));
    System.out.println("Total de juros pago: "+fmtDinheiro.format(totalJuros));
    System.out.println();

    entrada.close();
  }
}
