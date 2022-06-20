/**
@author kauas - 27/03/2022 Domingo
Livro: Fundamentos da Programação de Computadores
Capítulo 3, Exercício Resolvido 15, pág.44
*/

/*
O custo ao consumidor de um carro novo é a soma do preço de fábrica com o
percentual de lucro do distribuidor e dos impostos aplicados ao preço de
fábrica. Faça um programa que receba o preço de fábrica de um veículo, o
percentual de lucro do distribuidor e o percentual de impostos, calcule e
mostre:
a) O valor correspondente ao lucro do distribuidor;
b) O valor correspondente aos impostos;
c) O preço final do veículo.
*/
package capitulo_3.exercicios_resolvidos;

import java.util.Scanner;
import java.text.DecimalFormat;

public class ExercResolvido15 {

    public static void main(String[] args) {
        // Declaração de variáveis
        Scanner entrada = new Scanner(System.in);
        DecimalFormat casas = new DecimalFormat("0.00");
        float precoFabr, percLucro, percImposto, valorLucro, valorImposto, precoFinal;
        
        // Coletar dados
        System.out.print("Digite o preço de fábrica do veículo: ");
        precoFabr = entrada.nextFloat();
        System.out.print("Digite o percentual de lucro da distribuidora: ");
        percLucro = entrada.nextFloat();
        System.out.print("Digite o percentual de imposto: ");
        percImposto = entrada.nextFloat();
        
        // Operações referentes ao preço final
        valorLucro = precoFabr * (percLucro/100);
        valorImposto = precoFabr * (percImposto/100);
        precoFinal = precoFabr + valorLucro + valorImposto;
        
        // Exibir dados
        System.out.println("\nValor de "+percLucro+"% de lucro do distribuidor: R$"+casas.format(valorLucro));
        System.out.println("Valor de "+percImposto+"% de impostos: R$"+casas.format(valorImposto));
        System.out.println("Preço final do veículo: "+casas.format(precoFinal));

        entrada.close();
    }
    
}
