/**
@author kauas - 28/03/2022 Segunda
Livro: Fundamentos da Programação de Computadores
Capítulo 3, Exercício Proposto 4, pág.50
*/

/*
Faça um programa que receba duas notas, calcule e mostre a média ponderada
dessas notas, considerando peso 2 para a primeira e peso 3 para a segunda.
*/
package capitulo_3.exercicios_propostos;

import java.util.Scanner;

public class ExercProposto4 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        float nota1, nota2, media;
        
        System.out.println("Digite duas notas: ");
        nota1 = entrada.nextFloat();
        nota2 = entrada.nextFloat();
        
        media = (nota1*2 + nota2*3) / (2+3);
        
        System.out.println("Média: "+media);

        entrada.close();
    }
    
}
