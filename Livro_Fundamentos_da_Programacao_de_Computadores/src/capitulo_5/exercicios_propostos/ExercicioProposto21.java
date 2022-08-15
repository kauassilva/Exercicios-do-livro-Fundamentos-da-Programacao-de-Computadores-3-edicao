/**
 * @author kauas - 12/08/2022 sexta
 * Livro: Fundamentos da Programação de Computadores
 * Capítulo 5, Exercício Proposto 21, pág. 149
 */

/*
Em uma eleição presidencial existem quatro candidatos. Os votos são informados por
meio de código. Os códigos utilizados são:

[imagem, pág. 149]

Faça um programa que calcule e mostre:

- O total de votos para cada candidato;
- O total de votos nulos;
- O total de votos em brancos;
- A porcentagem de votos nulos sobre o total de votos; e
- A porcentagem de votos em branco sobre o total de votos.

Para finalizar o conjunto de votos, tem-se o valor zero e, para códigos inválidos,
o programa deverá mostrar uma mensagem.
*/
package capitulo_5.exercicios_propostos;

import java.text.NumberFormat;
import java.util.Scanner;

public class ExercicioProposto21 {
  
  public static void main(String[] args) {
    Scanner entrada = new Scanner(System.in);

    NumberFormat fmtNumero = NumberFormat.getNumberInstance();

    int i, codigo, qtdVoto1, qtdVoto2, qtdVoto3, qtdVoto4, qtdVotoNulo, qtdVotoBranco;
    float pctVotoNulo, pctVotoBranco;

    i = 1;
    qtdVoto1 = 0;
    qtdVoto2 = 0;
    qtdVoto3 = 0;
    qtdVoto4 = 0;
    qtdVotoNulo = 0;
    qtdVotoBranco = 0;

    // Estrutura de repetição referente a código inválido
    do {
      System.out.println("\n--- VOTO Nº "+i+" ---");
      System.out.println("1 - 1º Candidato");
      System.out.println("2 - 2º Candidato");
      System.out.println("3 - 3º Candidato");
      System.out.println("4 - 4º Candidato");
      System.out.println("5 - Voto nulo");
      System.out.println("6 - Voto em branco");
      System.out.println("0 - Encerrar entrada de dados");
      System.out.print("Digite o seu voto: ");
      codigo = entrada.nextInt();
      
      if (codigo < 0 || codigo > 6) {
        System.out.println("\nCódigo inválido, digite novamente!");
      }
    } while (codigo < 0 || codigo > 6);

    /* 
     * Estrutura de repetição para a entrada do dado de código
     * e os processos para obtenção da quantidade de votos para cada opção
    */
    while (codigo != 0) {
      switch (codigo) {
        case 1:
          qtdVoto1++;
          break;

        case 2:
          qtdVoto2++;
          break;

        case 3:
          qtdVoto3++;
          break;

        case 4:
          qtdVoto4++;
          break;

        case 5:
          qtdVotoNulo++;
          break;

        case  6:
          qtdVotoBranco++;
      }

      i++;
      
      // Estrutura de repetição referente a código inválido
      do {
        System.out.println("\n--- VOTO Nº "+i+" ---");
        System.out.println("1 - 1º Candidato");
        System.out.println("2 - 2º Candidato");
        System.out.println("3 - 3º Candidato");
        System.out.println("4 - 4º Candidato");
        System.out.println("5 - Voto nulo");
        System.out.println("6 - Voto em branco");
        System.out.println("0 - Encerrar entrada de dados");
        System.out.print("Digite o seu voto: ");
        codigo = entrada.nextInt();
        
        if (codigo < 0 || codigo > 6) {
          System.out.println("\nCódigo inválido, digite novamente!");
        }
      } while (codigo < 0 || codigo > 6);
    }

    pctVotoNulo = (float) (qtdVotoNulo * 100) / (i-1);
    pctVotoBranco = (float) (qtdVotoBranco * 100) / (i-1);

    System.out.println();
    System.out.println("Total de votos para o 1º candidato: "+qtdVoto1);
    System.out.println("Total de votos para o 2º candidato: "+qtdVoto2);
    System.out.println("Total de votos para o 3º candidato: "+qtdVoto3);
    System.out.println("Total de votos para o 4º candidato: "+qtdVoto4);
    System.out.println("Porcentagem de votos nulos sobre o total de votos: "+fmtNumero.format(pctVotoNulo)+"%");
    System.out.println("Porcentagem de votos em branco sobre o total de votos: "+fmtNumero.format(pctVotoBranco)+"%");
    System.out.println();

    entrada.close();
  }
}
