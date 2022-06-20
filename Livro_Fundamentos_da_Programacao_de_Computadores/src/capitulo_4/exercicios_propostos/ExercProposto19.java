/**
 * @author kauas - 02/05/2022 segunda
 * Livro: Fundamentos da Programação de Computadores
 * Capítulo 4, Exercício Proposto 19, pág.92
 */

/*
Faça um programa que receba a altura e o sexo de uma pessoa e calcule e mostre
seu peso ideal, utilizando as seguintes fórmulas (onde h é a altura):
- para homens: (72.7 * h) - 58.
- para mulheres: (62.1 * h) - 44.7.
 */
package capitulo_4.exercicios_propostos;

import java.text.DecimalFormat;
import java.util.Scanner;

public class ExercProposto19 {

    public static void main(String[] args) {
        // Declaração de variáveis
        Scanner entrada = new Scanner(System.in);
        DecimalFormat casas = new DecimalFormat("0.00");
        float altura, peso;
        char sexo;

        // Coletar dado
        System.out.print("\nQual o seu sexo?\nM - Masculino\nF - Feminino\n<< ");
        sexo = entrada.nextLine().charAt(0);
        sexo = Character.toLowerCase(sexo);

        // Desvio condicional referente a dado inválido
        if (sexo == 'm' || sexo == 'f') {
            // coletar dado
            System.out.print("Digite sua altura: ");
            altura = entrada.nextFloat();

            // Desvio condicional referente a altura
            if (altura >= 0.7F) {
                // Desvio condicional referente ao peso
                if (sexo == 'm') {
                    peso = (float) ((72.7 * altura) - 58);
                } else {
                    peso = (float) ((62.1 * altura) - 44.7);
                }

                // Exibir dado
                System.out.println("\nSeu peso ideal é " + casas.format(peso) + " kg\n");
            } else {
                System.out.println("\nAltura pequena demais\n");
            }
        } else {
            System.out.println("\nSexo, inválido!\n");
        }

        entrada.close();
    }
}
