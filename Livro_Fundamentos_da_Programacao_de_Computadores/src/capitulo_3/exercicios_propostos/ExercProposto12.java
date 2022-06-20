/**
@author kauas - 31/03/2022 Quinta
Livro: Fundamentos da Programação de Computadores
Capítulo 3, Exercício Proposto 12, pág.51
*/

/*
Faça um programa que receba o valor do salário mínimo e o valor do salário de um
funcionário, calcule e mostre a quantidade de salários mínimos que esse
funcionário ganha.
*/
package capitulo_3.exercicios_propostos;

import java.util.Scanner;
import java.text.DecimalFormat;

public class ExercProposto12 {
    
    public static void main(String[] args) {
        // Declaração de variáveis
        Scanner entrada = new Scanner(System.in);
        DecimalFormat casas = new DecimalFormat("0.00");
        float salMin, salFun, quant;
        
        // Coletar dados
        System.out.print("Digite o valor do salário mínimo: ");
        salMin = entrada.nextFloat();
        System.out.print("Digite o valor do salário do funcionário: ");
        salFun = entrada.nextFloat();
        
        // Cálculo referentes a quantidade de salários mínimos
        quant = salFun / salMin;
        
        // Exibir dado
        System.out.println("Quantidade de salários mínimos que o funcionário recebe: "+casas.format(quant));

        entrada.close();
    }
}
