/**
 * @author kauas - 23/04/2022 sábado
 * Livro: Fundamentos da Programação de Computadores
 * Capítulo 4, Exercício Proposto 1, pág.90
 */

/*
Faça um programa que receba quatro notas de um aluno, calcule e mostre a média
aritmética das notas e a mensagem de aprovado ou reprovado, considerando para
aprovação média 7.
 */
package capitulo_4.exercicios_propostos;

import java.text.DecimalFormat;
import java.util.Scanner;

public class ExercProposto1 {

    public static void main(String[] args) {
        // Declaração de variáveis
        Scanner entrada = new Scanner(System.in);
        DecimalFormat casas = new DecimalFormat("0.00");
        float nota1, nota2, nota3, nota4, media;
        String mensagem;

        // Coletar dados
        System.out.println("\nDigite a nota das quatros avaliações:");
        nota1 = entrada.nextFloat();
        nota2 = entrada.nextFloat();
        nota3 = entrada.nextFloat();
        nota4 = entrada.nextFloat();

        // operação referente a media
        media = (nota1 + nota2 + nota3 + nota4) / 4;

        // Desvio condicional para coleta de dado referente a mensagem
        if (media >= 7) {
            mensagem = "Aprovado";
        } else if (media < 7 && media >= 0) {
            mensagem = "Reprovado";
        } else {
            mensagem = "Nota inválida";
        }

        // Exibir dados
        System.out.println("\nMédia: " + casas.format(media));
        System.out.println("Situação: " + mensagem + "\n");

        entrada.close();
    }
}
