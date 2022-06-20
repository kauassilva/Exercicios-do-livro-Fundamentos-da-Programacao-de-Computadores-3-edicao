/**
 * @author kauas - 20/04/2022 Quarta
 * Livro: Fundamentos da Programação de Computadores
 * Capítulo 4, Exercício Resolvido 25, pág.89
 */

/*
Faça um programa que receba a medida de um ângulo em graus. Calcule e mostre o
quadrante em que se localiza esse ângulo. Considere os quadrantes da
trigonometria e, para ângulos maiores que 360° ou menores que -360°, reduzi-los,
mostrando também o número de voltas e o sentido da volta (horário ou 
anti-horário).
 */
package capitulo_4.exercicios_resolvidos;

import java.util.Scanner;

public class ExercResolvido25 {

    public static void main(String[] args) {
        // Declaração de variáveis
        Scanner entrada = new Scanner(System.in);
        int angulo, voltas = 0;

        // Coletar dado
        System.out.print("\nDigite o ângulo em graus: ");
        angulo = entrada.nextInt();

        // Desvio condicional referente a voltas
        if (angulo > 360 || angulo < -360) {
            voltas = Math.abs(angulo / 360);
            angulo = angulo - (voltas * 360);
        } else {
            voltas = 0;
        }

        // Desvio condicional referente aos quadrantes
        if (angulo == 0 || angulo == 90 || angulo == 180 || angulo == 270 || angulo == 360
                || angulo == -90 || angulo == -180 || angulo == -270 || angulo == -360) {
            System.out.println("\nEstá acima de algum dos eixos");
        } else if ((angulo > 0 && angulo < 90) || (angulo < -270 && angulo > -360)) {
            System.out.println("\n1º Quadrante");
        } else if ((angulo > 90 && angulo < 180) || (angulo < -180 && angulo > -270)) {
            System.out.println("\n2º Quadrante");
        } else if ((angulo > 180 && angulo < 270) || (angulo < -90 && angulo > -180)) {
            System.out.println("\n3º Quadrante");
        } else if ((angulo > 270 && angulo < 360) || (angulo < 0 && angulo > -90)) {
            System.out.println("\n4º Quadrante");
        }

        // Exibir dado
        System.out.print(voltas + " volta(s) no sentido ");
        
        // Desvio condicional referente ao sentido
        if (angulo < 0) {
            System.out.println("Horário");
        } else {
            System.out.println("Anti-horário");
        }
        
        System.out.println("");

        entrada.close();
    }
}
