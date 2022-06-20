/**
@author kauas - 31/03/2022 Quinta
Livro: Fundamentos da Programação de Computadores
Capítulo 3, Exercício Proposto 17, pág.51
*/

/*
Faça um programa que receba o raio, calcule e mostre:
a) O comprimento de uma esfera; Sabe-se que C = 2 * π R;
b) A área de uma esfera; Sabe-se que A = π R²;
c) O volume de uma esfera; Sabe-se que V = 3/4 * π R³.
*/
package capitulo_3.exercicios_propostos;

import java.util.Scanner;
import java.text.DecimalFormat;

public class ExercProposto17 {
    
    public static void main(String[] args) {
        // Declaração de variáveis
        Scanner entrada = new Scanner(System.in);
        DecimalFormat casas = new DecimalFormat("0.00");
        float raio, comprimento, area, volume;
        
        // Coletar dado
        System.out.print("Digite o raio: ");
        raio = entrada.nextFloat();
        
        // Operações referentes ao comprimento, área e volume
        comprimento = (float) (2 * Math.PI * raio);
        area = (float) (Math.PI * Math.pow(raio,2));
        volume = (float) (4 * Math.PI * Math.pow(raio,3)) / 3;
        
        // Exibir dados
        System.out.println("\nC = 2 * π * R\nC = 2 * "+casas.format(Math.PI)+" * "+raio+"\nC = "+casas.format(comprimento));
        System.out.println("\nA = π * R²\nA = "+casas.format(Math.PI)+" * "+raio+"²\nA = "+casas.format(area));
        System.out.println("\nV = (4 * π * raio³) / 3\nV = (4 * "+casas.format(Math.PI)+" * "+raio+"³) / 3\nV = "+casas.format(volume));

        entrada.close();
    }
}
