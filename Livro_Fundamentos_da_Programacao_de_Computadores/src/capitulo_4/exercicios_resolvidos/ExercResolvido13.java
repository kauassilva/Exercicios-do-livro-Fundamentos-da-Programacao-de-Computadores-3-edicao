/**
 * @author kauas - 16/04/2022 Quinta
 * Livro: Fundamentos da Programação de Computadores
 * Capítulo 4, Exercício Resolvido 13, pág.74
 */

/*
Faça um programa que apresente o menu a seguir, permita ao usuário escolher a
opção desejada, receba os dados necessários para executar a operação e mostre o
resultado. Verifique a possibilidade de opção inválida e não se preocupe com
restrições, como salário negativo.

Menu de opções:
1. Imposto
2. Novo salário
3. Classificação
Digite a opção desejada.

Na opção 1: Receber o salário de um funcionário, calcular e mostrar o valor do
imposto usando as regras a seguir.
[imagem, pág. 74]

Na opção 2: Receber o salário de um funcionário, calcular e mostrar o valor do
novo salário, usando as regras a seguir.
[imagem, pág. 74]

Na opção 3: Receber o salário de um funcionário e mostrar sua classificação
usando a tabela a seguir.
[imagem, pág. 74]
 */
package capitulo_4.exercicios_resolvidos;

import java.text.DecimalFormat;
import java.util.Scanner;

public class ExercResolvido13 {

    public static void main(String[] args) {
        // Declaração de variáveis
        Scanner entrada = new Scanner(System.in);
        DecimalFormat casas = new DecimalFormat("0.00");
        int opcao, porcentagem = 0;
        float salAtual, imposto = 0, salNovo = 0;

        // Coletar dado
        System.out.print("----- MENU -----\n[1] - Imposto\n[2] - Novo salário\n[3] - Classificação\n<< ");
        opcao = entrada.nextInt();

        // Desvio condicional referente a opção
        switch (opcao) {
            case 1 -> {
                // Coleta de dado
                System.out.print("\nDigite o salário: ");
                salAtual = entrada.nextFloat();

                // Desvio condicional referente a dado inválido
                if (salAtual <= 0) {
                    System.out.println("Salário inválido");
                } else {
                    // Desvio condicional referente ao salário novo
                    if (salAtual > 0 && salAtual < 500) {
                        porcentagem = 5;
                        imposto = (salAtual * porcentagem) / 100;
                        salNovo = salAtual - imposto;
                    } else if (salAtual >= 500 && salAtual <= 850) {
                        porcentagem = 10;
                        imposto = (salAtual * porcentagem) / 100;
                        salNovo = salAtual - imposto;
                    } else if (salAtual > 850) {
                        porcentagem = 15;
                        imposto = (salAtual * porcentagem) / 100;
                        salNovo = salAtual - imposto;
                    }

                    // Exibir dados
                    System.out.println("\nImposto (" + porcentagem + "%): R$" + casas.format(imposto));
                    System.out.println("Salário descontado: R$" + casas.format(salNovo));
                }
            }
            case 2 -> {
                // Coletar dado
                System.out.print("\nDigite o salário: ");
                salAtual = entrada.nextFloat();

                // Desvio condicional referente a dado inválido
                if (salAtual <= 0) {
                    System.out.println("Salário inválido");
                } else {
                    // Desvio condicional referente ao salário novo
                    if (salAtual > 1500) {
                        salNovo = salAtual + 25;
                        
                        System.out.println("\nAumento (R$ 25,00)");
                    } else if (salAtual >= 750 && salAtual <= 1500) {
                        salNovo = salAtual + 50;
                        
                        System.out.println("\nAumento (R$ 50,00)");
                    } else if (salAtual >= 450 && salAtual < 750) {
                        salNovo = salAtual + 75;
                        
                        System.out.println("\nAumento (R$ 75,00)");
                    } else {
                        salNovo = salAtual + 100;
                        
                        System.out.println("\nAumento (R$ 100,00)");
                    }

                    // Exibir dado
                    System.out.println("Salário novo: R$" + casas.format(salNovo));
                }
            }
            case 3 -> {
                // Coletar dado
                System.out.print("\nDigite o salário: ");
                salAtual = entrada.nextFloat();

                // Desvio condicional referente a classificação
                if (salAtual > 0 && salAtual <= 700) {
                    System.out.println("Classificação: Mal remunerado");
                } else if (salAtual > 700) {
                    System.out.println("Classificação: Bem remunerado");
                } else {
                    System.out.println("Salário inválido");
                }
            }
            default -> System.out.println("Não existe essa opção");
        }

        entrada.close();
    }
}
