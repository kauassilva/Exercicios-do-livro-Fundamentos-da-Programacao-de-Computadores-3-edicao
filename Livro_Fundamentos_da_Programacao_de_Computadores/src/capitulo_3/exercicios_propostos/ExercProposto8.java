/**
@author kauas - 31/03/2022 Quinta
Livro: Fundamentos da Programação de Computadores
Capítulo 3, Exercício Proposto 8, pág.51
*/

/*
Faça um programa que receba o peso de uma pessoa em quilos, calcule e mostre
esse peso em gramas.
*/
package capitulo_3.exercicios_propostos;

import java.util.Scanner;
import java.text.DecimalFormat;

public class ExercProposto8 {
    
    public static void main(String []args) {
        Scanner entrada = new Scanner(System.in);
        DecimalFormat casas = new DecimalFormat("0");
        float pesoQ, pesoG;
        
        System.out.print("Digite seu peso em quilos: ");
        pesoQ = entrada.nextFloat();
        
        pesoG = pesoQ * 1000;
        
        System.out.println(pesoQ+"Kg em gramas: "+casas.format(pesoG));

        entrada.close();
    }
}
