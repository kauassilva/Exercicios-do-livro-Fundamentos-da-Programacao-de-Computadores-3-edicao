/**
 * @author kauas - 23/04/2022 sábado
 * Livro: Fundamentos da Programação de Computadores
 * Capítulo 4, Exercício Proposto 2, pág.90
 */

/*
Faça um programa que receba duas notas, calcule e mostre a média aritmética e a
mensagem que se encontra na tabela a seguir:
[imagem, pág. 90]
 */
package capitulo_4.exercicios_propostos;

import java.text.DecimalFormat;
import java.util.Scanner;

public class ExercProposto2 {

    public static void main(String[] args) {
        // Declaração de variáveis
        Scanner entrada = new Scanner(System.in);
        DecimalFormat casas = new DecimalFormat("0.00");
        float nota1, nota2, media;
        String mensagem;

        // Coletar dados
        System.out.println("\nDigite a nota das duas avaliações:");
        nota1 = entrada.nextFloat();
        nota2 = entrada.nextFloat();

        // Operação referente a média
        media = (nota1 + nota2) / 2;

        // Desvio condicional para coleta de dado referente a mensagem
        if (media >= 0 && media < 3) {
            mensagem = "Reprovado";
        } else if (media >= 3 && media < 7) {
            mensagem = "Exame";
        } else if (media >= 7 && media <= 10) {
            mensagem = "Aprovado";
        } else {
            mensagem = "Nota inválida";
        }

        // Exibir dados
        System.out.println("\nMédia: " + casas.format(media));
        System.out.println("Situação: " + mensagem + "\n");

        entrada.close();
    }
}
