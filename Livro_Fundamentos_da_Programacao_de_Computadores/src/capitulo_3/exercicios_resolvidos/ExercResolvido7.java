/**
@author kauas - 27/03/2022 Domingo
Livro: Fundamentos da Programação de Computadores
Capítulo 3, Exercício Resolvido 7, pág.40
*/

/*
Faça um programa que receba o salário base de um funcionário, calcule e mostre
seu salário a receber, sabendo-se que o funcionário tem gratificação de R$50 e
paga imposto de 10% sobre o salário base.
*/
package capitulo_3.exercicios_resolvidos;

import java.util.Scanner;
import java.text.DecimalFormat;

public class ExercResolvido7 {

    public static void main(String[] args) {
        // Declaração de variáveis
        Scanner entrada = new Scanner(System.in);
        DecimalFormat casas = new DecimalFormat("0.00");
        float salario, imposto, salarioFinal;
        
        // Coletar dados
        System.out.print("Digite o salário bruto: ");
        salario = entrada.nextFloat();
        
        // Operações referentes ao salário final
        imposto = salario * 0.1F;
        salarioFinal = salario + 50 - imposto;
        
        // Exibir dados
        System.out.println("\nSalário bruto: R$"+casas.format(salario));
        System.out.println("Imposto sobre o salário bruto: R$"+casas.format(imposto));
        System.out.println("gratificação: R$50,00");
        System.out.println("Salário líquido: R$"+casas.format(salarioFinal));

        entrada.close();
    }
    
}
