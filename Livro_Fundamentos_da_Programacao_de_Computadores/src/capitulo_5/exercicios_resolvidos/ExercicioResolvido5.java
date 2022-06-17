/**
@author kauas - 15/06/2022 quarta
Livro: Fundamentos da Programação de Computadores
Capítulo 5, Exercício Resolvido 5, pág.120
*/

/*
Faça um programa que leia o número de termos e um valor positivo para X. Calcule
e mostre o valor da série a seguir:

[imagem, pág. 120]
*/
package capitulo_5.exercicios_resolvidos;

import java.util.Scanner;

public class ExercicioResolvido5 {
    
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int numTermos, denominador, fim, expoente, den;
        float x, s;
        long fat;
        
        s = 0;
        denominador = 1;
        expoente = 2;
        den = 0;
        
        System.out.print("Digite o número de termos: ");
        numTermos = entrada.nextInt();
        System.out.print("Digite um valor positivo para X: ");
        x = entrada.nextFloat();
        
        for (int i=1; i<=numTermos; i++) {
            fim = denominador;
            fat = 1;
            
            for (int j=1; j<=fim; j++) {
                fat = fat * j;
            }
            
            expoente = i + 1;
            
            if (expoente/2 == 0) {
                s = (float) (s - Math.pow(x,expoente) / fat);
            } else {
                s = (float) (s + Math.pow(x,expoente) / fat);
            }
            
            if (denominador == 4) {
                den = -1;
            }
            
            if (denominador == 1) {
                den = 1;
            }
            
            if (den == 1) {
                denominador = denominador + 1;
            } else {
                denominador = denominador - 1;
            }
        }
        
        System.out.println(s);
    }
}
