/**
@author kauas - 23/04/2022 sábado
Livro: Fundamentos da Programação de Computadores
Capítulo 4, Exercício Proposto 15, pág.92
*/

/*
Uma agência bancária possui dois tipos de investimentos conforme o quadro a
seguir. Faça um programa que receba o tipo de investimento e seu valor,
calcule e mostre o valor corrigido após um mês de investimento, de acordo com
o tipo de investimento.
[imagem, pág. 92]
*/
package capitulo_4.exercicios_propostos;

import java.text.DecimalFormat;
import java.util.Scanner;

public class ExercProposto15 {
  
  public static void main(String[] args) {
    Scanner entrada = new Scanner(System.in);
    DecimalFormat casas = new DecimalFormat("0.00");
    int tipo, porcentagem;
    float vlInvestimento, rendimento;
    String descricao;

    System.out.print("\nQue tipo de investimento deseja realizar?\n1 - Poupança\n2 - Fundos de Renda Fixa\n<< ");
    tipo = entrada.nextInt();

    if (tipo==1 || tipo==2) {
      System.out.print("Digite o valor que deseja investir: ");
      vlInvestimento = entrada.nextFloat();

      if (vlInvestimento > 0) {
        if (tipo==1) {
          descricao = "Poupança";
          porcentagem = 3;
        } else {
          descricao = "Fundos de renda fixa";
          porcentagem = 5;
        }

        rendimento = vlInvestimento + ((vlInvestimento*porcentagem) / 100);

        System.out.println("\nInvestimento do tipo: "+descricao+"");
        System.out.println("Rendimento de "+porcentagem+"%: R$ "+casas.format(rendimento)+"\n");
      } else {
        System.out.println("\nValor do investimento, inválido!\n");
      }
    } else {
      System.out.println("\nTipo de investimento, inválido!\n");
    }

    entrada.close();
  }
}
