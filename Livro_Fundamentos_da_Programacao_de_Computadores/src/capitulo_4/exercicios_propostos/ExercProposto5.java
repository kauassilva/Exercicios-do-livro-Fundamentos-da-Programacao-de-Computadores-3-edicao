/**
 * @author kauas - 23/04/2022 sábado
 * Livro: Fundamentos da Programação de Computadores
 * Capítulo 4, Exercício Proposto 5, pág.90
 */

/*
Faça um programa que receba dois números e execute as operações listadas a
seguir, de acordo com a escolha do usuário.
[imagem, pág. 90]

Se a opção digitada for inválida, mostre uma mensagem de erro e termine a
execução do programa. Lembre-se de que, na operação 4, o segundo número deve ser
diferente de zero.
 */
package capitulo_4.exercicios_propostos;

import java.util.Scanner;

public class ExercProposto5 {

    public static void main(String[] args) {
        // Declaração de variáveis
        Scanner entrada = new Scanner(System.in);
        float num1, num2, operacao;
        int opcao;

        // Coletar dados
        System.out.println("\nDigite dois números:");
        num1 = entrada.nextFloat();
        num2 = entrada.nextFloat();
        System.out.print("Escolha que operação deseja fazer:\n[1] - Média entre os números digitados\n[2] - Diferença do maior pelo menor\n[3] - Produto entre  os números digitados\n[4] - Divisão do primeiro pelo segundo\n<< ");
        opcao = entrada.nextInt();

        // Desvio condicional referente as operações
        switch (opcao) {
            case 1 -> {
                operacao = (num1 + num2) / 2;
                System.out.println("\n(" + num1 + " + " + num2 + ") / 2 = " + operacao + "\n");
            }

            case 2 -> {
                if (num1 != num2) {
                    if (num1 > num2) {
                        operacao = num1 - num2;
                        System.out.println("\n" + num1 + " - " + num2 + " = " + operacao + "\n");
                    } else {
                        operacao = num2 - num1;
                        System.out.println("\n" + num2 + " - " + num1 + " = " + operacao + "\n");
                    }
                } else {
                    System.out.println("\nOs números são iguais. O resultado é 0\n");
                }
            }

            case 3 -> {
                operacao = num1 * num2;
                System.out.println("\n" + num1 + " x " + num2 + " = " + operacao + "\n");
            }

            case 4 -> {
                if (num2 != 0) {
                    operacao = num1 / num2;
                    System.out.println("\n" + num1 + " / " + num2 + " = " + operacao + "\n");
                } else {
                    System.out.println("\nNão existe divisão com divisor 0\n");
                }
            }

            default ->
                System.out.println("\nOpção inválida\n");

        }

        entrada.close();
    }
}
