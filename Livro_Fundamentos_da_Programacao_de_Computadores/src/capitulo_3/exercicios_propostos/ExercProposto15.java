/**
@author kauas - 31/03/2022 Quinta
Livro: Fundamentos da Programação de Computadores
Capítulo 3, Exercício Proposto 15, pág.51
*/

/*
João recebeu seu salário e precisa pagar duas contas atrasadas. Em razão do
atraso, deverá pagar multa de 2% sobre cada conta. Faça um programa que calcule
e mostre quanto restará do salário de João.
*/
package capitulo_3.exercicios_propostos;

import java.util.Scanner;
import java.text.DecimalFormat;

public class ExercProposto15 {
    
    public static void main(String[] args) {
        // Declaração de variáveis
        Scanner entrada = new Scanner(System.in);
        DecimalFormat casas = new DecimalFormat("0.00");
        float salario, conta1, conta2, multa1, multa2;
        
        // Coletar dados
        System.out.print("Digite o seu salário: ");
        salario = entrada.nextFloat();
        System.out.println("Digite o valor das duas contas: ");
        conta1 = entrada.nextFloat();
        conta2 = entrada.nextFloat();
        
        // Cálculos referentes a multas
        multa1 = conta1*0.02F;
        multa2 = conta2*0.02F;
        
        // Exibir dados
        System.out.println("Multa de 2% sobre a primeira conta: R$"+casas.format(multa1));
        System.out.println("Multa de 2% sobre a segunda conta: R$"+casas.format(multa2));
        
        // Cálculos referentes ao salário
        multa1 = conta1 + multa1;
        multa2 = conta2 + multa2;
        salario = salario - (multa1 + multa2);
        
        // Exibir salário
        System.out.println("Conta a pagar com multa de 2% sobre a primeira conta: R$"+casas.format(multa1));
        System.out.println("Conta a pagar com multa de 2% sobre a segunda conta: R$"+casas.format(multa2));
        System.out.println("Saldo atual: R$"+casas.format(salario));

        entrada.close();
    }
}
