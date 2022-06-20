/**
@author kauas - 14/04/2022 Quinta
Livro: Fundamentos da Programação de Computadores
Capítulo 4, Exercício Resolvido 4, pág.64
*/

/*
Faça um programa que receba três números e mostre-os em ordem crescente. Suponha
que o usuário digitará três números diferentes.
*/
package capitulo_4.exercicios_resolvidos;

import java.util.Scanner;

public class ExercResolvido4 {
    
    public static void main(String[] args) {
        // Declaração de variáveis
        Scanner entrada = new Scanner(System.in);
        float num1, num2, num3;
        
        // Coletar dados
        System.out.println("Digite três número:");
        num1 = entrada.nextFloat();
        num2 = entrada.nextFloat();
        num3 = entrada.nextFloat();
        
        // Desvio condicional referente a ordem crescente
        if (num1 < num2 && num2 < num3) {
            System.out.println("Ordem crescente: "+num1+" - "+num2+" - "+num3);
        } else if (num2 < num3 && num3 < num1) {
            System.out.println("Ordem crescente: "+num2+" - "+num3+" - "+num1);
        } else if (num3 < num1 && num1 < num2) {
            System.out.println("Ordem crescente: "+num3+" - "+num1+" - "+num2);
        } else if (num1 == num2 || num1 == num3 || num2 == num3) {
            System.out.println("Há pelo menos dois números iguais");
        } else {
            System.out.println("Algo inesperado ocorreu...");
        }

        entrada.close();
    }
}
