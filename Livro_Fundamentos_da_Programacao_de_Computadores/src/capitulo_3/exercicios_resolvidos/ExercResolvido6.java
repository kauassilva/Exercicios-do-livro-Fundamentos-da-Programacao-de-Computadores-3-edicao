/**
@author kauas - 27/03/2022 Domingo
Livro: Fundamentos da Programação de Computadores
Capítulo 3, Exercício Resolvido 6, pág.40
*/

/*
Faça um programa que receba o salário base de um funcionário, calcule e mostre o
salário a receber, sabendo-se que o funcionário tem gratificação de 5% sobre o
salário base e paga imposto de 7% também sobre o salário base.
*/
package capitulo_3.exercicios_resolvidos;

import java.util.Scanner;
import java.text.DecimalFormat;

public class ExercResolvido6 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        DecimalFormat casas = new DecimalFormat("0.00");
        float salario, salarioFinal, gratificacao, imposto;
        
        System.out.print("Digite o salário: ");
        salario = entrada.nextFloat();
        
        gratificacao = salario * 0.05F;
        imposto = salario * 0.07F;
        salarioFinal = salario + gratificacao - imposto;
        
        System.out.println("seu salário bruto é R$"+casas.format(salario));
        System.out.println("sua gratificação de 5% sobre seu salário bruto é R$"+casas.format(gratificacao));
        System.out.println("O imposto de 7% sobre seu salário bruto é R$"+casas.format(imposto));
        System.out.println("O seu salário líquido é R$"+casas.format(salarioFinal));

        entrada.close();
    }
    
}
