/**
 * @author kauas - 19/07/2022 terça
 * Livro: Fundamentos da Programação de Computadores
 * Capítulo 5, Exercício Resolvido 23, pág. 141
 */

/*
Faça um programa que receba o valor do salário mínimo, uma lista contendo a
quantidade de quilowhatts gasta por consumidor e o tipo de consumidor (1 - 
residencial; 2 - comercial; ou 3 - industrial) e que calcule e mostre:

- O valor de cada quilowhatt, sabendo que o quilowhatt custa um oitavo do
  salário mínimo; [eu alterei esse valor]
- O valor a ser pago por consumidor (conta final mais acréscimo). O acréscimo
  encontra-se na tabela a seguir:
  [imagem, pág. 142]
- O faturamento geral da empresa;
- A quantidade de consumidores que pagam entre R$ 500,00 e R$ 1.000,00.

Termine a entrada de dados com a quantidade de quilowhatts igual a zero.
*/
package capitulo_5.exercicios_resolvidos;

import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

public class ExercicioResolvido23 {
    
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        Locale localBR = new Locale("pt","BR");
        
        NumberFormat fmtDinheiro = NumberFormat.getCurrencyInstance(localBR);
        NumberFormat fmtNumero = NumberFormat.getNumberInstance(localBR);
        
        float salMinimo, vlrQuilowhatt, vlrInicial, pctAcrescimo, vlrAcrescimo, vlrFinal, vlrFaturamento;
        int i, qtdQuilowhatt, tipoConsumidor, qtdConsVlrFinal;
        
        i = 1;
        vlrFaturamento = 0;
        qtdConsVlrFinal = 0;
        pctAcrescimo = 0;
        
        // Estrutura de repetição referente a dado inválido
        do {
            System.out.print("Digite o salário mínimo atualmente: ");
            salMinimo = entrada.nextFloat();
            
            if (salMinimo <= 0) {
                System.out.println("Salário mínimo inválido!");
            }
        } while (salMinimo <= 0);
        
        System.out.println("\n-------------------------------------------\n");
        
        // Alterei o valor para que cada quilowhatt custe R$ 1,00
        // vlrQuilowhatt = salMinimo / 8;
        vlrQuilowhatt = salMinimo / salMinimo;
        
        // Estrutura de repetição referente a dado inválido
        do {
            System.out.print("Digite a quantidade de quilowhatts que o "+i+"º consumidor gasta: ");
            qtdQuilowhatt = entrada.nextInt();
            entrada.nextLine();
            
            if (qtdQuilowhatt < 0) {
                System.out.println("Quilowhatt inválido!");
            }
        } while (qtdQuilowhatt < 0);
        
        // Estrutura de repetição referente a repetição dos processos
        while (qtdQuilowhatt != 0) {
            // Estrutura de repetição referente a dado inválido
            do {
                System.out.print("Qual o tipo de consumidor?\n1 - Residencial / 2 - Comercial / 3 - Industrial: ");
                tipoConsumidor = entrada.nextInt();
                
                if (tipoConsumidor!=1 && tipoConsumidor!=2 && tipoConsumidor!=3) {
                    System.out.println("Tipo de consumidor, inválido!");
                }
            } while (tipoConsumidor!=1 && tipoConsumidor!=2 && tipoConsumidor!=3);
            
            switch (tipoConsumidor) {
                case 1: 
                    pctAcrescimo = 5;
                    break;
                case 2:
                    pctAcrescimo = 10;
                    break;
                case 3:
                    pctAcrescimo = 15;
                    break;
            }
            
            vlrInicial = qtdQuilowhatt * vlrQuilowhatt;
            vlrAcrescimo = (vlrInicial * pctAcrescimo) / 100;
            vlrFinal = vlrInicial + vlrAcrescimo;
            vlrFaturamento = vlrFaturamento + vlrFinal;
            
            if (vlrFinal >= 500 && vlrFinal <= 1000) {
                qtdConsVlrFinal++;
            }
            
            System.out.println("\nValor do Quilowhatt:      "+fmtDinheiro.format(vlrQuilowhatt));
            System.out.println("Valor bruto:              "+fmtDinheiro.format(vlrInicial));
            System.out.println("Valor do acréscimo ("+fmtNumero.format(pctAcrescimo)+"%): "+fmtDinheiro.format(vlrAcrescimo));
            System.out.println("Valor a ser pago:         "+fmtDinheiro.format(vlrFinal));
            System.out.println("\n-------------------------------------------\n");
        
            i++;
            
            // Estrutura de repetição baseado a dado inválido
            do {
                System.out.println("Para encerrar o sistema digite 0 para a quantidade de quilowhatt");
                System.out.print("Digite a quantidade de quilowhatts que o "+i+"º consumidor gasta: ");
                qtdQuilowhatt = entrada.nextInt();
                entrada.nextLine();

                if (qtdQuilowhatt < 0) {
                    System.out.println("Quilowhatt inválido!");
                }
            } while (qtdQuilowhatt < 0);   
        }
        
        System.out.println("\n\n===========================================");
        System.out.println("            RELATÓRIO DA EMPRESA\n");
        System.out.println("Valor do Quilowhatt: "+fmtDinheiro.format(vlrQuilowhatt));
        System.out.println("Quantidade total de consumidores: "+(i-1));
        System.out.println("Faturamento: "+fmtDinheiro.format(vlrFaturamento));
        System.out.println("Quantidade total de consumidores que pagam entre R$ 500,00 e R$ 1000,00: "+qtdConsVlrFinal);
        System.out.println("===========================================\n");
        
        entrada.close();
    }
}
