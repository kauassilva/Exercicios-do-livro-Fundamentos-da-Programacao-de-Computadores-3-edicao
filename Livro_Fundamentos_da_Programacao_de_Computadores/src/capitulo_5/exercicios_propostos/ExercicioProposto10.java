/**
 * @author kauas - 26/07/2022 terça
 * Livro: Fundamentos da Programação de Computadores
 * Capítulo 5, Exercício Proposto 10, pág. 147
 */

/*
Faça um programa que receba dez números, calcule e mostre a soma dos números
pares e a soma dos números primos.
*/
package capitulo_5.exercicios_propostos;

import java.util.Scanner;

public class ExercicioProposto10 {
    
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        int qtdNumero, num, somaPar, somaPrimo, cont;
        
        qtdNumero = 10;
        somaPar = 0;
        somaPrimo = 0;
        
        // Estrutura de repetição baseado na quantidade de números
        for (int i=1; i<=qtdNumero; i++) {
            cont = 0;
            
            System.out.print("Digite o "+i+"º número: ");
            num = entrada.nextInt();   
            
            // Estrutura de repetição referente ao valor do contador para identificação de número primo
            for (int j=1; j<=num; j++) {
                if (num%j == 0) {
                    cont++;
                }
            }

            if (cont == 2) {
                somaPrimo = somaPrimo + num;
            }
            
            if (num%2 == 0) {
                somaPar = somaPar + num;
            }    
        }
        
        System.out.println("\nSoma dos números pares: "+somaPar);
        System.out.println("Soma dos números primos: "+somaPrimo+"\n");
        
        entrada.close();
    }
}
