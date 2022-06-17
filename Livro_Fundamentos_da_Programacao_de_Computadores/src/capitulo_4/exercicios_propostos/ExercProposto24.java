/**
@author kauas - 03/05/2022 segunda
Livro: Fundamentos da Programação de Computadores
Capítulo 4, Exercício Proposto 24, pág.93
*/

/*
Faça um programa que receba o preço, a categoria (1 - limpeza; 2 - 
alimentação; ou 3 - vestuário) e a situação (R - produtos que necessitam
de refrigeração; e N - produtos que não necessitam de refrigeração).

Calcule e mostre:
- O valor do aumento, usando as regras que se seguem.
[imagem, pág. 93]

- O valor do imposto, usando as regras a seguir.
  O produto que preencher pelo menos um dos seguintes requisitos pagará imposto
  equivalente a 5% do preço; caso contrário, pagará 8%. Os requisitos são:
  Categoria: 2
  Situação: R

- O novo preço, ou seja, o preço mais aumento menos imposto.
- A classificação, usando as regras a seguir.
[imagem, pág. 94]
*/
package capitulo_4.exercicios_propostos;

import java.text.DecimalFormat;
import java.util.Scanner;

public class ExercProposto24 {
  
  public static void main(String[] args) {
    Scanner entrada = new Scanner(System.in);
    DecimalFormat casas = new DecimalFormat("0.00");
    float prProduto, prNovo, aumento, imposto;
    int categoria, pctAumento, pctImposto;
    char situacao;
    String classificacao;

    System.out.print("\nDigite a preço do produto: ");
    prProduto = entrada.nextFloat();
    System.out.print("Qual a categoria do produto?\n1 - limpeza\n2 - alimentação\n3 - vestuário\n<< ");
    categoria = entrada.nextInt();
    entrada.nextLine();
    System.out.print("O produto selecionado precisa de refrigeração?\nS - Sim\nN - Não\n<< ");
    situacao = entrada.nextLine().charAt(0);
    situacao = Character.toUpperCase(situacao);

    if (prProduto > 0) {
      if (categoria==1 || categoria==2 || categoria==3) {
        if (situacao=='S' || situacao=='N') {

          if (prProduto <= 25) {
            if (categoria == 1) {
              pctAumento = 5;
            } else if (categoria == 2) {
              pctAumento = 8;
            } else {
              pctAumento = 10;
            }
          } else {
            if (categoria == 1) {
              pctAumento = 12;
            } else if (categoria == 2) {
              pctAumento = 15;
            } else {
              pctAumento = 18;
            }
          }

          if (categoria==2 || situacao=='S') {
            pctImposto = 5;
          } else {
            pctImposto = 8;
          }

          aumento = (prProduto*pctAumento) / 100;
          imposto = (prProduto*pctImposto) / 100;
          prNovo = prProduto + aumento - imposto;

          if (prNovo <= 50) {
            classificacao = "Barato";
          } else if (prNovo>50 && prNovo<120) {
            classificacao = "Normal";
          } else {
            classificacao = "Caro";
          }

          System.out.println("\nAumento de "+pctAumento+"%: R$ "+casas.format(aumento));
          System.out.println("Imposto de "+pctImposto+"%: R$ "+casas.format(imposto));
          System.out.println("Preço final: R$ "+casas.format(prNovo));
          System.out.println("Classificação do preço final: "+classificacao+"\n");
        } else {
          System.out.println("\nOpção de refrigeração, inválida!\n");
        }
      } else {
        System.out.println("\nCategoria, inválida!\n");
      }
    } else {
      System.out.println("\nPreço, inválido!\n");
    }

    entrada.close();
  }
}
