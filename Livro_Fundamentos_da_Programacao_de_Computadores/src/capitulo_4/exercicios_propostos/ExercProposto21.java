/**
@author kauas - 02/05/2022 segunda
Livro: Fundamentos da Programação de Computadores
Capítulo 4, Exercício Proposto 21, pág.92
*/

/*
Faça um programa que receba o preço de um produto e seu código de origem e
mostre sua procedência. A procedência obedece à tabela a seguir.
[imagem, pág. 93]
*/
package capitulo_4.exercicios_propostos;

import java.text.DecimalFormat;
import java.util.Scanner;

public class ExercProposto21 {

  public static void main(String[] args) {
    Scanner entrada = new Scanner(System.in);
    DecimalFormat casas = new DecimalFormat("0.00");
    float prProduto;
    int id;
    String procedencia;

    System.out.print("\nDigite o preço do produto: ");
    prProduto = entrada.nextFloat();

    if (prProduto > 0) {
      System.out.print("Digite o código de origem do produto: ");
      id = entrada.nextInt();

      if (id>0 && id<31) {
        if (id == 1) {
          procedencia = "Sul";
        } else if (id == 2) {
          procedencia = "Norte";
        } else if (id == 3) {
          procedencia = "Leste";
        } else if (id == 4) {
          procedencia = "Oeste";
        } else if (id==5 || id==6) {
          procedencia = "Nordeste";
        } else if (id>=7 && id<=9) {
          procedencia = "Sudeste";
        } else if (id>=10 && id<=20) {
          procedencia = "Centro-oeste";
        } else {
          procedencia = "Noroeste";
        }

        System.out.println("\nProcedencia do produto: "+procedencia);
        System.out.println("Preço do produto: R$ "+casas.format(prProduto)+"\n");
      } else {
        System.out.println("\nCódigo do produto, inválido!\n");
      }
    } else {
      System.out.println("\nPreço do produto, inválido!\n");
    }
    
    entrada.close();
  }
}
