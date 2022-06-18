/**
@author kauas - 17/06/2022 sexta
Livro: Fundamentos da Programação de Computadores
Capítulo 5, Exercício Resolvido 11, pág.127
*/

/*
Faça um programa que receba um número inteiro maior que 1, verifique se o número
fornecido é primo ou não e mostre uma mensagem de número primo ou de número não
primo.
Um número é primo quando é divisível apenas por 1 e por ele mesmo.
*/
package capitulo_5.exercicios_resolvidos;

import java.util.Scanner;

public class ExercicioResolvido11 {
 
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int num, resto, cont=0;
        
        System.out.println("\nDescubra se um número é primo ou não!");
        System.out.print("\nDigite um número inteiro maior que 1: ");
        num = entrada.nextInt();
        
        for (int i=1; i<=num; i++) {
            resto = num % i;
            if (resto == 0) {
                cont++;
            }
        }
        
        if (cont == 2) {
            System.out.println("O número "+num+" é primo!");
        } else {
            System.out.println("o número "+num+" não é primo!");
        }
    }
}
