/**
 * @author kauas - 23/04/2022 sábado
 * Livro: Fundamentos da Programação de Computadores
 * Capítulo 4, Exercício Proposto 7, pág.90
 */

/*
Uma empresa decide dar um aumento de 30% aos funcionários com salários 
inferiores a R$ 500,00. Faça um programa que receba o salário do funcionário e
mostre o valor do salário reajustado ou uma mensagem, caso ele não tenha direito
ao aumento.
 */
package capitulo_4.exercicios_propostos;

import java.text.DecimalFormat;
import java.util.Scanner;

public class ExercProposto7 {

    public static void main(String[] args) {
        // Declaração de variáveis
        Scanner entrada = new Scanner(System.in);
        DecimalFormat casas = new DecimalFormat("0.00");
        float sal, salReajustado, aumento;
        int porcentagem;

        // Coletar dado
        System.out.print("\nDigite o salário: ");
        sal = entrada.nextFloat();

        // Desvio condicional referente a dado inválido
        if (sal > 0) {
            // Desvio condicional referente ao salário
            if (sal < 500) {
                porcentagem = 30;
                aumento = (sal * porcentagem) / 100;
                salReajustado = sal + aumento;
                
                // Exibir dados
                System.out.println("\nAumento (" + porcentagem + "%): R$ " + casas.format(aumento));
                System.out.println("Salário reajustado: R$ " + casas.format(salReajustado) + "\n");
            } else {
                System.out.println("\nNão possui direito a um aumento\n");
            }
        } else {
            System.out.println("\nSalário inválido\n");
        }

        entrada.close();
    }
}
