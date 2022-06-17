/**
@author kauas - 14/04/2022 Quinta
Livro: Fundamentos da Programação de Computadores
Capítulo 4, Exercício Resolvido 5, pág.64
*/

/*
Faça um programa que receba três números obrigatoriamente em ordem crescente e
um quarto número que não siga essa regra. Mostre, em seguida, os quatro números
em ordem decrescente. Suponha que o usuário digitará quatro números diferentes.
*/
package capitulo_4.exercicios_resolvidos;

import java.util.Scanner;

public class ExercResolvido5 {
    
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        float num1, num2, num3, num4;
        
        System.out.println("Digite três números em ordem crescente:");
        num1 = entrada.nextFloat();
        num2 = entrada.nextFloat();
        num3 = entrada.nextFloat();
        System.out.print("Digite um quarto número qualquer: ");
        num4 = entrada.nextFloat();
        
        if (num4 > num3) {
            System.out.println("Ordem decrescente: "+num4+" - "+num3+" - "+num2+" - "+num1);
        } else if (num3 > num4 && num4 > num2) {
            System.out.println("Ordem decrescente: "+num3+" - "+num4+" - "+num2+" - "+num1);
        } else if (num2 > num4 && num4 > num1) {
            System.out.println("Ordem decrescente: "+num3+" - "+num2+" - "+num4+" - "+num1);
        } else if (num1 > num4) {
            System.out.println("Ordem decrescente: "+num3+" - "+num2+" - "+num1+" - "+num4);
        } else {
            System.out.println("Há pelo menos dois números iguais");
        }

        entrada.close();
    }
}
