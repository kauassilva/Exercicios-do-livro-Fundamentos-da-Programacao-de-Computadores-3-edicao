/**
@author kauas - 01/04/2022 Sexta
Livro: Fundamentos da Programação de Computadores
Capítulo 3, Exercício Proposto 22, pág.52
*/

/*
Faça um programa que receba o número de lados de um polígono convexo, calcule e mostre o número de diagonais desse polígono. Sabe-se que ND = N * (N - 3)/2, em que N é o número de lados do polígono.
*/
package capitulo_3.exercicios_propostos;

import java.util.Scanner;

public class ExercProposto22 {
  
  public static void main(String[] args) {
    // Declaração de variáveis
    Scanner entrada = new Scanner(System.in);
    int numLado, numDiagonal;

    // Coletar dado
    System.out.print("\nDigite o número de lados de um polígono convexo: ");
    numLado = entrada.nextInt();

    // Operação referentes ao número de diagonais
    numDiagonal = (numLado * (numLado - 3)) / 2;

    // Exibir dado
    System.out.println("\nNúmero de diagonais do polígono: "+numDiagonal);
    
    entrada.close();
  }
}
