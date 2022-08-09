/**
 * @author kauas - 09/08/2022 terça
 * Livro: Fundamentos da Programação de Computadores
 * Capítulo 5, Exercício Proposto 17, pág. 148
 */

/*
Foi feita uma pesquisa sobre a audiência de canal de TV em várias casas de uma
cidade, em determinado dia. Para cada casa consultada foi fornecido o número do
canal (4, 5, 7, 12) e o número de pessoas que estavam assistindo àquele canal.
Se a televisão estivesse desligada, nada era anotado, ou seja, essa casa não
entrava na pesquisa. Faça um programa que:

- Leia um número indeterminado de dados (número do canal e número de pessoas que
  estavam assistindo); e
- Calcule e mostre a porcentagem de audiência de cada canal.

Para encerrar a entrada de dados, digite o número do canal ZERO.
*/
package capitulo_5.exercicios_propostos;

import java.text.NumberFormat;
import java.util.Scanner;

public class ExercicioProposto17 {
  
  public static void main(String[] args) {
    Scanner entrada = new Scanner(System.in);

    NumberFormat fmtNumero = NumberFormat.getNumberInstance();

    int canal, qtdPessoa, qtdTotal, qtdCanal4, qtdCanal5, qtdCanal7, qtdCanal12;
    float pctCanal4, pctCanal5, pctCanal7, pctCanal12;

    qtdTotal = 0;
    qtdCanal4 = 0;
    qtdCanal5 = 0;
    qtdCanal7 = 0;
    qtdCanal12 = 0;

    // Estrutura de repetição referente a dado inválido
    do {
      System.out.println("\nPara encerrar a entrada de dados, digite o número do canal ZERO.");
      System.out.println("Lista dos canais: 4 / 5 / 7 / 12");
      System.out.print("Digite o número do canal que estavam assistindo: ");
      canal = entrada.nextInt();

      if (canal!=0 && canal!=4 && canal!=5 && canal!=7 && canal!=12) {
        System.out.println("\nCanal inválido, digite novamente!\n");
      }
    } while (canal!=0 && canal!=4 && canal!=5 && canal!=7 && canal!=12);

    /* 
     * Estrutura de repetição para entrada e processo de dados
     * de quantidade de pessoas assistindo o respectivo canal
    */
    while (canal != 0) {
      // Estrutura de repetição referente a dado inválido
      do {
        System.out.print("Quantas pessoas estavam assistindo o canal "+canal+": ");
        qtdPessoa = entrada.nextInt();

        if (qtdPessoa <= 0) {
          System.out.println("\nQuantidade de pessoas inválida, digite novamente!\n");
        }
      } while (qtdPessoa <= 0);

      qtdTotal += qtdPessoa;

      switch (canal) {
        case 4:
          qtdCanal4 += qtdPessoa;
          break;
        case 5:
          qtdCanal5 += qtdPessoa;
          break;
        case 7:
          qtdCanal7 += qtdPessoa;
          break;
        case 12:
          qtdCanal12 += qtdPessoa;
      }

      // Estrutura de repetição referente a dado inválido
      do {
        System.out.println("\nPara encerrar a entrada de dados, digite o número do canal ZERO.");
        System.out.println("Lista dos canais: 4 / 5 / 7 / 12");
        System.out.print("Digite o número do canal: ");
        canal = entrada.nextInt();
  
        if (canal!=0 && canal!=4 && canal!=5 && canal!=7 && canal!=12) {
          System.out.println("\nCanal inválido, digite novamente!\n");
        }
      } while (canal!=0 && canal!=4 && canal!=5 && canal!=7 && canal!=12);
    }

    pctCanal4 = (float) (qtdCanal4 * 100) / qtdTotal;
    pctCanal5 = (float) (qtdCanal5 * 100) / qtdTotal;
    pctCanal7 = (float) (qtdCanal7 * 100) / qtdTotal;
    pctCanal12 = (float) (qtdCanal12 * 100) / qtdTotal;

    System.out.println("\nPorcentagem de audiência do canal 4: "+fmtNumero.format(pctCanal4)+"%");
    System.out.println("Porcentagem de audiência do canal 5: "+fmtNumero.format(pctCanal5)+"%");
    System.out.println("Porcentagem de audiência do canal 7: "+fmtNumero.format(pctCanal7)+"%");
    System.out.println("Porcentagem de audiência do canal 12: "+fmtNumero.format(pctCanal12)+"%\n");

    entrada.close();
  }
}
