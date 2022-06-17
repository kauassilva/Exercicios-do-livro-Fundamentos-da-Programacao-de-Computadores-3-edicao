/**
@author kauas - 23/04/2022 sábado
Livro: Fundamentos da Programação de Computadores
Capítulo 4, Exercício Proposto 12, pág.91
*/

/*
Faça um programa que receba o salário bruto de um funcionário e, usando a tabela
a seguir, calcule e mostre o valor a receber. Sabe-se que este é composto pelo
salário bruto acrescido de gratificação e descontado o imposto 7% sobre o
salário.
[imagem, pág. 91]
*/
package capitulo_4.exercicios_propostos;

import java.text.DecimalFormat;
import java.util.Scanner;

public class ExercProposto12 {
    
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        DecimalFormat casas = new DecimalFormat("0.00");
        float salBruto, imposto, salNovo;
        int gratificacao;
        
        System.out.print("Digite o salário bruto: ");
        salBruto = entrada.nextFloat();
        
        if (salBruto > 0) {
            if (salBruto <= 350) {
                gratificacao = 100;
            } else if (salBruto>350 && salBruto<600) {
                gratificacao = 75;
            } else if (salBruto>=600 && salBruto<=900) {
                gratificacao = 50;
            } else {
                gratificacao = 35;
            }
            
            imposto = salBruto*0.07F;
            salNovo = salBruto + gratificacao - imposto;
            
            System.out.println("\nGratificação: R$ "+casas.format(gratificacao));
            System.out.println("Imposto (7%): R$ "+casas.format(imposto));
            System.out.println("\nSalário a receber: R$ "+casas.format(salNovo));
        } else {
            System.out.println("\nSalário bruto, inválido!");
        }
        
        entrada.close();
    }
}
