/**
@author kauas - 16/06/2022 quinta
Livro: Fundamentos da Programação de Computadores
Capítulo 5, Exercício Resolvido 7, pág.123
*/

/*
Faça um programa que leia o número de termos, determine e mostre os valores de
acordo com a série a seguir:

Série: 2, 7, 3, 4, 21, 12, 8, 63, 48, 16, 189, 192, 32, 567, 768...
*/
package capitulo_5.exercicios_resolvidos;

import java.util.Scanner;

public class ExercicioResolvido8 {
    
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int num1, num2, num3, i, numTermo;
        
        num1 = 2;
        num2 = 7;
        num3 = 3;
        i = 4;
                
        System.out.print("Digite quantos termos a série deve ter: ");
        numTermo = entrada.nextInt();
        
        System.out.print(num1+" - "+num2+" - "+num3);
        
        while (i <= numTermo) {
            num1 = num1 * 2;
            System.out.print(" - "+num1);
            i++;
            
            if (i <= numTermo) {
                num2 = num2 * 3;
                System.out.print(" - "+num2);
                i++;
                
                if (i <= numTermo) {
                    num3 = num3 * 4;
                    System.out.print(" - "+num3);
                    i++;
                }
            }
        }
        System.out.println("");
    }
}
