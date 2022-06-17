/**
@author kauas - 01/04/2022 Sexta
Livro: Fundamentos da Programação de Computadores
Capítulo 3, Exercício Proposto 21, pág.51
*/

/*
Faça um programa que receba o número de horas trabalhadas, o valor do salário mínimo e o número de horas extras trabalhadas, calcule e mostre o salário a receber, de acordo com as regras a seguir:
a) A hora trabalhada vale 1/8 do salário mínimo;
b) A hora extra vale 1/4 do salário mínimo;
c) O salário bruto equivale ao número de horas trabalhadas multiplicado pelo valor da hora trabalhada;
d) A quantia a receber pelas horas extras equivale ao número de horas extras trabalhadas multiplcado pelo valor da hora extra;
e) O salário a receber equivale ao salário bruto mais a quantia a receber pelas horas extras.
*/
package capitulo_3.exercicios_propostos;

import java.text.DecimalFormat;
import java.util.Scanner;

public class ExercProposto21 {
  
  public static void main(String[] args) {
    Scanner entrada = new Scanner(System.in);
    DecimalFormat casas = new DecimalFormat("0.00");
    int horaTrabalhada, horaExtra;
    float salMinimo, valHoraTrabalhada, valHoraExtra, salBruto, quantExtra, salLiquido;

    System.out.print("\nDigite o número de horas trabalhadas: ");
    horaTrabalhada = entrada.nextInt();
    System.out.print("Digite o valor do salário mínimo: ");
    salMinimo = entrada.nextFloat();
    System.out.print("Digite o número de horas extras: ");
    horaExtra = entrada.nextInt();

    valHoraTrabalhada = salMinimo / 8;
    valHoraExtra = salMinimo / 4;
    salBruto = horaTrabalhada * valHoraTrabalhada;
    quantExtra = horaExtra * valHoraExtra;
    salLiquido = salBruto + quantExtra;

    System.out.println("\nValor da hora trabalhada: R$"+casas.format(valHoraTrabalhada));
    System.out.println("Valor da hora extra: R$"+casas.format(valHoraExtra));
    System.out.println("Salário bruto: R$"+casas.format(salBruto));
    System.out.println("Quantia das horas extras: R$"+casas.format(quantExtra));
    System.out.println("Salário líquido: R$"+casas.format(salLiquido));

    entrada.close();
  }
}
