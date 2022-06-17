/**
@author kauas - 23/04/2022 sábado
Livro: Fundamentos da Programação de Computadores
Capítulo 4, Exercício Proposto 14, pág.92
*/

/*
Faça um programa que receba o salário de um funcionáiro e, usando a tabela a
seguir, calcule e mostre o novo salário.
[imagem, pág. 92]
*/
package capitulo_4.exercicios_propostos;

import java.text.DecimalFormat;
import java.util.Scanner;

public class ExercProposto14 {
  
  public static void main(String[] args) {
    Scanner entrada = new Scanner(System.in);
    DecimalFormat casas = new DecimalFormat("0.00");
    float salAtual, salNovo, aumento;
    int porcentagem;
    
    System.out.print("\nDigite o salário do funcionário: ");
    salAtual = entrada.nextFloat();

    if (salAtual > 0) {
      if (salAtual <= 300) {
        porcentagem = 50;
      } else if (salAtual>300 && salAtual<=500) {
        porcentagem = 40;
      } else if (salAtual>500 && salAtual<=700) {
        porcentagem = 30;
      } else if (salAtual>700 && salAtual<=800) {
        porcentagem = 20;
      } else if (salAtual>800 && salAtual<=1000) {
        porcentagem = 10;
      } else {
        porcentagem = 5;
      }

      aumento = (salAtual*porcentagem) / 100;
      salNovo = salAtual + aumento;
      
      System.out.println("\nAumento de "+porcentagem+"%: R$ "+casas.format(aumento));
      System.out.println("Novo salário: R$ "+casas.format(salNovo)+"\n");
    } else {
      System.out.println("\nSalário, inválido!\n");
    }

    entrada.close();
  }
}
