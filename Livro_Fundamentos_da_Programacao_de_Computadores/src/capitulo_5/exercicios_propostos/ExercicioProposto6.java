/**
 * @author kauas - 25/07/2022 segunda
 * Livro: Fundamentos da Programação de Computadores
 * Capítulo 5, Exercício Proposto 6, pág. 147
 */

/*
Uma loja utiliza o código V para transação à vista e P para transação a prazo.
Faça um programa que receba o código e o valor de quinze transações, calcule e 
mostre:

- O valor total das compras à vista;
- O valor total das compras a prazo;
- O valor total das compras efetuadas; e
- O valor da primeira prestação das compras a prazo juntas, sabendo-se que serão
  pagas em três vezes
*/
package capitulo_5.exercicios_propostos;

import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

public class ExercicioProposto6 {
    
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        Locale localBR = new Locale("pt","BR");
        
        NumberFormat fmtDinheiro = NumberFormat.getCurrencyInstance(localBR);
        
        char codigo;
        int qtdTransacoes;
        float valorTransacao, totalVista, totalPrazo, totalFinal, valorPrestacao1, totalPrestacao1;
        
        qtdTransacoes = 15;
        totalVista = 0;
        totalPrazo = 0;
        totalPrestacao1 = 0;
        
        // Estrutura de repetição baseado na quantidade de transações
        for (int i=1; i<=qtdTransacoes; i++) {
            System.out.println("Digite o código da "+i+"ª transação");
            
            // Estrutura de repetição referente a dado inválido
            do {
                System.out.print("V - à vista / P - a prazo: ");
                codigo = Character.toUpperCase(entrada.nextLine().charAt(0));
                
                if (codigo != 'V' && codigo != 'P') {
                    System.out.println("Código inválido, digite novamente!");
                }
            } while (codigo != 'V' && codigo != 'P');
            
            // Estrutura de repetição referente a dado inválido
            do {
                System.out.print("Digite o valor da transação: ");
                valorTransacao = entrada.nextFloat();
                
                if (valorTransacao <= 0) {
                    System.out.println("Valor inválido, digite novamente!");
                }
            } while (valorTransacao <= 0);
            
            entrada.nextLine();
            
            if (codigo == 'V') {
                totalVista = totalVista + valorTransacao;
            } else {
                valorPrestacao1 = valorTransacao / 3;
                totalPrazo = totalPrazo + valorTransacao;
                totalPrestacao1 = totalPrestacao1 + valorPrestacao1;
            }
                    
            System.out.println("");
        }
        
        totalFinal = totalVista + totalPrazo;
        
        System.out.println("\nValor total das compras à vista: "+fmtDinheiro.format(totalVista));
        System.out.println("Valor total das compras a prazo: "+fmtDinheiro.format(totalPrazo));
        System.out.println("Valor total de todas as compras: "+fmtDinheiro.format(totalFinal));
        System.out.println("Valor total das primeiras prestações das compras feitas em até 3x: "+fmtDinheiro.format(totalPrestacao1));
        System.out.println("");
            
        entrada.close();
    }
}
