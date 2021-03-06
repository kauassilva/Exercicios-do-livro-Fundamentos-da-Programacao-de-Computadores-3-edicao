/**
 * @author kauas - 23/04/2022 sábado
 * Livro: Fundamentos da Programação de Computadores
 * Capítulo 4, Exercício Proposto 8, pág.90
 */

/*
Faça um programa para calcular e mostrar o salário reajustado de um funcionário.
O percentual de aumento encontra-se na tabela a seguir.
[imagem, pág.90]
 */
package capitulo_4.exercicios_propostos;

import java.text.DecimalFormat;
import java.util.Scanner;

public class ExercProposto8 {

    public static void main(String[] args) {
        // Declaração de variáveis
        Scanner entrada = new Scanner(System.in);
        DecimalFormat casas = new DecimalFormat("0.00");
        float sal, salReajustado, aumento;
        int porcentagem;

        // Coletar dado
        System.out.print("Digite o salário: ");
        sal = entrada.nextFloat();

        // Desvio condicional referente a dado inválido
        if (sal > 0) {
            // Desvio condicional referente a porcentagem
            if (sal <= 300) {
                porcentagem = 35;
            } else {
                porcentagem = 15;
            }

            // Operação referente ao novo salário
            aumento = (sal * porcentagem) / 100;
            salReajustado = sal + aumento;

            // Exibir dado
            System.out.println("Novo salário: R$ " + casas.format(salReajustado));
        } else {
            System.out.println("Salário inválido");
        }

        entrada.close();
    }
}
