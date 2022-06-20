/**
 * @author kauas - 19/04/2022 Terça
 * Livro: Fundamentos da Programação de Computadores
 * Capítulo 4, Exercício Resolvido 24, pág.87
 */

/*
Faça um programa que receba o preço, o tipo (A - alimentação; L - limpeza; e 
V - vestuário) e a refrigeração (S - produto que necessita de refrigeração; e
N - produto que não necessita de refrigeração) de um produto. Suponha que
haverá apenas a digitação de dados válidos e, quando houver digitação de letras,
utilize maiúsculas. Calcule e mostre:
- O valor adicional, de acordo com a tabela a seguir:
  [imagem, pág. 87]
- O vlor do imposto, de acordo com a regra a seguir.
  [imagem, pág. 87]
- O preço de custo, ou seja, preço mais imposto.
- O desconto, de acordo com a regra a seguir.
  O produto que não preencher nenhum dos requisitos a seguir terá  desconto de
  3%, caso contrário, 0 (zero).

  Os requisitos são:
  Tipo: A
  Refrigeração: S

- O novo preço, ou seja, preço de custo mais adicional menos desconto.
- A classificação, de acordo com a regra a seguir.
  [imagem, pág. 88]
 */
package capitulo_4.exercicios_resolvidos;

import java.text.DecimalFormat;
import java.util.Scanner;

public class ExercResolvido24 {

    public static void main(String[] args) {
        // Declaração de variáveis
        Scanner entrada = new Scanner(System.in);
        DecimalFormat casas = new DecimalFormat("0.00");
        float prProduto, prCusto, prNovo, adicional = 0, imposto, desconto;
        int pctImposto, pctDesconto;
        char tipo, uppTipo, refrigeracao, uppRefrigeracao;
        String classificacao;

        // Coletar dados
        System.out.print("\nDigite o preço do produto: ");
        prProduto = entrada.nextFloat();
        entrada.nextLine(); // buffer
        System.out.print("Digite o tipo do produto:\n[A] - Alimentação\n[L] - Limpeza\n[V] - Vestuário\n<< ");
        tipo = entrada.nextLine().charAt(0);
        uppTipo = Character.toUpperCase(tipo);
        System.out.print("Digite se o produto precisa de refrigeração:\n[S] - Sim\n[N] - Não\n<< ");
        refrigeracao = entrada.nextLine().charAt(0);
        uppRefrigeracao = Character.toUpperCase(refrigeracao);

        // Desvio condicional referente a dado inválido
        if (prProduto > 0) {
            // Desvio condicional referente a necessidade de refrigeração
            switch (uppRefrigeracao) {
                case 'N' -> {
                    // Desvio condicional referente ao tipo de produto
                    switch (uppTipo) {
                        case 'A' -> {
                            // Desvio condicional referente ao valor adicional
                            if (prProduto < 15) {
                                adicional = 2;
                            } else {
                                adicional = 5;
                            }
                        }
                        case 'L' -> {
                            // Desvio condicional referente ao valor adicional
                            if (prProduto < 10) {
                                adicional = 1.5F;
                            } else {
                                adicional = 2.5F;
                            }
                        }
                        case 'V' -> {
                            // Desvio condicional referente ao valor adicional
                            if (prProduto < 30) {
                                adicional = 3;
                            } else {
                                adicional = 2.5F;
                            }
                        }
                        default ->
                            System.out.println("\nOpção de Tipo, inválido!");
                    }
                }
                case 'S' -> {
                    // Desvio condicional referente ao tipo de produto
                    switch (uppTipo) {
                        case 'A' ->
                            adicional = 8;
                        case 'L', 'V' ->
                            adicional = 0;
                        default ->
                            System.out.println("\nOpção de Tipo, inválido!");
                    }
                }
                default ->
                    System.out.println("\nOpção de Refrigeração, inválido!");
            }

            // Desvio condicional referente ao imposto
            if (prProduto < 25) {
                pctImposto = 5;
                imposto = (prProduto * pctImposto) / 100;
            } else {
                pctImposto = 8;
                imposto = (prProduto * pctImposto) / 100;
            }

            // Operação referente ao preço de custo
            prCusto = prProduto + imposto;

            // Desvio condicional referente ao desconto
            if (uppTipo == 'A' || uppRefrigeracao == 'S') {
                pctDesconto = 0;
                desconto = (prProduto * pctDesconto) / 100;
            } else {
                pctDesconto = 3;
                desconto = (prProduto * pctDesconto) / 100;
            }

            // Operação referente ao preço novo
            prNovo = prCusto + adicional - desconto;

            // Desvio condicional referente a classificação
            if (prNovo <= 50) {
                classificacao = "Barato";
            } else if (prNovo > 50 && prNovo < 100) {
                classificacao = "Normal";
            } else {
                classificacao = "Caro";
            }

            // Exibir dados
            System.out.println("\nValor adicional : R$ " + casas.format(adicional));
            System.out.println("Imposto (" + pctImposto + "%)    : R$ " + casas.format(imposto));
            System.out.println("Preço de custo  : R$ " + casas.format(prCusto));
            System.out.println("Desconto (" + pctDesconto + "%)   : R$ " + casas.format(desconto));
            System.out.println("Novo preço      : R$ " + casas.format(prNovo));
            System.out.println("Classificação   : " + classificacao + "\n");

        } else {
            System.out.println("\nPreço, inválido!\n");
        }

        entrada.close();
    }
}
