/**
 * @author kauas - 28/07/2022 quinta
 * Livro: Fundamentos da Programação de Computadores
 * Capítulo 5, Exercício Proposto 11, pág. 147
 */

/*
Faça um programa que receba dez números inteiros e mostre a quantidade de
números primos dentre os números digitados.
*/
package capitulo_5.exercicios_propostos;

import java.util.Scanner;

public class ExercicioProposto12 {
    
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        int num, qtdNum, qtdPrimo, cont;
        
        qtdNum = 10;
        qtdPrimo = 0;
        
        for (int i=1; i<=qtdNum; i++) {
            System.out.print("Digite o "+i+"º número: ");
            num = entrada.nextInt();
            
            cont = 0;
            
            for (int j=1; j<=num; j++) {
                if (num%j == 0) {
                    cont++;
                } 
            }
            
            if (cont == 2) {
                qtdPrimo++;
            }
        }
        
        System.out.println("\nQuantidade de números primos: "+qtdPrimo+"\n");
        
        entrada.close();
    }
}
