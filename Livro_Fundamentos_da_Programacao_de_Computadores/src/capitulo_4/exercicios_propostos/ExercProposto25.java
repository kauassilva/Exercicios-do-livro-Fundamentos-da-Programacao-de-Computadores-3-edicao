/**
 * @author kauas - 03/05/2022 segunda
 * Livro: Fundamentos da Programação de Computadores
 * Capítulo 4, Exercício Proposto 25, pág.93
 */

/*
Uma empresa decidiu dar uma gratificação de Natal a seus funcionários,
baseada no número de horas extras e no número de horas que o funcionário
faltou o trabalho. O valor do prêmio é obtido pela consulta à tabela que se 
segue na qual:
H = número de horas extras - (2/3 * (números de horas falta))
[imagem, pág. 94]
 */
package capitulo_4.exercicios_propostos;

import java.text.DecimalFormat;
import java.util.Scanner;

public class ExercProposto25 {

    public static void main(String[] args) {
        // Declaração de variáveis
        Scanner entrada = new Scanner(System.in);
        DecimalFormat casas = new DecimalFormat("0.00");
        int premio, horaExtra, horaFaltou, min;
        float h;

        // Coletar dados
        System.out.print("\nDigite a quantidade de horas extras trabalhadas: ");
        horaExtra = entrada.nextInt();
        System.out.print("Digite a quantidade de horas que o funcionário faltou ao trabalho: ");
        horaFaltou = entrada.nextInt();

        // Operações referentes ao minuto
        h = horaExtra - ((2 / 3F) * horaFaltou);
        min = (int) (h * 60);

        // Desvio condicional referente ao prêmio
        if (min >= 2400) {
            premio = 500;
        } else if (min >= 1800 && min < 2400) {
            premio = 400;
        } else if (min >= 1200 && min < 1800) {
            premio = 300;
        } else if (min >= 600 && min < 1200) {
            premio = 200;
        } else if (min > 0 && min < 600) {
            premio = 100;
        } else {
            premio = 0;
        }

        // Exibir dado
        System.out.println("\nPrêmio: R$ " + casas.format(premio) + "\n");

        entrada.close();
    }
}
