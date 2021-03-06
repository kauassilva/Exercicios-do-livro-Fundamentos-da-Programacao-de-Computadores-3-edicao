/**
@author kauas - 10/05/2022 terça
Livro: Fundamentos da Programação de Computadores
Capítulo 5, Exercício Resolvido 2, pág.118
*/

/*
Faça um programa que leia um valor N inteiro e positivo. Calcule e mostre o
valor de E, conforme a fórmula a seguir:

E = 1 + 1/1! + 1/2! + 1/3! + ... + 1/N!
*/
package capitulo_5.exercicios_resolvidos;

import java.util.Scanner;

public class ExercicioResolvido2 {
    
    public static void main(String[] args) {
        // Declaração de variáveis
        Scanner entrada = new Scanner(System.in);
        int n;
        long fat;
        float e;
        
        // Coletar dado
        System.out.println("\nConforme a fórmula: E = 1 + 1/1! + 1/2! + 1/3! + ... + 1/N!");
        System.out.print("Digite um valor para N: ");
        n = entrada.nextInt();
        
        // inicialização de variável
        e = 1;
        
        // Laço de repetição referente a fórmula
        for (int i=1; i<=n; i++) {
            fat = 1;
           
            // Laço de repetição referente ao número fatorial
            for (int j=1; j<=i; j++) {
                fat = fat * j;
            }
            
            // operação referente a fórmula
            e = e + 1/fat;
        }
        
        // Exibir dado
        System.out.println("\nConforme a fórmula, o valor de E é "+e+"\n");
        
        entrada.close();
    }
}
