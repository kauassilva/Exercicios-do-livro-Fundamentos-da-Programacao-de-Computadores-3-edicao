/**
@author kauas - 23/04/2022 sábado
Livro: Fundamentos da Programação de Computadores
Capítulo 4, Exercício Proposto 10, pág.91
*/

/*
O preço do consumidor de um carro novo é a soma do custo de fábrica com a
porcentagem do distribuidor e dos impostos, ambos aplicados ao custo de fábrica.
As porcentagens encontram-se na tabela a seguir. Faça um programa que receba o
custo de fábrica de um carro e mostre o preço ao consumidor.
*/
package capitulo_4.exercicios_propostos;

import java.text.DecimalFormat;
import java.util.Scanner;

public class ExercProposto10 {
    
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        DecimalFormat casas = new DecimalFormat("0.00");
        float custoFabrica, imposto, distribuidor, preco;
        int pctImposto, pctDistribuidor;
        
        System.out.print("Digite o custo de fábrica do veículo: ");
        custoFabrica = entrada.nextFloat();
        
        if (custoFabrica > 0) {
            if (custoFabrica < 12000) {
                pctDistribuidor = 5;
                pctImposto = 0;
            } else if (custoFabrica>=12000 && custoFabrica<=25000) {
                pctDistribuidor = 10;
                pctImposto = 15;
            } else {
                pctDistribuidor = 15;
                pctImposto = 20;   
            }
            
            distribuidor = (custoFabrica*pctDistribuidor) / 100;
            imposto = (custoFabrica*pctImposto) / 100;
            preco = custoFabrica + distribuidor + imposto;
            
            System.out.println("\nDistribuidor ("+pctDistribuidor+"%): R$ "+casas.format(distribuidor));
            System.out.println("IMposto ("+pctImposto+"%): R$ "+casas.format(imposto));
            System.out.println("Preço do veículo: R$ "+casas.format(preco));
        } else {
            System.out.println("\nCusto de fábrica, inválido!");
        }
        
        entrada.close();
    }
}
