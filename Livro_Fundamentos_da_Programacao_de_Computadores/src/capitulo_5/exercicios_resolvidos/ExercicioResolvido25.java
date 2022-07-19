/**
 * @author kauas - 19/07/2022 terça
 * Livro: Fundamentos da Programação de Computadores
 * Capítulo 5, Exercício Resolvido 25, pág. 144
 */

/*
Faça um programa que receba os dados a seguir de vários produtos: preço 
unitário, país de origem (1 - Estados Unidos; 2 - México; 3 - outros), meio de
transporte (T - terrestre; F - fluvial; e A - aéreo), carga perigosa (S - sim;
N - não), finalize a entrada de dados com um preço inválido, ou seja, menor ou
igual a zero. O programa deve calcular e mostrar os itens a seguir.

- O valor do imposto, usando a tabela a seguir.

  [imagem, pág. 145]

- O valor do transporte usando a tabela a seguir.

  [imagem, pág. 145]

- O valor do seguro, usando a regra a seguir.

  Os produtos que vêm do México e os produtos que utilizam transporte aéreo 
  pagam metade do valor do seu preço unitário como seguro.

- O preço final, ou seja, preço unitário mais imposto mais valor do transporte
  mais valor do seguro.
- O total dos impostos.
*/
package capitulo_5.exercicios_resolvidos;

import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

public class ExercicioResolvido25 {
    
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        Locale localBR = new Locale("pt","BR");
        
        NumberFormat fmtDinheiro = NumberFormat.getCurrencyInstance(localBR);
        NumberFormat fmtNumero = NumberFormat.getNumberInstance(localBR);
        
        int i, opcaoPais;
        float precoUnitario, pctImposto, vlrImposto, vlrTransporte, vlrSeguro, precoFinal, precoTotalImposto;
        char opcaoTransporte, opcaoCarga;
        
        i = 1;
        precoTotalImposto = 0;
        
        System.out.println("\n--------------------------------\n");
        System.out.println("Caso queira encerrar o sistema digite um valor menor ou igual a 0 para o preço unitário");
        System.out.print("Digite o preço unitário do "+i+"º produto: ");
        precoUnitario = entrada.nextFloat();
        
        // Estrutura de repetição referente a repetição dos processos
        while (precoUnitario > 0) {
            // Estrutura de repetição referente a dado inválido
            do {
                System.out.println("Qual o país de origem?");
                System.out.println("1 - Estados Unidos / 2 - México / 3 - outros");
                System.out.print("Digite a opção: ");
                opcaoPais = entrada.nextInt();
                entrada.nextLine();
                
                if (opcaoPais!=1 && opcaoPais!=2 && opcaoPais!=3) {
                    System.out.println("Opção inválida, digite novamente!");
                }
            } while (opcaoPais!=1 && opcaoPais!=2 && opcaoPais!=3);
            
            // Estrutura de repetição referente a dado inválido
            do  {
                System.out.println("Qual o meio de transporte?");
                System.out.println("T - terrestre / F - fluvial / A - aéreo");
                System.out.print("Digite a opção: ");
                opcaoTransporte = Character.toUpperCase(entrada.nextLine().charAt(0));
                
                if (opcaoTransporte!='T' && opcaoTransporte!='F' && opcaoTransporte!='A') {
                    System.out.println("Opção inválida, digite novamente!");
                }
            } while (opcaoTransporte!='T' && opcaoTransporte!='F' && opcaoTransporte!='A');
            
            // Estrutura de repetição referente a dado inválido
            do {                
                System.out.println("A carga é do tipo carga perigosa?");
                System.out.println("S - sim / N - não");
                System.out.print("Digite a opção: ");
                opcaoCarga = Character.toUpperCase(entrada.nextLine().charAt(0));
                
                if (opcaoCarga != 'S' && opcaoCarga != 'N') {
                    System.out.println("Opção inválida, digite novamente!");
                }
            } while (opcaoCarga != 'S' && opcaoCarga != 'N');
            
            if (precoUnitario <= 100) {
                pctImposto = 5;
            } else {
                pctImposto = 10;
            }
            
            vlrImposto = (precoUnitario * pctImposto) / 100;
            
            if (opcaoCarga == 'S') {
                switch (opcaoPais) {
                    case 1:
                        vlrTransporte = 50;
                        break;
                    case 2:
                        vlrTransporte = 21;
                        break;
                    default:
                        vlrTransporte = 24;
                }
            } else {
                switch (opcaoPais) {
                    case 1:
                        vlrTransporte = 12;
                        break;
                    case 2:
                        vlrTransporte = 21;
                        break;
                    default:
                        vlrTransporte = 60;
                }
            }
            
            if (opcaoPais == 2 || opcaoTransporte == 'A') {
                vlrSeguro = precoUnitario / 2;
            } else {
                vlrSeguro = 0;
            }
            
            precoFinal = precoUnitario + vlrImposto + vlrTransporte + vlrSeguro;
            precoTotalImposto = precoTotalImposto + vlrImposto;
            
            System.out.println("\nPreço unitário:         "+fmtDinheiro.format(precoUnitario));
            System.out.println("Valor do imposto ("+fmtNumero.format(pctImposto)+"%): "+fmtDinheiro.format(vlrImposto));
            System.out.println("Valor do transporte:    "+fmtDinheiro.format(vlrTransporte));
            System.out.println("Valor do seguro:        "+fmtDinheiro.format(vlrSeguro));
            System.out.println("Preço final:            "+fmtDinheiro.format(precoFinal));
            System.out.println("\n--------------------------------\n");
            
            i++;
            
            System.out.println("\nCaso queira encerrar o sistema digite um valor menor ou igual a 0 para o preço unitário");
            System.out.print("Digite o preço unitário do "+i+"º produto: ");
            precoUnitario = entrada.nextFloat();
        }
        
        System.out.println("\n=================================\n");
        System.out.println("O total de imposto: "+fmtDinheiro.format(precoTotalImposto)+"\n");
        
        entrada.close();
    }
}
