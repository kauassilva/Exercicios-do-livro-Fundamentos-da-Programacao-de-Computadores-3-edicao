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
        // Declaração de variáveis
        Scanner entrada = new Scanner(System.in);
        int n, num;
        long fat;
        
        // Coletar dado
        System.out.print("Digite a quantidade de números inteiros positivos que devem ser lidos: ");
        n = entrada.nextInt();
        
        // Laço de repetição referente a quantidade de números a serem lidos
        for (int i=1; i<=n; i++) {
            // Coletar dado
            System.out.print("Digite o número: ");
            num = entrada.nextInt();
            
            // Inicializar variável;
            fat = 1;
            
            // Laço de repetição referente ao número fatorial
            for (int j=1; j<=num; j++) {
                fat = fat * j;
            }
            
            // Exibir dados
            System.out.println("Número: "+num+" | Fatorial: "+fat);
            
            entrada.close();
        }
    }
    
}
