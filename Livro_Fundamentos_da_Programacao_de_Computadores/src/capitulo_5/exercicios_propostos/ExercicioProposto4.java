/**
 * @author kauas - 25/07/2022 segunda
 * Livro: Fundamentos da Programação de Computadores
 * Capítulo 5, Exercício Proposto 4, pág. 147
 */

/*
Faça um programa que receba um número, calcule e mostre a tabuada desse número.

Exemplos:

Digite um número: 5
5 x 0 = 0
5 x 1 = 5
5 x 2 = 10
5 x 3 = 15
5 x 4 = 20
5 x 5 = 25
5 x 6 = 30
5 x 7 = 35
5 x 8 = 40
5 x 9 = 45
5 x 10 = 50
*/
package capitulo_5.exercicios_propostos;

import java.text.NumberFormat;
import java.util.Scanner;

public class ExercicioProposto4 {
    
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        NumberFormat fmtNumero = NumberFormat.getNumberInstance();
        
        float num, resultado;
        
        System.out.println("=== CALCULAR TABUADA ===");
        System.out.print("\nDigite um número: ");
        num = entrada.nextInt();
        
        System.out.println("");
        
        // Estrutura de repetição referente a quantidade de multiplicações da tabuada
        for (int i=0; i<=10; i++) {
            resultado = num * i;
            System.out.println(fmtNumero.format(num)+" x "+i+" = "+fmtNumero.format(resultado));
        }
        
        System.out.println("");
        
        entrada.close();
    }
}
