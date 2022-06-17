/**
@author kauas - 18/04/2022 Segunda
Livro: Fundamentos da Programação de Computadores
Capítulo 4, Exercício Resolvido 19, pág.80
*/

/*
Faça um programa que receba a altura e o peso de uma pessoa. De acordo com
a tabela a seguir, verifique e mostre a classificação dessa pessoa.
[imagem, pág. 80]
*/
package capitulo_4.exercicios_resolvidos;

import java.util.Scanner;

public class ExercResolvido19 {
  
  public static void main(String[] args) {
    Scanner entrada = new Scanner(System.in);
    float altura, peso;

    System.out.print("\nDigite o peso em quilos: ");
    peso = entrada.nextFloat();
    System.out.print("Digite a altura em metros: ");
    altura = entrada.nextFloat();
    
    if (peso>0 && altura>0) {
      if (peso < 60) {
        if (altura < 1.2) {
          System.out.println("\nClassificação: A\n");
        } else if (altura>=1.2 && altura<=1.7) {
          System.out.println("\nClassificação: B\n");
        } else if (altura > 1.7) {
          System.out.println("\nClassificação: C\n");
        }
      } else if (peso>=60 && peso<=90) {
        if (altura < 1.2) {
          System.out.println("\nClassificação: D\n");
        } else if (altura>=1.2 && altura<=1.7) {
          System.out.println("\nClassificação: E\n");
        } else {
          System.out.println("\nClassificação: F\n");
        }
      } else {
        if (altura < 1.2) {
          System.out.println("\nClassificação: G\n");
        } else if (altura>=1.2 && altura<=1.7) {
          System.out.println("\nClassificação: H\n");
        } else {
          System.out.println("\nClassificação: I\n");
        }
      }
    } else {
      System.out.println("\nPeso e/ou Altura inválido\n");
    }
    

    entrada.close();
  }
}
