/**
@author kauas - 27/03/2022 Domingo
Livro: Fundamentos da Programação de Computadores
Capítulo 3, Exercício Resolvido 25, pág.50
*/

/*
Faça um programa que receba o custo de um espetáculo teatral e o preço do
convite desse espetáculo. Esse programa deverá calcular e mostrar a quantidade
de convites que devem ser vendidos para que pelo menos, o custo do espetáculo
seja alcançado.
*/
package capitulo_3.exercicios_resolvidos;

import java.util.Scanner;

public class ExercResolvido25 {

    public static void main(String[] args) {
        // Declaração de variáveis
        Scanner entrada = new Scanner(System.in);
        float custo, precoConv;
        int quantConv;
        
        // Coletar dados
        System.out.print("Digite o custo do espetáculo: ");
        custo = entrada.nextFloat();
        System.out.print("digite o preço do convite: ");
        precoConv = entrada.nextFloat();
        
        // Operação referente a quantidade de convites
        quantConv = (int) (Math.ceil(custo / precoConv));
        
        // Exibir dado
        System.out.println("\nO espetáculo precisa vender pelo menos "+quantConv+" convites para ter lucro");

        entrada.close();
    }
    
}
