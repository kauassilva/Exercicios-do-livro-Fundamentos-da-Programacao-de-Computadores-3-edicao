/**
@author kauas - 31/03/2022 Quinta
Livro: Fundamentos da Programação de Computadores
Capítulo 3, Exercício Proposto 19, pág.51
*/

/*
Sabe-se que, para iluminar de maneira correta os cômodos de uma casa, para cada
m², deve-se usar 18 W de potência. Faça um programa que receba as duas dimensões
de um cômodo (em metros), calcule e mostre a sua área (em m²) e a potência de
iluminação que deverá ser utilizada.
*/
package capitulo_3.exercicios_propostos;

import java.util.Scanner;
import java.text.DecimalFormat;

public class ExercProposto19 {
    
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        DecimalFormat casas = new DecimalFormat("0.00");
        float dimen1, dimen2, area, pot;
        
        System.out.println("Digite as dimensões em metros de um cômodo: ");
        dimen1 = entrada.nextFloat();
        dimen2 = entrada.nextFloat();
        
        area = dimen1 * dimen2;
        pot = 18 * area;
        
        System.out.println("Área do cômodo: "+casas.format(area)+"m²");
        System.out.println("Potêcia necessária: "+casas.format(pot)+"W");

        entrada.close();
    }
}
