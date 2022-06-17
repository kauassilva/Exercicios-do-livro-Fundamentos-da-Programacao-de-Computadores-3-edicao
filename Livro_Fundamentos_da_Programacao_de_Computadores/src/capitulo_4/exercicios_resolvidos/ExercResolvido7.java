/**
@author kauas - 14/04/2022 Quinta
Livro: Fundamentos da Programação de Computadores
Capítulo 4, Exercício Resolvido 7, pág.66
*/

/*
Faça um programa que receba quatro valores: I, A, B e C. Desses valores, I é
inteiro e positivo, A, B e C são reais. Escreva os números A, B e C obedecendo à
tabela a seguir.
Suponha que o valor digitado para I seja sempre um valor válido, ou seja, 1, 2
ou 3, e que os números digitados sejam diferentes um do outro.
[imagem, pág. 66]
*/
package capitulo_4.exercicios_resolvidos;

import java.util.Scanner;

public class ExercResolvido7 {
    
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int i;
        float a, b, c;
        
        System.out.println("Digite três números reais diferentes: ");
        a = entrada.nextFloat();
        b = entrada.nextFloat();
        c = entrada.nextFloat();
        System.out.print("Escolha o que deseja fazer:\n[1] - Ordem crescente\n[2] - Ordem decrescente\n[3] - O maior número fica entre os dois números\n<< ");
        i = entrada.nextInt();
        
        if (i == 1) {
            if (a < b && b < c) {
                System.out.println("Ordem crescente: "+a+" - "+b+" - "+c);
            } else if (a < c && c < b) {
                System.out.println("Ordem crescente: "+a+" - "+c+" - "+b);
            } else if (b < a && a < c) {
                System.out.println("Ordem crescente: "+b+" - "+a+" - "+c);
            } else if (b < c && c < a) {
                System.out.println("Ordem crescente: "+b+" - "+c+" - "+a);
            } else if (c < a && c < b) {
                System.out.println("Ordem crescente: "+c+" - "+a+" - "+b);
            } else if (c < b && b < a) {
                System.out.println("Ordem crescente: "+c+" - "+b+" - "+a);
            } else {
                System.out.println("H� pelo menos dois n�meros iguais");
            }
        } else if (i == 2) {
            if (a > b && b > c) {
                System.out.println("Ordem decrescente: "+a+" - "+b+" - "+c);
            } else if (a > c && c > b) {
                System.out.println("Ordem decrescente: "+a+" - "+c+" - "+b);
            } else if (b > a && a > c) {
                System.out.println("Ordem decrescente: "+b+" - "+a+" - "+c);
            } else if (b > c && c > a) {
                System.out.println("Ordem decrescente: "+b+" - "+c+" - "+a);
            } else if (c > a && a > b) {
                System.out.println("Ordem decrescente: "+c+" - "+a+" - "+b);
            } else if (c > b && b > a) {
                System.out.println("Ordem decrescente: "+c+" - "+b+" - "+a);
            } else {
                System.out.println("Há pelo menos dois números iguais");
            }
        } else if (i == 3) {
            if (a > b && a > c) {
                System.out.println(b+" - "+a+" - "+c);
            } else if (b > a && b > c) {
                System.out.println(a+" - "+b+" - "+c);
            } else if (c > a && c > a) {
                System.out.println(a+" - "+c+" - "+b);
            } else {
                System.out.println("Há pelo menos dois números iguais");
            }
        } else {
            System.out.println("Não existe esta opção");
        }

        entrada.close();
    }
}
