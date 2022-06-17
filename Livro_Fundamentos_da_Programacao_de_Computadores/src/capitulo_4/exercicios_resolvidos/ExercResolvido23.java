/**
@author kauas - 18/04/2022 Segunda
Livro: Fundamentos da Programação de Computadores
Capítulo 4, Exercício Resolvido 23, pág.85
*/

/*
Faça umm programa que receba o valor do salário mínimo, o turno detrabalho 
(M - matutino; V - vespertino; N - noturno), a categoria 
(O - operário; G - gerente) e o número de horas trabalhadas no mês de
um funcionário. Suponha a digitação apenas de dados válidos e, quando houver 
digitação de letras utilize maiúsculas. Calcule e mostre:
- O coeficiente do salário, de acordo com a tabela a seguir.
  [imagem, pág. 85]
- O valor do salário bruto, ou seja, o número de horas trabalhadas
  multiplicado pelo valor do coeficiente do salário.
- O imposto, de acordo com a tabela a seguir.
  [imagem, pág. 86]
- A gratificação, de acordo com as regras a seguir.
    Se o funcionário preencher todos os requisitos a seguir, sua gratificação
    será de R$ 50,00; caso contrário, será de R$ 30,00.
    Os requisitos são:
    Turno: Noturno;
    Número de horas trabalhadas: Superior a 80 horas.
- O auxílio alimentação, de acordo com as seguintes regras.
    Se o funcionário preencher algum dos requisitos a seguir, seu auxílio
    alimentação será de um terço do seu salário bruto; caso contrário, será de
    metade do seu salário bruto. Os requisitos são
    Categoria: operário
    Coeficiente do salário: <= 25
- O salário líquido, ou seja, salário bruto menos imposto mais gratificação mais
  auxílio alimentação;
- A classificação, de acordo com a tabela a seguir:
  [imagem, pág. 86]
*/
package capitulo_4.exercicios_resolvidos;

import java.text.DecimalFormat;
import java.util.Scanner;

public class ExercResolvido23 {
  
  public static void main(String[] args) {
    Scanner entrada = new Scanner(System.in);
    DecimalFormat casas = new DecimalFormat("0.00");
    float salMin, salBruto, salLiquido, coeficiente=0, imposto=0, auxAlimentacao, pctAuxAlimentacao;
    char turno, categoria;
    int qtdHoraTrabalhada, pctCoeficiente=0, pctImposto=0, gratificacao;
    String mensagem;

    System.out.print("\nDigite o salário mínimo: ");
    salMin = entrada.nextFloat();
    entrada.nextLine(); // Limpa buffer
    System.out.print("\nEscolha o turno de trabalho\n[M] - Matutino\n[V] - Vespertino\n[N] - Noturno\n<< ");
    turno = entrada.nextLine().charAt(0);
    System.out.print("\nEscolha a categoria\n[O] - Operário\n[G] - Gerente\n<< ");
    categoria = entrada.nextLine().charAt(0);
    System.out.print("\nDigite a quantidade de horas trabalhadas: ");
    qtdHoraTrabalhada = entrada.nextInt();

    if (salMin>0 && qtdHoraTrabalhada>0) {
      switch (Character.toUpperCase(turno)) {
        case 'M':
          pctCoeficiente = 10;
          coeficiente = (salMin*pctCoeficiente) / 100;
          break;
        case 'V':
          pctCoeficiente = 15;
          coeficiente = (salMin*pctCoeficiente) / 100;
          break;
        case 'N':
          pctCoeficiente = 12;
          coeficiente = (salMin*pctCoeficiente) / 100;
          break;
        default:
        System.out.println("\n--> Opção do Turno, inválido! <--");
      }
      
      salBruto = qtdHoraTrabalhada * coeficiente;
      
      switch (Character.toUpperCase(categoria)) {
        case 'O':
          if (salBruto >= 300) {
            pctImposto = 5;
            imposto = (salBruto*pctImposto) / 100;
          } else {
            pctImposto = 3;
            imposto = (salBruto*pctImposto) / 100;
          }
          break;
        case 'G':
          if (salBruto >= 400) {
            pctImposto = 6;
            imposto = (salBruto*pctImposto) / 100;
          } else {
            pctImposto = 4;
            imposto = (salBruto*pctImposto) / 100;
          }
          break;
        default:
          System.out.println("\n--> Opção da Categoria, inválido! <--");
      }
  
      if (Character.toUpperCase(turno)=='N' && qtdHoraTrabalhada>80) {
        gratificacao = 50;
      } else {
        gratificacao = 30;
      }
  
      if (Character.toUpperCase(categoria)=='O' || coeficiente<=25) {
        pctAuxAlimentacao = 33.3F;
        auxAlimentacao = salBruto / 3;
      } else {
        pctAuxAlimentacao = 50;
        auxAlimentacao = salBruto / 2;
      }
  
      salLiquido = salBruto - imposto + gratificacao + auxAlimentacao;
  
      if (salLiquido < 350) {
        mensagem = "Mal remunerado";
      } else if (salLiquido>=350 && salLiquido<=600) {
        mensagem = "Normal";
      } else {
        mensagem = "Bem remunerado";
      }
  
      System.out.println("\nCoeficiente do trabalho ("+pctCoeficiente+"%): "+coeficiente);
      System.out.println("Salário bruto: R$ "+casas.format(salBruto));
      System.out.println("Imposto ("+pctImposto+"%): R$ "+casas.format(imposto));
      System.out.println("Gratificação: R$ "+casas.format(gratificacao));
      System.out.println("Auxílio Alimentação ("+pctAuxAlimentacao+"%): R$ "+casas.format(auxAlimentacao));
      System.out.println("Salário líquido: R$ "+casas.format(salLiquido));
      System.out.println("Classificação: "+mensagem+"\n");
    } else {
      System.out.println("\nSalário mínimo e/ou Quantidade de horas trabalhadas, inválido(s)!\n");
    }
    
    entrada.close();
  }
}
