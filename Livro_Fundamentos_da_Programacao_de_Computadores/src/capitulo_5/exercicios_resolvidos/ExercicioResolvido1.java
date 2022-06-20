/**
 * @author kauas - 10/05/2022 terça
 * Livro: Fundamentos da Programação de Computadores
 * Capítulo 5, Exercício Resolvido 1, pág.117
 */

/*
Um funcionário de uma empresa recebe, anualmente, aumento salarial. Sabe-se que:
a) Esse funcionário foi contratado em 2005, com salário inicial de R$ 1000,00.
b) Em 2006, ele recebeu aumento de 1,5% sobre seu salário inicial.
c) A partir de 2007 (inclusive), os aumentos salarios sempre correspondem ao
dobro do percentual do ano anterior.

Faça um programa que determine o salário atual desse funcionário.
 */
package capitulo_5.exercicios_resolvidos;

import java.util.Scanner;
import java.text.DecimalFormat;

public class ExercicioResolvido1 {

    public static void main(String[] args) {
        // Declaração de variáveis
        Scanner entrada = new Scanner(System.in);
        DecimalFormat casas = new DecimalFormat("0.00");
        int anoAtual;
        float slrInicial = 1000, novoSalario, percentual;

        // Coletar dado
        System.out.print("Digite o ano atual: ");
        anoAtual = entrada.nextInt();

        // Operações referentes ao novo salário
        percentual = 1.5F / 100;
        novoSalario = slrInicial + percentual * slrInicial;

        // Laço de repetição referente ao novo salário
        for (int i = 2007; i <= anoAtual; i++) {
            novoSalario = novoSalario * 2;
        }

        // Exibir dado
        System.out.println("O novo salário do funcionário é: R$ " + casas.format(novoSalario));
        
        entrada.close();
    }
}
