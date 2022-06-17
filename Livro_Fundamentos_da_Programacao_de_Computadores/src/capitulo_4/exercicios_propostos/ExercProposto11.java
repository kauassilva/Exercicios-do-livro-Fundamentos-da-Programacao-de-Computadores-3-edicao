/**
@author kauas - 23/04/2022 sábado
Livro: Fundamentos da Programação de Computadores
Capítulo 4, Exercício Proposto 11, pág.91
*/

/*
Faça um programa que receba o salário atual de um funcionário e, usando a tabela
a seguir, calcule e mostre o valor do aumento e o novo salário.
[imagem, pág. 91]
*/
package capitulo_4.exercicios_propostos;

import java.text.DecimalFormat;
import java.util.Scanner;

public class ExercProposto11 {
    
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        DecimalFormat casas = new DecimalFormat("0.00");
        float salAtual, aumento, salNovo;
        int porcentagem;
        
        System.out.print("Digite o salário atual: ");
        salAtual = entrada.nextFloat();
        
        if (salAtual > 0) {
            if (salAtual <= 300) {
                porcentagem = 15;
            } else if (salAtual>300 && salAtual<600) {
                porcentagem = 10;
            } else if (salAtual>=600 && salAtual<=900) {
                porcentagem = 5;
            } else {
                porcentagem = 0;
            }
            
            aumento = (salAtual*porcentagem) / 100;
            salNovo = salAtual + aumento;
            
            System.out.println("\nAumento de "+porcentagem+"%: R$ "+casas.format(aumento));
            System.out.println("Salário novo:  R$ "+casas.format(salNovo));
        } else {
            System.out.println("\nSalário atual, inválido!");
        }
        
        entrada.close();
    }
}
