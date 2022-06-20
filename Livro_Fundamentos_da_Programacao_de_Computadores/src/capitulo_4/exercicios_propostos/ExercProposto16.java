/**
 * @author kauas - 02/05/2022 segunda
 * Livro: Fundamentos da Programação de Computadores
 * Capítulo 4, Exercício Proposto 16, pág.92
 */

/*
Uma empresa decide aplicar descontos nos seus preços usando a tabela a seguir.
Faça um programa que receba o preço atual de um produto e seu código, calcule
e mostre o valor do desconto e o novo preço.
[imagem, pág. 92]
 */
package capitulo_4.exercicios_propostos;

import java.text.DecimalFormat;
import java.util.Scanner;

public class ExercProposto16 {

    public static void main(String[] args) {
        // Declaração de variáveis
        Scanner entrada = new Scanner(System.in);
        DecimalFormat casas = new DecimalFormat("0.00");
        float prAtual, prNovo, desconto;
        int id, pctDesconto;

        // Coletar dados
        System.out.print("\nDigite o código do produto: ");
        id = entrada.nextInt();
        System.out.print("Digite o preço atual deste produto: ");
        prAtual = entrada.nextFloat();

        // Desvio condicional referente a dado inválido
        if (prAtual > 0) {
            // Desvio condicional referente a percentagem de desconto
            if (prAtual < 30) {
                pctDesconto = 0;
            } else if (prAtual >= 30 && prAtual <= 100) {
                pctDesconto = 10;
            } else {
                pctDesconto = 15;
            }

            // Operações referentes ao preço novo
            desconto = (prAtual * pctDesconto) / 100;
            prNovo = prAtual - desconto;

            // Exibir dados
            System.out.println("\nCódigo do produto: " + id);
            System.out.println("Seu novo preço com desconto de " + pctDesconto + "%: R$ " + casas.format(prNovo) + "\n");
        } else {
            System.out.println("\nPreço atual, inválido!\n");
        }

        entrada.close();
    }
}
