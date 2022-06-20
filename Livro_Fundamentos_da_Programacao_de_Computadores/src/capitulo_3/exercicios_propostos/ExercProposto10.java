/**
@author kauas - 31/03/2022 Quinta
Livro: Fundamentos da Programação de Computadores
Capítulo 3, Exercício Proposto 10, pág.51
*/

/*
Faça um programa que calcule e mostre a área de um quadrado. Sabe-se que:
A = lado * lado.
*/
package capitulo_3.exercicios_propostos;

import java.util.Scanner;

public class ExercProposto10 {
    
    public static void main(String[] args) {
        // Declaração de variáveis
        Scanner entrada = new Scanner(System.in);
        float lado, area;
        
        // Coletar dado
        System.out.print("Digite o valor do lado: ");
        lado = entrada.nextFloat();
        
        // Cálculo referente a área
        area = (float) Math.pow(lado, 2);
        
        // Exibir dado
        System.out.println("A = L * L\nA = "+lado+" * "+lado+"\nA = "+area+"cm");

        entrada.close();
    }
}
