/**
@author kauas - 27/03/2022 Domingo
Livro: Fundamentos da Programação de Computadores
Capítulo 3, Exercício Resolvido 1, pág.36
*/

/*
Faça um programa que receba quatro números inteiros, calcule e mostre a soma 
desses números.
*/
package capitulo_3.exercicios_resolvidos;

import java.util.Scanner;

public class ExercResolvido1 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int num1, num2, num3, num4, resultado;
        
        System.out.println("Digite os quatros números inteiros: ");
        num1 = entrada.nextInt();
        num2 = entrada.nextInt();
        num3 = entrada.nextInt();
        num4 = entrada.nextInt();
        
        resultado = num1 + num2 + num3 + num4;
        
        System.out.println("A soma de "+num1+" + "+num2+" + "+num3+" + "+num4+" = "+resultado);

        entrada.close();
    }
    
}
