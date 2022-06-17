/**
@author kauas - 31/03/2022 Quinta
Livro: Fundamentos da Programação de Computadores
Capítulo 3, Exercício Proposto 16, pág.51
*/

/*
Faça um programa que receba o valor dos catetos de um triângulo, calcule e
mostre o valor da hipotenusa.
*/
package capitulo_3.exercicios_propostos;

import java.util.Scanner;

public class ExercProposto16 {
    
    public static void main(String []args) {
        Scanner entrada = new Scanner(System.in);
        float hipotenusa, catOposto, catAdjacente;
        
        System.out.print("Digite o valor do Cateto Oposto: ");
        catOposto = entrada.nextFloat();
        System.out.print("Digite o valor do Cateto Adjacente: ");
        catAdjacente = entrada.nextFloat();
        
        hipotenusa = (float) (Math.pow(catOposto, 2) + Math.pow(catAdjacente, 2));
        hipotenusa = (float) Math.sqrt(hipotenusa);
        
        System.out.println("c² = a² + b²\nc² = "+catOposto+"² + "+catAdjacente+"²\nc = "+hipotenusa);

        entrada.close();
    }
}
