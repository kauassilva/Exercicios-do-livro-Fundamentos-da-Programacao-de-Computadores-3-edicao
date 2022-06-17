/**
@author kauas - 15/06/2022 quarta
Livro: Fundamentos da Programação de Computadores
Capítulo 5, Exercício Resolvido 3, pág.118
*/

/*
Faça um programa que leia um número N que indica quantos valores inteiros e
positivos devem ser lidos a seguir. Para cada número lido, mostre uma tabela
contendo o valor lido e o fatorial desse valor.
*/
package capitulo_5.exercicios_resolvidos;

import java.util.Scanner;

public class ExercicioResolvido3 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int n, num;
        long fat;
        
        System.out.print("Digite a quantidade de números inteiros positivos que devem ser lidos: ");
        n = entrada.nextInt();
        
        for (int i=1; i<=n; i++) {
            System.out.print("Digite o número: ");
            num = entrada.nextInt();
            fat = 1;
            
            for (int j=1; j<=num; j++) {
                fat = fat * j;
            }
            
            System.out.println("Número: "+num+" | Fatorial: "+fat);
        }
    }
    
}
