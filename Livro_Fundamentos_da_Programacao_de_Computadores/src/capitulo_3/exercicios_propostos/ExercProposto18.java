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

public class ExercProposto18 {
    
    public static void main(String[] args) {
        // Declaração de variáveis
        Scanner entrada = new Scanner(System.in);
        float tempCel, tempFah;
        
        // Coletar dado
        System.out.print("Digite uma temperatura em Celsius: ");
        tempCel = entrada.nextFloat();
        
        // Operação de conversão de temperatura
        tempFah = tempCel * 1.8F + 32;
        
        // Exibir dados
        System.out.println(tempCel+"°C = "+tempFah+"°F");

        entrada.close();
    }
}
