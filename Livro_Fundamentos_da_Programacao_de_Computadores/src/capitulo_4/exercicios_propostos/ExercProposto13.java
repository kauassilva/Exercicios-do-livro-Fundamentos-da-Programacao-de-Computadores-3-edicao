/**
 * @author kauas - 23/04/2022 sábado
 * Livro: Fundamentos da Programação de Computadores
 * Capítulo 4, Exercício Proposto 13, pág.91
 */

/*
Faça um programa que receba o preço de um produto, calcule e mostre, de acordo
com as tabelas a seguir, o novo preço e a classificação.
[imagem, pág. 91]
[imagem, pág. 91]
 */
package capitulo_4.exercicios_propostos;

import java.text.DecimalFormat;
import java.util.Scanner;

public class ExercProposto13 {

    public static void main(String[] args) {
        // Declaração de variáveis
        Scanner entrada = new Scanner(System.in);
        DecimalFormat casas = new DecimalFormat("0.00");
        float prAtual, prNovo, aumento;
        int porcentagem;
        String classificacao;

        // Coletar dado
        System.out.print("\nDigite o preço do produto: ");
        prAtual = entrada.nextFloat();

        // Desvio condicional referente a dado inválido
        if (prAtual > 0) {
            // Desvio condicional referente a percentagem
            if (prAtual < 50) {
                porcentagem = 5;
            } else if (prAtual >= 50 && prAtual <= 100) {
                porcentagem = 10;
            } else {
                porcentagem = 15;
            }

            // Operações referentes ao preço novo
            aumento = (prAtual * porcentagem) / 100;
            prNovo = prAtual + aumento;

            // Desvio condicional referente a classificação
            if (prNovo <= 80) {
                classificacao = "Barato";
            } else if (prNovo > 80 && prNovo <= 120) {
                classificacao = "Normal";
            } else if (prNovo > 120 && prNovo <= 200) {
                classificacao = "Caro";
            } else {
                classificacao = "Muito caro";
            }

            // Exibir dados
            System.out.println("\nAumento de " + porcentagem + "%: R$ " + casas.format(aumento));
            System.out.println("\nNovo preço: R$ " + casas.format(prNovo));
            System.out.println("Classificação: " + classificacao + "\n");
        } else {
            System.out.println("\nPreço do produto, inválido!\n");
        }

        entrada.close();
    }
}
