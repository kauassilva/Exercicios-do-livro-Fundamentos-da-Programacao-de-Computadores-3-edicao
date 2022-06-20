/**
@author kauas - 27/03/2022 Domingo
Livro: Fundamentos da Programação de Computadores
Capítulo 3, Exercício Resolvido 16, pág.45
*/

/*
Faça um programa que receba o número de horas trabalhadas e o valor do salário
mínimo, calcule e mostre o salário a receber, seguindo estas regras:
a) A hora trabalhada vale a metade do salário mínimo.
b) O salário bruto equivale ao número de horas trabalhadas multiplicado pelo
valor da hora trabalhada.
c) O imposto equivale a 3% do salário bruto.
d) O salário a receber equivale ao salário bruto menos o imposto.
*/
package capitulo_3.exercicios_resolvidos;

import java.util.Scanner;
import java.text.DecimalFormat;

public class ExercResolvido16 {

    public static void main(String[] args) {
        // Declaração de variáveis
        Scanner entrada = new Scanner(System.in);
        DecimalFormat casas = new DecimalFormat("0.00");
        int quantHoras;
        float salarioMin, valorHoras, salarioBruto, imposto, salarioFinal;
        
        // Coletar dados
        System.out.print("Digite o número de horas trabalhadas: ");
        quantHoras = entrada.nextInt();
        System.out.print("digite o valor do salário mínimo: ");
        salarioMin = entrada.nextFloat();
        
        // Operações referentes ao salario final
        valorHoras = salarioMin / 2;
        salarioBruto = quantHoras * valorHoras;
        imposto = salarioBruto * 0.03F;
        salarioFinal = salarioBruto - imposto;
        
        // Exibir dados
        System.out.println("\nValor da hora trabalhada: R$"+casas.format(valorHoras));
        System.out.println("Salário bruto: R$"+casas.format(salarioBruto));
        System.out.println("Imposto de 3% retido: R$"+casas.format(imposto));
        System.out.println("Salário a receber: R$"+casas.format(salarioFinal));

        entrada.close();
    }
    
}
