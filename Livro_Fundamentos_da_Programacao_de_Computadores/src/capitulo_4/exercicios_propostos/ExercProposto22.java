/**
 * @author kauas - 02/05/2022 segunda
 * Livro: Fundamentos da Programação de Computadores
 * Capítulo 4, Exercício Proposto 22, pág.93
 */

/*
Faça um programa que receba a idade e o peso de uma pessoa. De acordo com a
tabela a seguir, verifique e mostre em qual grupo de risco essa pessoa se
encaixa.
[imagem, pág. 93]
 */
package capitulo_4.exercicios_propostos;

import java.util.Scanner;

public class ExercProposto22 {

    public static void main(String[] args) {
        // Declaração de variáveis
        Scanner entrada = new Scanner(System.in);
        int idade;
        float peso;
        String grupo;

        // Coletar dado
        System.out.print("\nDigite sua idade: ");
        idade = entrada.nextInt();

        // Desvio condicional referente a dado inválido
        if (idade >= 0) {
            // Coletar dado
            System.out.print("Digite seu peso: ");
            peso = entrada.nextFloat();

            // Desvio condicional referente a idade
            if (peso > 0) {
                // Desvio condicional referente ao peso
                if (idade < 20) {
                    // Desvio condicional referente ao grupo
                    if (peso <= 60) {
                        grupo = "9";
                    } else if (peso > 60 && peso <= 90) {
                        grupo = "8";
                    } else {
                        grupo = "7";
                    }
                } else if (idade >= 20 && idade <= 50) {
                    if (peso <= 60) {
                        grupo = "6";
                    } else if (peso > 60 && peso <= 90) {
                        grupo = "5";
                    } else {
                        grupo = "4";
                    }
                } else {
                    if (peso <= 60) {
                        grupo = "3";
                    } else if (peso > 60 && peso <= 90) {
                        grupo = "2";
                    } else {
                        grupo = "1";
                    }
                }

                // Exibir dado
                System.out.println("\nSeu grupo de risco é " + grupo + "\n");
            } else {
                System.out.println("\nPeso, inválido!\n");
            }

        } else {
            System.out.println("\nIdade, inválida!\n");
        }

        entrada.close();
    }
}
