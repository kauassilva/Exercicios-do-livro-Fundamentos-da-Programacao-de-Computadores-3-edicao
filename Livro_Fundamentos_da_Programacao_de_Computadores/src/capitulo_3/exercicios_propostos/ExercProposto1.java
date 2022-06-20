/** 
@author kauas - 28/03/2022 Segunda
Livro: Fundamentos da Programação de Computadores
Capítulo 3, Exercício Proposto 1, pág.50
*/

/*
Faça um programa que receba dois números, calcule e mostre a subtração do
primeiro número pelo segundo.
*/
package capitulo_3.exercicios_propostos;

import java.util.Scanner;

public class ExercProposto1 {

    public static void main(String[] args) {
        // Declaração de variáveis
        Scanner entrada = new Scanner(System.in);
        float num1, num2, subt;
        
        // Coletar dados
        System.out.println("Digite dois números: ");
        num1 = entrada.nextFloat();
        num2 = entrada.nextFloat();
        
        // Operação de subtração
        subt = num1 - num2;
        
        // Exibir dado
        System.out.println(num1+" - "+num2+" = "+subt);

        entrada.close();
    }
    
}
