/**
@author kauas - 31/03/2022 Quinta
Livro: Fundamentos da Programação de Computadores
Capítulo 3, Exercício Proposto 7, pág.50
*/

/*
Faça um programa que receba o peso de uma pessoa, calcule e mostre:
a) O novo peso, se a pessoa engordar 15% sobre o peso digitado;
b) O novo peso, se a pessoa emagrecer 20% sobre o peso digitado;
*/
package capitulo_3.exercicios_propostos;

import java.util.Scanner;
import java.text.DecimalFormat;

public class ExercProposto7 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        DecimalFormat casas = new DecimalFormat("0.00");
        float peso, peso15, peso20;
        
        System.out.print("Digite o seu peso: ");
        peso = entrada.nextFloat();
        
        peso15 = peso + (peso*0.15F);
        peso20 = peso - (peso*0.2F);
        
        System.out.println("Seu peso, se engordar 15%: "+casas.format(peso15)+"Kg");
        System.out.println("Seu peso, se emagrecer 20%: "+casas.format(peso20)+"Kg");

        entrada.close();
    }
}
