/**
 * @author kauas - 23/04/2022 sábado
 * Livro: Fundamentos da Programação de Computadores
 * Capítulo 4, Exercício Proposto 6, pág.90
 */

/*
Faça um programa que receba dois números e execute uma das operações listadas a
seguir, de acordo com a escolha do usuário. Se for digitada uma opção inválida,
mostre mensagem de erro e termine a execução do programa. As opções são:
a) O primeiro número elevado ao segundo número.
b) Raiz quadrada de cada um dos números.
c) Raiz cúbica de cada um dos números.
 */
package capitulo_4.exercicios_propostos;

import java.util.Scanner;

public class ExercProposto6 {

    public static void main(String[] args) {
        // Declaração de variáveis
        Scanner entrada = new Scanner(System.in);
        float num1, num2, operacao;
        char opcao;

        // Coletar dados
        System.out.print("\nDigite o que deseja fazer?\n[a] - O primeiro número elevado ao segundo número\n[b] - Raiz quadrada de cada um dos números\n[c] - raiz cúbica de cada um dos números\n<< ");
        opcao = entrada.nextLine().charAt(0);
        System.out.println("Digite dois números:");
        num1 = entrada.nextFloat();
        num2 = entrada.nextFloat();

        // Desvio condicional referente as operações
        switch (Character.toLowerCase(opcao)) {
            case 'a':
                operacao = (float) Math.pow(num1, num2);
                System.out.println("\nPotenciação: " + operacao + "\n");
                break;

            case 'b':
                operacao = (float) Math.sqrt(num1);
                System.out.println("\nRaiz quadradada de " + num1 + ": " + operacao + "\n");
                operacao = (float) Math.sqrt(num2);
                System.out.println("\nRaiz quadradada de " + num2 + ": " + operacao + "\n");
                break;

            case 'c':
                operacao = (float) Math.cbrt(num1);
                System.out.println("\nRaiz cúbica de " + num1 + ": " + operacao + "\n");
                operacao = (float) Math.cbrt(num2);
                System.out.println("\nRaiz cúbica de " + num2 + ": " + operacao + "\n");
                break;

            default:
                System.out.println("\nOpção inválida\n");
        }

        entrada.close();
    }
}
