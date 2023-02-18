/**
 * @author kauas - 02/02/2023 Quinta
 * Livro: Fundamentos da Programação de Computadores
 * Capítulo 6, Exercício Resolvido 14, pág. 175
 */

/*
Faça um programa que preencha três vetores com cinco posições cada. O primeiro vetor receberá os
nomes de cinco funcionários; o segundo e o terceiro vetor receberão, respectivamente, o salário e o
tempo de serviço de cada um. Mostre um primeiro relatório apenas com os nomes dos funcionários
que não terão aumento; mostre um segundo relatório apenas com os nomes e os novos salários dos
funcionários que terão aumento. Sabe-se que os funcionários que terão direito ao aumento são aqueles
que possuem tempo de serviço superior a cinco anos ou salário inferior a R$ 800,00. Sabe-se, ainda,
que, se o funcionário satisfazer às duas condições anteriores, tempo de serviço e salário, o aumento
será de 35%; para o funcionário apenas à condição tempo de serviço, o aumento será de
25%; para aquele que satisfazer apenas à condição salário, o aumento será de 15%.
*/

import java.util.Scanner;

public class ExercicioResolvido14 {
    
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int qtdFuncionario = 5;
        String[] nome = new String[qtdFuncionario];
        double[] salario = new double[qtdFuncionario];
        int[] tempoServico = new int[qtdFuncionario];
        int i;
        int pct = 0;


        // ========== Loop para preencher os dados dos funcionarios ==========
        for (i=0; i<qtdFuncionario; i++) {
            System.out.println("\nDados do funcionário ("+(i+1)+"/"+qtdFuncionario+")");

            System.out.print("Digite o nome do funcionário: ");
            nome[i] = scanner.nextLine();

            System.out.print("Digite o salário do funcionário: ");
            salario[i] = scanner.nextDouble();

            System.out.print("Digite o tempo de serviço do funcionário (em anos): ");
            tempoServico[i] = scanner.nextInt();
            scanner.nextLine();
        }


        // ========== Loop para descobrir qual funcionário não tem direito a aumento ==========
        System.out.println("\n-----------------------------------------------------");
        System.out.println("\nFuncionários que não tem direito a aumento");
        for (i=0; i<qtdFuncionario; i++) {
            if (tempoServico[i] <= 5 && salario[i] >= 800) {
                System.out.println("- "+nome[i]);
            }
        }


        // ========== Loop para atribuit aumento aos funcionários ==========
        System.out.println("\n-----------------------------------------------------\n");
        for (i=0; i<qtdFuncionario; i++) {
            if (tempoServico[i] > 5 && salario[i] < 800) {
                pct = 35;
                salario[i] = salario[i]+((salario[i]*pct)/100);
            } else if (tempoServico[i] > 5) {
                pct = 25;
                salario[i] = salario[i]+((salario[i]*pct)/100);
            } else if (salario[i] < 800) {
                pct = 15;
                salario[i] = salario[i]+((salario[i]*pct)/100);
            }

            System.out.println("O funcionário "+nome[i]+" teve seu salário aumentado para R$ "+salario[i]+" (aumento de "+pct+"%)");
        }

    }

}
