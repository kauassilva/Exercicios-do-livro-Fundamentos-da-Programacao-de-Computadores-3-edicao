/**
 * @author kauas - 02/05/2022 segunda
 * Livro: Fundamentos da Programação de Computadores
 * Capítulo 4, Exercício Proposto 23, pág.93
 */

/*
Faça um programa que receba:
- o código do produto comprado; e
- a quantidade comprada do produto.

Calcule e mostre:
- o preço unitário do produto comprado, seguindo a Tabela I;
- o preço total da nota;
- o valor do desconto, seguindo a Tabela II e aplicado sobre o preço total
  da nota; e
- o preço final da nota depois do desconto.
[imagem, pág. 93]
[imagem, pág. 93]
 */
package capitulo_4.exercicios_propostos;

import java.text.DecimalFormat;
import java.util.Scanner;

public class ExercProposto23 {

    public static void main(String[] args) {
        // Declaração de variáveis
        Scanner entrada = new Scanner(System.in);
        DecimalFormat casas = new DecimalFormat("0.00");
        int id, quantidade, pctDesconto;
        float prUnitario, prTotal, prFinal, desconto;

        // Coletar dados
        System.out.print("\nDigite o código do produto: ");
        id = entrada.nextInt();
        System.out.print("Digite a quantidade do produto escolhido: ");
        quantidade = entrada.nextInt();

        // Desvio condicional referente a dado inválido
        if (id > 0 && id < 41) {
            // Desvio condicional referente ao preço unitário
            if (id >= 1 && id <= 10) {
                prUnitario = 10;
            } else if (id >= 11 && id <= 20) {
                prUnitario = 15;
            } else if (id >= 21 && id <= 30) {
                prUnitario = 20;
            } else {
                prUnitario = 30;
            }

            // Operação referente ao preço total
            prTotal = prUnitario * quantidade;

            // Desvio condicional referente a percentagem do desconto
            if (prTotal < 250) {
                pctDesconto = 5;
            } else if (prTotal >= 250 && prTotal <= 500) {
                pctDesconto = 10;
            } else {
                pctDesconto = 15;
            }

            // Operações referentes ao preço final
            desconto = (prTotal * pctDesconto) / 100;
            prFinal = prTotal - desconto;

            // Exibir dados
            System.out.println("\nPreço unitário do produto: R$ " + casas.format(prUnitario));
            System.out.println("Preço total da nota: R$ " + casas.format(prTotal));
            System.out.println("Desconto de " + pctDesconto + "%: R$ " + casas.format(desconto));
            System.out.println("Preço final da nota: R$ " + casas.format(prFinal) + "\n");

        } else {
            System.out.println("\nNão existe um produto para este código!\n");
        }

        entrada.close();
    }
}
