/**
 * @author kauas - 10/08/2022 quarta
 * Livro: Fundamentos da Programação de Computadores
 * Capítulo 5, Exercício Proposto 20, pág. 149
 */

/*
Faça um programa que apresente o menu de opções a seguir:

Menu de opções:
1. Média aritmética
2. Média ponderada
3. Sair

Digite a opção desejada.

Na opção 1: receber duas notas, calcular e mostrar a média aritmética.
Na opção 2: receber três notas e seus respectivos pesos, calcular e mostrar a média
ponderada.
Na opção 3: sair do programa.

Verifique a possibilidade de opção inválida. Nesse caso, o programa deverá mostrar
uma mensagem.
*/
package capitulo_5.exercicios_propostos;

import java.text.NumberFormat;
import java.util.Scanner;

public class ExercicioProposto20 {
  public static void main(String[] args) {
    Scanner entrada = new Scanner(System.in);

    NumberFormat fmtNumero = NumberFormat.getNumberInstance();

    int opcao;
    float nota1, nota2, nota3, peso1, peso2, peso3, media;

    /* 
     * Estrutura de repetição para a entrada de dados respectivos a cada opção
     * e os processos para obtenção das médias
    */
    do {
      // Estrutura de repetição referente a opção inválida
      do {
        System.out.println("\n--- Menu de opções ---");
        System.out.println("1. Média aritmética");
        System.out.println("2. Média ponderada");
        System.out.println("3. Sair");
        System.out.print("\nDigite a opção desejada: ");
        opcao = entrada.nextInt();

        if (opcao!=1 && opcao!=2 && opcao!=3) {
          System.out.println("\nOpção inválida, digite novamente!\n");
        }
      } while (opcao!=1 && opcao!=2 && opcao!=3);

      switch (opcao) {
        case 1:
          // Estrutura de repetição referente a nota inválida
          do {
            System.out.print("\nDigite a primeira nota: ");
            nota1 = entrada.nextFloat();
            System.out.print("Digite a segunda nota: ");
            nota2 = entrada.nextFloat();

            if (nota1 < 0 || nota2 < 0) {
              System.out.println("\nUma ou mais notas são negativas, digite novamente!\n");
            }
          } while (nota1 < 0 || nota2 < 0);

          media = (nota1 + nota2) / 2;

          System.out.println("\nMédia aritmética: "+fmtNumero.format(media)+"\n");

          break;
        case 2:
          // Estrutura de repetição referente a nota inválida
          do {
            System.out.print("\nDigite a primeira nota: ");
            nota1 = entrada.nextFloat();
            System.out.print("Digite a segunda nota: ");
            nota2 = entrada.nextFloat();  
            System.out.print("Digite a terceira nota: ");
            nota3 = entrada.nextFloat();

            if (nota1<0 || nota2<0 || nota3<0) {
              System.out.println("\nUma ou mais notas são negativas, digite novamente!");
            }
          } while (nota1<0 || nota2<0 || nota3<0);

          // Estrutura de repetição referente a peso inválido
          do {
            System.out.print("Digite o peso que a primeira nota possui: ");
            peso1 = entrada.nextFloat();
            System.out.print("Digite o peso que a segunda nota possui: ");
            peso2 = entrada.nextFloat();
            System.out.print("Digite o peso que a terceira nota possui: ");
            peso3 = entrada.nextFloat();

            if (peso1<=0 || peso2<=0 || peso3<=0) {
              System.out.println("\nUm ou mais pesos são menores ou iguais a 0, digite novamente!\n");
            }
          } while (peso1<=0 || peso2<=0 || peso3<=0);
          
          media = ((nota1*peso1)+(nota2*peso2)+(nota3*peso3)) / (peso1+peso2+peso3);

          System.out.println("\nMédia ponderada: "+fmtNumero.format(media)+"\n");

          break;
        default:
          System.out.println("\nEncerrando sistema...");
      }
    } while (opcao != 3);

    System.out.println();

    entrada.close();
  }
}
