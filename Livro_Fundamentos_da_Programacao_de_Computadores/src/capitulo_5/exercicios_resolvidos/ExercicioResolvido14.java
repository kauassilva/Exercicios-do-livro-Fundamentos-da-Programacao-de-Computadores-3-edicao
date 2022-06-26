/**
@author kauas - 21/06/2022 Terça
Livro: Fundamentos da Programação de Computadores
Capítulo 5, Exercício Resolvido 14, pág. 130
*/

/*
Faça um programa que receba o valor de uma dívida e mostre uma tabela com os
seguintes dados: valor da dívida, valor dos juros, quantidade de parcelas e
valor da parcela.

[imagem, pág. 130]

Exemplo de saída do programa:

[imagem, pág. 131]
*/
package capitulo_5.exercicios_resolvidos;

import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

public class ExercicioResolvido14 {
    
    public static void main(String[] args) {
        // Declaração de variáveis
        Scanner entrada = new Scanner(System.in);
        Locale localBR = new Locale("pt", "BR");
        
        NumberFormat fmtDinheiro = NumberFormat.getCurrencyInstance(localBR);
        
        float divida, dvdFinal, juros, parcela;
        int qtdPclTotal, vlrIncremento, porcentagem;
        
        qtdPclTotal = 12;
        vlrIncremento = 2;
        
        System.out.print("Digite o valor da dívida: ");
        divida = entrada.nextFloat();
        
        if (divida >= 0) {
            System.out.println("\n+-----------------+-----------------+------------------+------------------+");
            System.out.println("| VALOR DA DÍVIDA | VALOR DOS JUROS | QTD. DE PARCELAS | VALOR DA PARCELA |");
            System.out.println("+-----------------+-----------------+------------------+------------------+");

            // Laço de repetição baseado na quantidade de parcelas
            for (int i=1; i<=qtdPclTotal; i+=vlrIncremento) {
                // Desvio condicional referente a porcentagem do juros
                switch (i) {
                    case 1 -> {
                        porcentagem = 0;
                    }
                    case 3 -> {
                        vlrIncremento = 3;
                        porcentagem = 10;
                    }
                    case 6 -> {
                        porcentagem = 15;
                    }
                    case 9 -> {
                        porcentagem = 20;
                    }
                    default -> {
                        porcentagem = 25;
                    }
                }

                // Operações referentes ao valor do juros, da dívida e da parcela
                juros = divida * porcentagem / 100;
                dvdFinal = divida + juros;
                parcela = dvdFinal / i;
 
                System.out.println("|   "+fmtDinheiro.format(dvdFinal)+"   |     "+fmtDinheiro.format(juros)+"     |        "+i+"         |  "+fmtDinheiro.format(parcela)+"  |");
                
            }

            System.out.println("+-----------------+-----------------+------------------+------------------+\n");
        } else {
            System.out.println("\nValor da dívida inválido!\n");
        }
        entrada.close();
    }
}
