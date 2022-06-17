/**
@author kauas - 01/04/2022 Sexta
Livro: Fundamentos da Programação de Computadores
Capítulo 3, Exercício Proposto 24, pág.52
*/

/*
Faça um programa que receba a quantidade de dinheiro em reais que uma pessoa que vai viajar possui. Ela vai passar por vários países e precisa converter seu dinheiro em dólares, marco alemão e libra esterlina. Sabe-se que a cotação do dólar é de R$ 1,80; do marco alemão, de R$ 2,00; e da libra esterlina, de R$ 3,57. O programa que deve fazer as conversões e mostrá-las.
*/
package capitulo_3.exercicios_propostos;

import java.text.DecimalFormat;
import java.util.Scanner;

public class ExercProposto24 {
  
  public static void main(String[] args) {
    Scanner entrada = new Scanner(System.in);
    DecimalFormat casas = new DecimalFormat("0.00");
    float dinReal, dinDolar, dinMarco, dinLibra;

    System.out.print("\nDigite a quantidade de dinheiro em reais: ");
    dinReal = entrada.nextFloat();

    dinDolar = dinReal * 1.80F;
    dinMarco = dinReal * 2;
    dinLibra = dinReal * 3.57F;

    System.out.println("\nBRL R$ "+casas.format(dinReal)+" = USD $ "+casas.format(dinDolar)+" = DEM "+casas.format(dinMarco)+" = GBP £ "+casas.format(dinLibra));
    
    entrada.close();
  }
}
