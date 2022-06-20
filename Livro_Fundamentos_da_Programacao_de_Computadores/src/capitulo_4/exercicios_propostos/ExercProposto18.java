/**
 * @author kauas - 02/05/2022 segunda
 * Livro: Fundamentos da Programação de Computadores
 * Capítulo 4, Exercício Proposto 18, pág.92
 */

/*
Faça um programa que receba a idade de uma pessoa e mostre a mensagem de
maioridade ou não.
 */
package capitulo_4.exercicios_propostos;

import java.util.Scanner;

public class ExercProposto18 {

    public static void main(String[] args) {
        // Declaração de variáveis
        Scanner entrada = new Scanner(System.in);
        int idade;

        // Coletar dado
        System.out.print("\nDigite a sua idade: ");
        idade = entrada.nextInt();

        // Desvio condicional referente a dado inválido
        if (idade >= 0) {
            // Desvio condicional referente a idade
            if (idade >= 18) {
                System.out.println("Você já atingiu a maioridade");
            } else {
                System.out.println("Você ainda não atingiu a maioridade");
            }
        } else {
            System.out.println("Idade, inválida!");
        }

        entrada.close();
    }
}
