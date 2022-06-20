/**
@author kauas - 31/03/2022 Quinta
Livro: Fundamentos da Programação de Computadores
Capítulo 3, Exercício Proposto 11, pág.51
*/

/*
Faça um programa que calcule e mostre a área de um losango. Sabe-se que:
Área = (DiagonalMaior * diagonalMenor) / 2.
*/
package capitulo_3.exercicios_propostos;

import java.text.DecimalFormat;
import java.util.Scanner;

public class ExercProposto11 {

    public static void main(String[] args) {
        // Declaração de variáveis
        Scanner entrada = new Scanner(System.in);
        DecimalFormat casas = new DecimalFormat("0.000");
        float area, diagMaior, diagMenor;
        
        // Coletar dados
        System.out.print("Digite o valor da diagonal maior: ");
        diagMaior = entrada.nextFloat();
        System.out.print("Digite o valor da diagonal menor: ");
        diagMenor = entrada.nextFloat();
        
        // Cálculo referente a área
        area = (diagMaior * diagMenor) / 2;
        
        // Exibir dado
        System.out.println("A = (D * d) / 2\nA = ("+diagMaior+" * "+diagMenor+") / 2\nA = "+casas.format(area)+"cm");

        entrada.close();
    }
}
