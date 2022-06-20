/**
 * @author kauas - 16/04/2022 Quinta
 * Livro: Fundamentos da Programação de Computadores
 * Capítulo 4, Exercício Resolvido 16, pág.78
 */

/*
Um supermercado deseja reajustar os preços de seus produtos usando o seguinte
critérios: o produto poderá ter seu preço aumentado ou diminuído. Para o preço
ser alterado, o produto deve preencher pelo menos um dos requisitos a seguir:

[imagem, pág. 78]

Faça um programa que receba o preço atual e a venda média mensal do produto,
calcule e mostre o novo preço.
 */
package capitulo_4.exercicios_resolvidos;

import java.text.DecimalFormat;
import java.util.Scanner;

public class ExercResolvido16 {

    public static void main(String[] args) {
        // Declaração de variáveis
        Scanner entrada = new Scanner(System.in);
        DecimalFormat casas = new DecimalFormat("0.00");
        int vendaMensal, porcentagem;
        float precoAtual, precoNovo, aumentaDiminui;

        // Coletar dados
        System.out.print("Digite o preço atual do produto: ");
        precoAtual = entrada.nextFloat();
        System.out.print("Digite a quantidade de venda mensal do produto: ");
        vendaMensal = entrada.nextInt();

        // Desvio condicional referente a dado inválido
        if (precoAtual <= 0) {
            System.out.println("Valor inválido");
        } else {
            // Desvio condicional referente ao preço novo
            if (precoAtual < 30 || vendaMensal < 500) {
                porcentagem = 10;
                aumentaDiminui = (precoAtual * porcentagem) / 100;
                precoNovo = precoAtual + aumentaDiminui;

                System.out.println("\nO preço irá ter um aumento de 10% (R$ " + casas.format(aumentaDiminui) + ")");
                System.out.println("Seu novo preço será de R$ " + casas.format(precoNovo));
            } else if ((precoAtual >= 30 && precoAtual < 80) || (vendaMensal >= 500 && vendaMensal < 1200)) {
                porcentagem = 15;
                aumentaDiminui = (precoAtual * porcentagem) / 100;
                precoNovo = precoAtual + aumentaDiminui;

                System.out.println("\nO preço irá ter um aumento de 15% (R$ " + casas.format(aumentaDiminui) + ")");
                System.out.println("Seu novo preço será de R$ " + casas.format(precoNovo));
            } else {
                porcentagem = 20;
                aumentaDiminui = (precoAtual * porcentagem) / 100;
                precoNovo = precoAtual - aumentaDiminui;

                System.out.println("\nO preço irá ter um desconto de 20% (R$ " + casas.format(aumentaDiminui) + ")");
                System.out.println("Seu novo preço será de R$ " + casas.format(precoNovo));
            }

        }

        entrada.close();
    }
}
