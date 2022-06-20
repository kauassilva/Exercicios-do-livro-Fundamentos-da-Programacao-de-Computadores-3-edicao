/**
@author kauas - 01/04/2022 Sexta
Livro: Fundamentos da Programação de Computadores
Capítulo 3, Exercício Proposto 25, pág.52
*/

/*
Faça um programa que receba uma hora (uma variável para hora e outra para minutos), calcule e mostre:
a) a hora digitada convertida em minutos;
b) O total dos minutos, ou seja, os minutos digitados mais a conversão anterior;
c) O total dos minutos convertidos em segundos.
*/
package capitulo_3.exercicios_propostos;

import java.util.Scanner;

public class ExercProposto25 {

  public static void main(String[] args) {
    // Declaração de variáveis
    Scanner entrada = new Scanner(System.in);
    int hora, minuto, convHoraMinuto, totalMinuto, convMinSegundo;

    // Coletar dados
    System.out.print("Digite a hora: ");
    hora = entrada.nextInt();
    System.out.print("Digite os minutos: ");
    minuto = entrada.nextInt();

    // Operações referentes ao tempo
    convHoraMinuto = hora * 60;
    totalMinuto = minuto + convHoraMinuto;
    convMinSegundo = totalMinuto * 60;

    // Exibir dados
    System.out.println("\n"+hora+" hora(s) em minutos "+convHoraMinuto);
    System.out.println("Total de minutos: "+totalMinuto);
    System.out.println("Total de minutos em segundos: "+convMinSegundo);
    
    entrada.close();
  }
}
