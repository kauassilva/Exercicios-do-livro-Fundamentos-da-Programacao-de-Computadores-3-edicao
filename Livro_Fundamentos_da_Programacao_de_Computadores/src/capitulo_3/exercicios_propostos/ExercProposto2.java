/**
@author kauas - 28/03/2022 Segunda
Livro: Fundamentos da Programação de Computadores
Capítulo 3, Exercício Proposto 2, pág.50
*/

/*
Faça um programa que receba três números, calcule e mostre a multiplicação
desses números.
*/
package capitulo_3.exercicios_propostos;

import java.util.Scanner;

public class ExercProposto2 {

    public static void main(String[] args) {
        // Declaração de variáveis
        Scanner entrada = new Scanner(System.in);
        float num1, num2, num3, mult;
        
        // Coletar dados
        System.out.println("Digite os três números: ");
        num1 = entrada.nextFloat();
        num2 = entrada.nextFloat();
        num3 = entrada.nextFloat();
        
        // Operação de multiplicação
        mult = num1 * num2 * num3;
        
        // Exibir dado
        System.out.println(num1+" * "+num2+" * "+num3+" = "+mult);

        entrada.close();
    }
    
}
