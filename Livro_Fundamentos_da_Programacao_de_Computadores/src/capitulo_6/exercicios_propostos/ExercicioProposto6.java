/**
 * @author kauas - 19/02/2023 Domingo
 * Livro: Fundamentos da Programação de Computadores
 * Capítulo 6, Exercício Proposto 6, pág. 191
 */

/*
Faça um programa que receba o total das vendas de cada vendedor de uma loja e armazene-as em um vetor.
Receba também o percentual de comissão a que cada vendedor tem direito e armazene-os em outro vetor.
Receba os nomes desses vendedores e armazene-os em um terceiro vetor. Existem apenas dez vendedores na
loja. Calcule e mostre:

- um relatório com os nomes dos vendedores e os valores a receber referentes à comissão;
- o total das vendas de todos os vendedores;
- o maior valor a receber e o nome de quem o receberá;
- o menor valor a receber e o nome de quem o receberá.
*/

package capitulo_6.exercicios_propostos;

import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

import javax.swing.plaf.basic.BasicBorders.MarginBorder;

public class ExercicioProposto6 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        // Objeto para formatação monetária baseada no sistema brasileiro
        NumberFormat moneyFormat = NumberFormat.getCurrencyInstance(Locale.getDefault());

        String[] nomes = new String[3];
        double[] percentuais = new double[nomes.length];
        double[] vendas = new double[nomes.length]; 

        // ========== Loop para preencher os dados dos vendedores ==========
        System.out.println();
        for (int i=0; i<nomes.length; i++) {
            System.out.print("Digite o nome do "+(i+1)+"º vendedor: ");
            nomes[i] = scanner.nextLine();

            // Valida o percentual
            do {
                System.out.print("Digite o percentual de comissão que o(a) vendedor(a) tem direito: ");
                percentuais[i] = scanner.nextDouble();

                if (percentuais[i]>=100 || percentuais[i]<=0) {
                    System.out.println("\nPercentual inválido. Digite novamente.\n");
                }
            } while (percentuais[i]>=100 || percentuais[i]<=0);

            // Valida a venda
            do {
                System.out.print("Digite o total das vendas do(a) vendedor(a): R$ ");
                vendas[i] = scanner.nextDouble();

                if (vendas[i] <= 0) {
                    System.out.println("Valor inválido. Digite novamente.");
                }
            } while (vendas[i] <= 0);
            scanner.nextLine();
            System.out.println();
        }


        System.out.println("\n========== RELATÓRIO ==========\n");

        // Exibi a comissão de cada vendedor
        for (int i=0; i<nomes.length; i++) {
            double comissao = (vendas[i] * percentuais[i])/100;
            String comissaoFormatada = moneyFormat.format(comissao);

            System.out.println("O(A) "+nomes[i]+" irá receber de suas vendas "+comissaoFormatada+" ("+percentuais[i]+"%)");
        }

        // Exibi o total de vendas da empresa
        double totalVendas = 0;
        System.out.println();
        for (int i=0; i<nomes.length; i++) {
            totalVendas += vendas[i];
        }
        String totalVendasFormatada = moneyFormat.format(totalVendas);
        System.out.println("O total de vendas da empresa: "+totalVendasFormatada);

        // Exibi a menor e maior comissão, e o vendedor 
        double maior = 0;
        double menor = 0;
        String maiorVendedor = null;
        String menorVendedor = null;
        for (int i=0; i<nomes.length; i++) {
            double comissao = (vendas[i] * percentuais[i])/100;

            if (i == 0) {
                maior = comissao;
                menor = comissao;
                maiorVendedor = nomes[i];
                menorVendedor = nomes[i];
            } else {
                if (comissao > maior) {
                    maior = comissao;
                    maiorVendedor = nomes[i];
                }
                if (comissao < menor) {
                    menor = comissao;
                    menorVendedor = nomes[i];
                }
            }
        }
        
        String maiorFormatado = moneyFormat.format(maior);
        String menorFormatado = moneyFormat.format(menor);

        System.out.println("\nO vendedor "+maiorVendedor+" foi o que mais recebeu dinheiro: "+maiorFormatado);
        System.out.println("O vendedor "+menorVendedor+" foi o que mais recebeu dinheiro: "+menorFormatado);

    }
    
}
