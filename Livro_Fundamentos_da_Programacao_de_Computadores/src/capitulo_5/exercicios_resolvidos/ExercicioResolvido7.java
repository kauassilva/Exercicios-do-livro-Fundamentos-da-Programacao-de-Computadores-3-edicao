/**
@author kauas - 16/06/2022 quinta
Livro: Fundamentos da Programação de Computadores
Capítulo 5, Exercício Resolvido 7, pág.123
*/

/*
Faça um programa que mostre os oito primeiros termos da sequência de Fibonacci.
0 - 1 - 1 - 2 - 3 - 5 - 8 - 13 - 21 - 34 - 55...
*/
package capitulo_5.exercicios_resolvidos;

public class ExercicioResolvido7 {
    
    public static void main(String[] args) {
        // Declaração de variáveis
        int num1=0, num2=1, soma;
        
        System.out.print(num1+" - "+num2);
        
        // Laço de repetição baseado na quantidade de termos
        for (int i=3; i<=8; i++) {
            soma = num1 + num2;
            num1 = num2;
            num2 = soma;
            
            // Exibir dados
            System.out.print(" - "+soma);
        }
        
        System.out.println("");
    }
}
