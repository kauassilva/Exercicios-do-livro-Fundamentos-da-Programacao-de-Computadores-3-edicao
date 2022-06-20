/**
@author kauas - 01/04/2022 Sexta
Livro: Fundamentos da Programação de Computadores
Capítulo 3, Exercício Proposto 23, pág.52
*/

/*
Faça um programa que receba a medida de dois ângulos de um triângulo, calcule e mostre a medida do terceiro ângulo. Sabe-se que a soma dos ângulos de um triângulo é 180 graus.
*/
package capitulo_3.exercicios_propostos;

import java.util.Scanner;

public class ExercProposto23 {
  
  public static void main(String[] args) {
    // Declaração de variáveis 
    Scanner entrada = new Scanner(System.in);
    float ang1, ang2, ang3;

    // Coletar dados
    System.out.println("\nDigite a medida de dois ângulos: ");
    ang1 = entrada.nextFloat();
    ang2 = entrada.nextFloat();

    // Operação referente ao ângulo
    ang3 = Math.abs(ang1 + ang2 - 180);

    // Exibir dados
    System.out.println("\nMedida do terceiro ângulo: "+ang3);

    entrada.close();
  }
}
