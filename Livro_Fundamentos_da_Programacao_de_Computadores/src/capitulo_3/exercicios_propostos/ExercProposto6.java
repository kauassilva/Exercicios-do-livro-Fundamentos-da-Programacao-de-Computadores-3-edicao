/**
@author kauas - 28/03/2022 Segunda
Livro: Fundamentos da Programação de Computadores
Capítulo 3, Exercício Proposto 6, pág.50
*/

/*
Um funcionário recebe um salário fixo mais 4% de comissão sobre as vendas. Faça
um programa que receba o salário fixo do funcionário e o valor de suas vendas,
calcule e mostre a comissão e seu salário final.
*/
package capitulo_3.exercicios_propostos;

import java.util.Scanner;
import java.text.DecimalFormat;

public class ExercProposto6 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        DecimalFormat casas = new DecimalFormat("0.00");
        float salario, valVendas, comissao, salarioFi;
        
        System.out.print("Digite o salário fixo do funcionário: ");
        salario = entrada.nextFloat();
        System.out.print("Digite o valor das vendas: ");
        valVendas = entrada.nextFloat();
        
        comissao = valVendas * 0.04F;
        salarioFi = salario + comissao;
        
        System.out.println("\ncomissão de 4%: R$"+casas.format(comissao));
        System.out.println("Salário com comissão: R$"+casas.format(salarioFi));

        entrada.close();
    }
    
}
