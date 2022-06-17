/**
@author kauas - 23/04/2022 sábado
Livro: Fundamentos da Programação de Computadores
Capítulo 4, Exercício Proposto 3, pág.90
*/

/*
Faça um programa que receba dois números e mostre o menor.
*/
package capitulo_4.exercicios_propostos;

import java.util.Scanner;

public class ExercProposto3 {
  
  public static void main(String[] args) {
    Scanner entrada = new Scanner(System.in);
    float num1, num2, menor=0;

    System.out.println("\nDigite dois números:");
    num1 = entrada.nextFloat();
    num2 = entrada.nextFloat();

    if (num1 != num2) {   
      if (num1 > num2) {
        menor = num2;
      } else if (num2 > num1) {
        menor = num1;
      }

      System.out.println("\nMenor número: "+menor+"\n");
    } else {
      System.out.println("\nOs números são iguais\n");
    }

    entrada.close();
  }
}
