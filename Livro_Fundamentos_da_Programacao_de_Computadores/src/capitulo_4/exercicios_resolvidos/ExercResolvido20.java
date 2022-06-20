/**
 * @author kauas - 18/04/2022 Segunda
 * Livro: Fundamentos da Programação de Computadores
 * Capítulo 4, Exercício Resolvido 20, pág.81
 */

/*
Faça um programa que receba:
- O código de um produto comprado, supondo que a digitação do código do
  produto seja sempre válida, isto é, um número inteiro entre 1 e 10;
- O peso do produto em quilos;
- O código do país de origem, supondo que a digitação seja sempre válida,
  isto é, um número inteiro entre 1 e 3.

Tabelas:
[imagem, pág. 81]

Calcule e mostre:
- O peso do produto convertido em gramas;
- O preço total do produto comprado;
- O valor do imposto, sabendo que ele é cobrado sobre o preço total do
  produto comprado e depende do país de origem;
- O valor total, preço total do produto mais imposto.
 */
package capitulo_4.exercicios_resolvidos;

import java.text.DecimalFormat;
import java.util.Scanner;

public class ExercResolvido20 {

    public static void main(String[] args) {
        // Declaração de variáveis
        Scanner entrada = new Scanner(System.in);
        DecimalFormat casas = new DecimalFormat("0.00");
        int idProduto, idPais, pQuilo, pGrama, porcentagem = 0;
        float precoProduto = 0, precoFinal = 0, imposto = 0;

        // Coletar dados
        System.out.print("\nDigite o código do produto: ");
        idProduto = entrada.nextInt();
        System.out.print("Digite o peso do produto em quilos: ");
        pQuilo = entrada.nextInt();
        System.out.print("Digite o código do país de origem: ");
        idPais = entrada.nextInt();

        // Operação referente ao peso em gramas
        pGrama = pQuilo * 1000;

        // Desvio condicional referente a dado inválido
        if (idProduto > 0 && idProduto < 11) {
            // Desvio condicional referente ao preço do produto
            if (idProduto >= 1 && idProduto <= 4) {
                precoProduto = pGrama * 10;
            } else if (idProduto >= 5 && idProduto <= 7) {
                precoProduto = pGrama * 25;
            } else if (idProduto >= 8 && idProduto <= 10) {
                precoProduto = pGrama * 35;
            }
        } else {
            System.out.println("\nCódigo do produto, inválido!");
        }

        // Desvio condicional referente ao preço final
        switch (idPais) {
            case 1 -> {
                porcentagem = 0;
                imposto = (precoProduto * porcentagem) / 100;
                precoFinal = precoProduto + imposto;
            }
            case 2 -> {
                porcentagem = 15;
                imposto = (precoProduto * porcentagem) / 100;
                precoFinal = precoProduto + imposto;
            }
            case 3 -> {
                porcentagem = 25;
                imposto = (precoProduto * porcentagem) / 100;
                precoFinal = precoProduto + imposto;
            }
            default -> System.out.println("Código do país, inválido!");
        }

        // Exibir dados
        System.out.println("\n" + pQuilo + " kg -> " + pGrama + " g");
        System.out.println("Preço do produto -> R$ " + casas.format(precoProduto));
        System.out.println("Imposto (" + porcentagem + "%)    -> R$ " + casas.format(imposto));
        System.out.println("Preço final      -> R$ " + casas.format(precoFinal) + "\n");

        entrada.close();
    }
}
