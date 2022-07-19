/**
 * @author kauas - 28/06/2022 Terça
 * Livro: Fundamentos da Programação de Computadores
 * Capítulo 5, Exercício Resolvido 19, pág. 136
 */

/*
Faça um programa que leia um número não determinado de pares de valores [m,n],
todos inteiros e positivos, um par de cada vez, e que calcule e mostre a soma de
todos os números inteiros entre m e n (inclusive). A digitação de pares
terminará quando m for maior ou igual a n.
*/
package capitulo_5.exercicios_resolvidos;

import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

public class ExercicioResolvido19 {
    
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        Locale localBR = new Locale("pt","BR");
        
        NumberFormat fmtNumero = NumberFormat.getNumberInstance(localBR);
        
        int numM, numN, soma;
        
        System.out.println("Iremos calcular a soma de dois números (M + N), até que M seja maior ou igual a N");
        
        // Estrutura de repetição referente a repetição das operações
        do {
            System.out.print("\nDigite um valor para o M: ");
            numM = entrada.nextInt();
            System.out.print("Digite um valor para o N: ");
            numN = entrada.nextInt();
            
            soma = numM + numN;
            
            System.out.println("\nSoma: "+fmtNumero.format(soma));
            
        } while (numM < numN);
        
        System.out.println("");
        
        entrada.close();
    }
}
