/**
@author kauas - 28/03/2022 Segunda
Livro: Fundamentos da Programação de Computadores
Capítulo 3, Exercício Proposto 5, pág.50
*/

/*
Faça um programa que receba o preço de um produto, calcule e mostre o novo
preço, sabendo-se que este sofreu um desconto de 10%.
*/
package capitulo_3.exercicios_propostos;

import java.util.Scanner;
import java.text.DecimalFormat;

public class ExercProposto5 {

    public static void main(String[] args) {
        //Declaração de variáveis
        Scanner entrada = new Scanner(System.in);
        DecimalFormat casas = new DecimalFormat("0.00");
        float preco, desco, precoNovo;
        
        // Coletar dado
        System.out.print("Digite o preço do produto: ");
        preco = entrada.nextFloat();
        
        // Cálculos para o desconto e preço
        desco = preco * 0.1F;
        precoNovo = preco - desco;
        
        // Exibir dados
        System.out.println("Desconto de 10%: R$"+casas.format(desco));
        System.out.println("Preço novo com desconto: R$"+casas.format(precoNovo));

        entrada.close();
    }
    
}
