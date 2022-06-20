/**
@author kauas - 27/03/2022 Domingo
Livro: Fundamentos da Programação de Computadores
Capítulo 3, Exercício Resolvido 22, pág.48
*/

/*
sabe-se que o quilowatt de energia custa um quinto do salário mínimo. faça um
programa que receba o valor do salário mínimo e a quantidade de quilowatts
consumida por uma residência. calcule e mostre:
a) O valor de cada quilowatt;
b) O valor a ser pago por essa residência;
c) O valor a ser pago com desconto de 15%.
*/
package capitulo_3.exercicios_resolvidos;

import java.util.Scanner;
import java.text.DecimalFormat;

public class ExercResolvido22 {

    public static void main(String[] args) {
        // Declaração de variáveis
        Scanner entrada = new Scanner(System.in);
        DecimalFormat casas = new DecimalFormat("0.00");
        float salario, kw, valorKw, valorPago, desconto, valorDescont;
        
        // Coletar dados
        System.out.print("Digite o salário mínimo: ");
        salario = entrada.nextFloat();
        System.out.print("Digite a quantidade de quilowatts consumida: ");
        kw = entrada.nextFloat();
        
        // Operações referentes ao valor com desconto
        valorKw = salario / 5;
        valorPago = valorKw * kw;
        desconto = valorPago * 0.15F;
        valorDescont = valorPago - desconto;
        
        // Exibir dados
        System.out.println("O valor de cada KW é R$"+casas.format(valorKw));
        System.out.println("O valor a ser pago é R$"+casas.format(valorPago));
        System.out.println("O desconto de 15% é R$"+casas.format(desconto));
        System.out.println("O valor a ser pago com desconto é R$"+valorDescont);

        entrada.close();
    }
    
}
