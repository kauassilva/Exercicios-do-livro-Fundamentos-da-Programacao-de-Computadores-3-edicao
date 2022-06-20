/**
@author kauas - 28/03/2022 Segunda
Livro: Fundamentos da Programação de Computadores
Capítulo 3, Exercício Proposto 3, pág.50
*/

/*
Faça um programa que receba dois números, calcule e mostre a divisão do primeiro
número pelo segundo. Sabe-se que o segundo número não pode ser zero, portanto,
não é necessário se preocupar com validações.
*/
package capitulo_3.exercicios_propostos;

import java.util.Scanner;

public class ExercProposto3 {

    public static void main(String[] args) {
        // Declaração de variáveis
        Scanner entrada = new Scanner(System.in);
        float num1, num2, divi;
        
        // Coletar dados
        System.out.println("Digite dois números: ");
        num1 = entrada.nextFloat();
        num2 = entrada.nextFloat();
        
        // Operação de divisão
        divi = num1 / num2;
        
        // Exibir dado
        System.out.println(num1+" / "+num2+" = "+divi);

        entrada.close();
    }
    
}
