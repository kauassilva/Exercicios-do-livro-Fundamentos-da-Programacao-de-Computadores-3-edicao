/**
@author kauas - 16/04/2022 Quinta
Livro: Fundamentos da Programação de Computadores
Capítulo 4, Exercício Resolvido 15, pág.76
*/

/*
Faça um programa que receba o valor do salário mínimo, o número de horas
trabalhadas, o número de dependentes do funcionário e a quantidade de horas
extras trabalhadas. Calcule e mostre o salário a receber do funcionário de
acordo com as regras a seguir:

- O valor da hora trabalhada é igual a 1/5 do salário mínimo.
- O salário do mês é igual ao número de horas trabalhadas multiplicado pelo
  valor da hora trabalhada.
- Para cada dependente, acrescentar R$ 32,00.
- Para cada hora extra trabalhada, calcular o valor da hora trabalhado acrescida
  de 50%.
- O salário bruto é igual ao salário do mês mais o valor dos dependentes mais o
  valor das horas extras.
- Calcular o valor do imposto de renda retido na fonte de acordo com a tabela a
  seguir:
  [imagem, pág. 77]
- O salário líquido é igual ao salário bruto menos IRRF.
- A gratificação é de acordo com a tabela a seguir:
  [imagem, pág. 77]
- O salário a receber é igual ao salário líquido mais a gratificação.
*/
package capitulo_4.exercicios_resolvidos;

import java.text.DecimalFormat;
import java.util.Scanner;

public class ExercResolvido15 {
    
  public static void main(String[] args) {
    Scanner entrada = new Scanner(System.in);
    DecimalFormat casas = new DecimalFormat("0.00");
    int numHora, numHoraExtra, numDependente, valDependente, porcentagem=0, gratificacao=0;
    float salMinimo, salMes, salBruto, salLiquido, salFinal, valHora, valHoraExtra, irrf=0;
    
    System.out.print("Digite o salário mínimo: ");
    salMinimo = entrada.nextFloat();
    System.out.print("Digite a quantidade de horas trabalhadas: ");
    numHora = entrada.nextInt();
    System.out.print("Digite a quantidade de dependentes: ");
    numDependente = entrada.nextInt();
    System.out.print("Digite a quantidade de horas extras trabalhadas: ");
    numHoraExtra = entrada.nextInt();

    valHora = (salMinimo * 1) / numHora;
    salMes = numHora * valHora;
    valDependente = numDependente * 32;
    valHoraExtra = numHoraExtra * (valHora + (valHora * 0.5F));
    salBruto = salMes + valDependente + valHoraExtra;

    if (salBruto <= 0) {
      System.out.println("Salário inválido");
    } else {
      if (salBruto < 200) {
        irrf = 0;
      } else if (salBruto>=200 && salBruto<=500) {
        porcentagem = 10;
        irrf = (salBruto*porcentagem) / 100;
      } else {
        porcentagem = 20;
        irrf = (salBruto*porcentagem) / 100;
      }
    }

    salLiquido = salBruto - irrf;

    if (salLiquido <= 0) {
      System.out.println("Salário inválido");
    } else {
      if (salLiquido <= 350) {
        gratificacao = 100;
      } else {
        gratificacao = 50;
      }
    }

    salFinal = salLiquido + gratificacao;

    System.out.println("\nSalário a receber: R$ "+casas.format(salFinal));
    System.out.println("\n----- DETALHES -----");
    System.out.println("Valor da hora trabalhada: R$ "+casas.format(valHora));
    System.out.println("Salário do mês: R$ "+casas.format(salMes));
    System.out.println("Valor acrescido a quantidade de dependentes: R$ "+casas.format(valDependente));
    System.out.println("Valor da hora extra: R$ "+casas.format(valHoraExtra));
    System.out.println("Salário bruto: R$ "+casas.format(salBruto));
    System.out.println("IRRF ("+porcentagem+"%): R$ "+casas.format(irrf));
    System.out.println("Salário líquido: R$ "+casas.format(salLiquido)+"\n");

    entrada.close();
  }
}
