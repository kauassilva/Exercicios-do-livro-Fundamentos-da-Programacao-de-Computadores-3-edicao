/**
@author kauas - 27/03/2022 Domingo
Livro: Fundamentos da Programação de Computadores
Capítulo 3, Exercício Resolvido 10, pág.41
*/

/*
Faça um programa que calcule e mostre a área de um círculo. Sabe-se que:
Área = π * R^2.
*/
package capitulo_3.exercicios_resolvidos;

import java.util.Scanner;
import java.text.DecimalFormat;

public class ExercResolvido10 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        DecimalFormat casas = new DecimalFormat("0.00");
        float raio, area;
        
        System.out.print("Digite o raio do círculo em metros: ");
        raio = entrada.nextFloat();
        
        area = (float) (Math.PI * Math.pow(raio,2));
        
        System.out.println("Área do círculo: "+casas.format(area)+"m");

        entrada.close();
    }
    
}
