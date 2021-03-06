/**
@author kauas - 14/04/2022 Quinta
Livro: Fundamentos da Programação de Computadores
Capítulo 4, Exercício Resolvido 6, pág.65
*/

/*
Faça um programa que recab um número inteiro e verifique se é par ou ímpar
*/
package capitulo_4.exercicios_resolvidos;

import java.util.Scanner;

public class ExercResolvido6 {
    
    public static void main(String[] args) {
        // Declaração de variáveis
        Scanner entrada = new Scanner(System.in);
        int num, parImpar;
        
        // Coletar dado
        System.out.print("Digite um número inteiro: ");
        num = entrada.nextInt();
        
        // Operação referente a número ímpar ou par
        parImpar = num % 2;
        
        // Desvio condicional para exibir o número ímpar ou par
        if (parImpar == 0) {
            System.out.println("\n"+num+" é par");
        } else {
            System.out.println("\n"+num+" é ímpar");
        }

        entrada.close();
    }
}
