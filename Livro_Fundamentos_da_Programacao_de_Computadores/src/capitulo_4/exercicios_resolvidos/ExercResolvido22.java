/**
@author kauas - 18/04/2022 Segunda
Livro: Fundamentos da Programação de Computadores
Capítulo 4, Exercício Resolvido 22, pág.84
*/

/*
Faça um programa que receba o salário base e o tempo de serviço de um
funcionário. Calcule e mostre:
- O imposto, conforme a tabela a seguir.
  [imagem, pág. 84]
- A gratificação, de acordo com a tabela a seguir.
  [imagem, pág. 84]
- O salário líquido, ou seja, salário base menos imposto mais
  gratificação.
- A categoria, que está na tabela a seguir.
  [imagem, pág. 84]
*/
package capitulo_4.exercicios_resolvidos;

import java.text.DecimalFormat;
import java.util.Scanner;

public class ExercResolvido22 {
  
  public static void main(String[] args) {
    Scanner entrada = new Scanner(System.in);
    DecimalFormat casas = new DecimalFormat("0.00");
    float salBase, salLiquido, imposto=0;
    int tpServico, porcentagem=0, gratificacao=0;
    String categoria="";

    System.out.print("\nDigite o salário base: ");
    salBase = entrada.nextFloat();
    System.out.print("Digite o tempo de serviço: ");
    tpServico = entrada.nextInt();

    if (salBase>0 && tpServico>=0) {
      if (salBase < 200) {
        porcentagem = 0;
        imposto = (salBase*porcentagem) /100;
      } else if (salBase>=200 && salBase<=450) {
        porcentagem = 3;
        imposto = (salBase*porcentagem) /100;
      } else if (salBase>450 && salBase<700) {
        porcentagem = 8;
        imposto = (salBase*porcentagem) /100;
      } else if (salBase >= 700) {
        porcentagem = 12;
        imposto = (salBase*porcentagem) /100;
      }

      if (salBase > 500) {
        if (tpServico <= 3) {
          gratificacao = 20;
        } else if (tpServico > 3) {
          gratificacao = 30;
        }
      } else if (salBase <= 500) {
        if (tpServico <= 3) {
          gratificacao = 23;
        } else if (tpServico>3 && tpServico<6) {
          gratificacao = 35;
        } else if (tpServico >= 6) {
          gratificacao = 33;
        }
      }
    } else {
      System.out.println("\nSalário e/ou Tempo de Serviço, inválido(s)!");
    }

    salLiquido = salBase - imposto + gratificacao;

    if (salLiquido <= 350) {
      categoria = "A";
    } else if (salLiquido>350 && salLiquido<600) {
      categoria = "B";
    } else if (salLiquido >= 600) {
      categoria = "C";
    }

    System.out.println("\nImposto ("+porcentagem+"%): R$ "+casas.format(imposto));
    System.out.println("Gratificação: R$ "+casas.format(gratificacao));
    System.out.println("Salário Líquido: R$ "+casas.format(salLiquido));
    System.out.println("Categoria: "+categoria+"\n");

    entrada.close();
  }
}
