/**
@author kauas - 31/03/2022 Quinta
Livro: Fundamentos da Programação de Computadores
Capítulo 3, Exercício Proposto 13, pág.51
*/

/*
Faça um programa que calcule e mostre a tabuada de um número digitado pelo
usuário.
Exemplo:
Digite um número: 5
5 X 0 = 0
5 X 1 = 5
...
5 X 10 = 50
*/
package capitulo_3.exercicios_propostos;

import java.util.Scanner;

public class ExercProposto13 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        float num;
        
        System.out.println("Digite um número: ");
        num = entrada.nextFloat();
        
        System.out.println("5 X 0 = "+num*0);
        System.out.println("5 X 1 = "+num*1);
        System.out.println("5 X 2 = "+num*2);
        System.out.println("5 X 3 = "+num*3);
        System.out.println("5 X 4 = "+num*4);
        System.out.println("5 X 5 = "+num*5);
        System.out.println("5 X 6 = "+num*6);
        System.out.println("5 X 7 = "+num*7);
        System.out.println("5 X 8 = "+num*8);
        System.out.println("5 X 9 = "+num*9);
        System.out.println("5 X 10 = "+num*10);

        entrada.close();
    }
}
