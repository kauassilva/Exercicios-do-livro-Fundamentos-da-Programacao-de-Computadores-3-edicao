/* 
@author kauas - 31/03/2022 Quinta
Livro: Fundamentos da Programação de Computadores
Capítulo 3, Exercício Proposto 18, pág.51
*/

/*
Faça um programa que receba uma temperatura em Celsius, calcule e mostre essa
temperatura em Fahrenheit. Sabe-se que F = C * 1.8 + 32.
*/
package capitulo_3.exercicios_propostos;

import java.util.Scanner;
import java.text.DecimalFormat;

public class ExercProposto18 {
    
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        DecimalFormat casas = new DecimalFormat("0.00");
        float tempCel, tempFah;
        
        System.out.print("Digite uma temperatura em Celsius: ");
        tempCel = entrada.nextFloat();
        
        tempFah = tempCel * 1.8F + 32;
        
        System.out.println(tempCel+"°C = "+casas.format(tempFah)+"°F");

        entrada.close();
    }
}
