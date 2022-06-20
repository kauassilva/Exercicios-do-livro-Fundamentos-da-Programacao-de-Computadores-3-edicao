/**
@author kauas - 27/03/2022 Domingo
Livro: Fundamentos da Programação de Computadores
Capítulo 3, Exercício Resolvido 8, pág.40
*/

/*
Faça um programa que receba o valor de um depósito e o valor da taxa de juros,
calcule e mostre o valor do rendimento e o valor total depois do rendimento.
*/
package capitulo_3.exercicios_resolvidos;

import java.util.Scanner;
import java.text.DecimalFormat;

public class ExercResolvido8 {

    public static void main(String[] args) {
        // Declaração de variáveis
        Scanner entrada = new Scanner(System.in);
        DecimalFormat casas = new DecimalFormat("0.00");
        float deposito, taxa, rendimento, total;
        
        // Coletar dados
        System.out.print("Informe o valor do depósito: ");
        deposito = entrada.nextFloat();
        System.out.print("Informe a taxa de juros: ");
        taxa = entrada.nextFloat();
        
        // Operações referentes ao saldo final
        rendimento = deposito * (taxa/100);
        total = deposito + rendimento;
        
        // Exibir dados
        System.out.println("\nValor do depósito: R$"+casas.format(deposito));
        System.out.println("Taxa de "+taxa+"% do depósito: R$"+casas.format(rendimento));
        System.out.println("Saldo final: R$"+casas.format(total));

        entrada.close();
    }
    
}
