/**
@author kauas - 01/04/2022 Sexta
Livro: Fundamentos da Programação de Computadores
Capítulo 3, Exercício Proposto 20, pág.51
*/

/*
Faça um programa que receba a medida do ângulo formado por uma escada apoiada no
chão e a distância em que a escada está da parede, calcule e mostre a medida da
escada para que se possa alcançar sua ponta.
[imagem | pág.51].
*/
package capitulo_3.exercicios_propostos;

import java.util.Scanner;
import java.text.DecimalFormat;

public class ExercProposto20 {
    
    public static void main(String[] args) {
        // Declaração de variáveis
        Scanner entrada = new Scanner(System.in);
        DecimalFormat casas = new DecimalFormat("0.00");
        float angBase, distancia, hipotenusa;

        // Coletar dados
        System.out.print("Digite o ângulo: ");
        angBase = entrada.nextFloat();
        System.out.print("Digite a distância: ");
        distancia = entrada.nextFloat();

        // Operação referente a hipotenusa
        hipotenusa = (float) (distancia / Math.cos(angBase));

        // Exibir dado
        System.out.println("\nMedida da escada: "+casas.format(hipotenusa)+"m");

        entrada.close();
    }
}
