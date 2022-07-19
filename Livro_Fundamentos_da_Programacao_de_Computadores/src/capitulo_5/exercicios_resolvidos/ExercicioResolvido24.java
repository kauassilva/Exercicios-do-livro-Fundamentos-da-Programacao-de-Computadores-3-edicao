/**
 * @author kauas - 19/07/2022 terça
 * Livro: Fundamentos da Programação de Computadores
 * Capítulo 5, Exercício Resolvido 24, pág. 143
 */

/*
Faça um programa que apresente o menu de opções a seguir, permita ao usuário
escolher a opção desejada, receba os dados necessários para executar a operação
e mostre o resultado. Verifique a possibilidade de opção inválida e não se
preocupe com restrições do tipo salário inválido. [eu irei incluir restrição de salário]

Menu de opções:
1. Imposto
2. Novo salário
3. Classificação
4. Finalizar o programa
Digite a opção desejada.

Na opção 1: receber o salário de um funcionário, calcular e mostrar o valor do
imposto usando as regras a seguir.

[imagem, pág. 143] (eu alterei os valores)

Na opção 2: receber o salário de um funcionário, calcular e mostrar o valor do
novo salário usando as regras a seguir.

[imagem, pág. 143] (eu alterei os valores)

No opção 3: receber o salário de um funcionário e mostrar sua classificação
usando esta tabela:

[imagem, pág. 143] (eu alterei os valores)
*/
package capitulo_5.exercicios_resolvidos;

import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

public class ExercicioResolvido24 {
    
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        Locale localBR = new Locale("pt","BR");
        
        NumberFormat fmtDinheiro = NumberFormat.getCurrencyInstance(localBR);
        
        int opcaoMenu, pctImposto;
        float salario, vlrImposto, novoSalario, aumento;
        String classificacao;
        
        // Estrutura de repetição referente a repetição dos processos
        do {
            // Estrutura de repetição referente a dado inválido
            do {
                System.out.println("MENU DE OPÇÕES");
                System.out.println("1 - Imposto\n2 - Novo salário\n3 - Classificação\n4 - Finalizar o programa");
                System.out.print("Digite a opção: ");
                opcaoMenu = entrada.nextInt();
                
                if (opcaoMenu!=1 && opcaoMenu!=2 && opcaoMenu!=3 && opcaoMenu!=4) {
                    System.out.println("\nOpção inválida, digite novamente!\n");
                }
            } while (opcaoMenu!=1 && opcaoMenu!=2 && opcaoMenu!=3 && opcaoMenu!=4);
            
            switch (opcaoMenu) {
                case 1:
                    System.out.println("\n-----------------------------\n");
                    
                    // Estrutura de repetição referente a dado inválido
                    do {
                        System.out.print("Digite o seu salário: ");
                        salario = entrada.nextFloat();
                        
                        if (salario <= 0) {
                            System.out.println("Salário inválido, digite novamente!");
                        }
                    } while (salario <= 0);
                    
                    if (salario < 1345) {
                        pctImposto = 5;
                    } else if (salario >= 1345 && salario <= 2286.5) {
                        pctImposto = 10;
                    } else {
                        pctImposto = 15;
                    }
                    
                    vlrImposto = (salario * pctImposto) / 100;
                    
                    System.out.println("\nValor do imposto ("+pctImposto+"%): "+fmtDinheiro.format(vlrImposto));
                    System.out.println("\n-----------------------------\n");
                    break;
                
                case 2:
                    System.out.println("\n-----------------------------\n");
                    
                    // Estrutura de repetição referente a dado inválido
                    do {
                        System.out.print("Digite o seu salário: ");
                        salario = entrada.nextFloat();
                        
                        if (salario <= 0) {
                            System.out.println("Salário inválido, digite novamente!");
                        }
                    } while (salario <= 0);
                    
                    if (salario > 4035) {
                        aumento = 25;
                    } else if (salario >= 2017.5 && salario <= 4035) {
                        aumento = 50;
                    } else if (salario >= 1212 && salario < 2017.5) {
                        aumento = 75;
                    } else {
                        aumento = 100;
                    }
                    
                    novoSalario = salario + aumento;
                    
                    System.out.println("\nAumento: "+fmtDinheiro.format(aumento));
                    System.out.println("Novo salário: "+fmtDinheiro.format(novoSalario));
                    System.out.println("\n-----------------------------\n");
                    break;
                
                case 3:
                    System.out.println("\n-----------------------------\n");
                    
                    // Estrutura de repetição referente a dado inválido
                    do {
                        System.out.print("Digite o seu salário: ");
                        salario = entrada.nextFloat();
                        
                        if (salario <= 0) {
                            System.out.println("Salário inválido, digite novamente!");
                        }
                    } while (salario <= 0);
                    
                    if (salario <= 1883) {
                        classificacao = "Mal remunerado";
                    } else {
                        classificacao = "bem remunerado";
                    }
                    
                    System.out.println("\nClassificação do seu salário: "+classificacao);
                    System.out.println("\n-----------------------------\n");
                    break;
            }
        } while (opcaoMenu != 4);
        
        System.out.println("");
        
        entrada.close();
    }
}
