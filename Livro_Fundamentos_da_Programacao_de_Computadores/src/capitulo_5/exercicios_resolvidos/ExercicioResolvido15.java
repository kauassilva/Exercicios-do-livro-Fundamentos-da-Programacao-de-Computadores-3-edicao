/**
 * @author kauas - 21/06/2022 Terça
 * Livro: Fundamentos da Programação de Computadores
 * Capítulo 5, Exercício Resolvido 15, pág. 132
 */

/*
Faça um programa que receba o preço unitário, a refrigeração (S para os produtos
que necessitem de refrigeração e N para os que não necessitem) e a categoria
(A - alimentação; L - limpeza; e V - vestuário) de doze produtos, e que calcule 
e mostre:

- O custo de estocagem, calculado de acordo com a tabela a seguir.

[imagem, pág. 132]

- O imposto calculado de acordo com as regras a seguir:
  Se o produto não preencher nenhum dos requisitos a seguir, seu imposto será de
  2% sobre o preço unitário, caso contrário, será de 4%.
  Os requisitos são: categoria - A e refrigeração - S.
- O preço final, ou seja, preço unitário mais custo de estocagem mais imposto.
- a classificação calculada usando a tabela a seguir.

[imagem, pág. 132]

- A média dos valores adicionais, ou seja, a média dos custo de estocagem e dos
impostos dos doze produtos.
- O maior preço final.
- O menor preço final.
- O total dos impostos.
- A quantidade de produtos com classificação barato
- A quantidade de produtos com classificação caro.
- A quantidade de produtos com classificação normal.
 */
package capitulo_5.exercicios_resolvidos;

import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

public class ExercicioResolvido15 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        Locale localBR = new Locale("pt", "BR");
        
        NumberFormat fmtDinheiro = NumberFormat.getCurrencyInstance(localBR);

        float prUnitario, custoEstocagem, imposto, prFinal, somaEstocagem;
        float somaImposto, mediaEstocagem, mediaImposto, mediaAdicional, maior, menor;
        int qtdProduto, pctImposto, contBarato, contCaro, contNormal;
        char opcaoRefrigeracao, opcaoCategoria;
        String classificacao;

        qtdProduto = 12;
        custoEstocagem = 0;
        somaEstocagem = 0;
        somaImposto = 0;
        maior = 0;
        menor = 0;
        contBarato = 0;
        contNormal = 0;
        contCaro = 0;

        // Estrutura de repetição baseado na quantidade de produtos
        for (int i=1; i<=qtdProduto; i++) {
            // Conjunto de estruturas de repetição referentes a dados inválidos
            do {
                System.out.print("\nDigite o preço unitário do produto "+i+": ");
                prUnitario = entrada.nextFloat();
                entrada.nextLine();
                
                if (prUnitario < 0) {
                    System.out.println("\nValor unitário inválido!");
                }
            } while (prUnitario < 0);

            do  {
                System.out.print("O produto "+i+" necessita de refrigeração?\nS - sim\nN - não\n<< ");
                opcaoRefrigeracao = Character.toUpperCase(entrada.nextLine().charAt(0));
                
                if (opcaoRefrigeracao!='S' && opcaoRefrigeracao!='N') {
                    System.out.println("\nEssa opção de refrigeração não existe!\n");
                }
            } while (opcaoRefrigeracao!='S' && opcaoRefrigeracao!='N');

            do {
                System.out.print("Qual a categoria do produto "+i+"?\nA - alimentação\nL - limpeza\nV - vestuário\n<< ");
                opcaoCategoria = Character.toUpperCase(entrada.nextLine().charAt(0));
                
                if (opcaoCategoria!='A' && opcaoCategoria!='L' && opcaoCategoria!='V') {
                    System.out.println("\nEssa opção de categoria não existe!\n");
                }
            } while (opcaoCategoria!='A' && opcaoCategoria!='L' && opcaoCategoria!='V');
            
            // Desvio condicional referente ao preço unitário
            if (prUnitario < 20) {
                switch (opcaoCategoria) {
                    case 'A':
                        custoEstocagem = 2;
                        break;
                    case 'L':
                        custoEstocagem = 3;
                        break;
                    case 'V':
                        custoEstocagem = 4;
                        break;
                }
            } else if (prUnitario >= 20 && prUnitario <= 50) {
                switch (opcaoRefrigeracao) {
                    case 'S':
                        custoEstocagem = 6;
                        break;
                    case 'N':
                        custoEstocagem = 0;
                        break;
                }
            } else {
                switch (opcaoRefrigeracao) {
                    case 'S':
                        switch (opcaoCategoria) {
                            case 'A':
                                custoEstocagem = 5;
                                break;
                            case 'L':
                                custoEstocagem = 2;
                                break;
                            case 'V':
                                custoEstocagem = 4;
                                break;
                        }
                        break;
                    case 'N':
                        switch (opcaoCategoria) {
                            case 'A':
                                custoEstocagem = 0;
                                break;
                            case 'L':
                                custoEstocagem = 1;
                                break;
                            case 'V':
                                custoEstocagem = 0;
                                break;
                        }
                        break;
                }
            }
            
            // Desvio condicional referente ao imposto
            if (opcaoCategoria == 'A' && opcaoRefrigeracao == 'S') {
                pctImposto = 2;
                imposto = prUnitario * pctImposto / 100;
            } else {
                pctImposto = 4;
                imposto = prUnitario * pctImposto / 100;
            }
            
            // Operação referente ao preço final
            prFinal = prUnitario + custoEstocagem + imposto;
            
            // Desvio condicional referente a classificação
            if (prFinal < 20) {
                classificacao = "Barato";
                contBarato++;
            } else if (prFinal>=20 && prFinal<=100) {
                classificacao = "Normal";
                contNormal++;
            } else {
                classificacao = "Caro";
                contCaro++;
            }
            
            // Operações para a média do custo de estocagem e imposto
            somaEstocagem = somaEstocagem + custoEstocagem;
            somaImposto = somaImposto + imposto;
            
            // Desvio condicional referente ao maior e menor preço final
            if (i == 1) {
                maior = prFinal;
                menor = prFinal;
            } else {
                if (maior < prFinal) {
                    maior = prFinal;
                }
                
                if (menor > prFinal) {
                    menor = prFinal;
                }
            }
            
            System.out.println("\nCusto de estocagem: "+fmtDinheiro.format(custoEstocagem));
            System.out.println("Imposto de "+pctImposto+"% sobre o preço unitário: "+fmtDinheiro.format(imposto));
            System.out.println("Preço final do produto "+i+": "+fmtDinheiro.format(prFinal));
            System.out.println("Classificação do preço do produto "+i+": "+classificacao);
            System.out.println("\n---------------------------------------------");
        }
        
        // Operações referentes a média dos valores adicionais dos produto
        mediaEstocagem = somaEstocagem / qtdProduto;
        mediaImposto = somaImposto / qtdProduto;
        mediaAdicional = (mediaEstocagem + mediaImposto) / 2;
        
        System.out.println("\n\n\nMédia dos valores adicionais: "+fmtDinheiro.format(mediaAdicional));
        System.out.println("Maior preco final: "+fmtDinheiro.format(maior));
        System.out.println("Menor preço final: "+fmtDinheiro.format(menor));
        System.out.println("Total de imposto sobre o preço unitário: "+fmtDinheiro.format(somaImposto));
        System.out.println("Quantidade de produtos classificados como 'Barato': "+contBarato);
        System.out.println("Quantidade de produtos classificados como 'Caro': "+contCaro);
        System.out.println("Quantidade de produtos classificados como 'Normal': "+contNormal+"\n");
        
        entrada.close();
    }
}
