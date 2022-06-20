/**
@author kauas - 31/03/2022 Quinta
Livro: Fundamentos da Programação de Computadores
Capítulo 3, Exercício Proposto 9, pág.51
*/

/*
Faça um programa que calcule e mostre a área de um trapézio.
Área = ((BaseMaior + baseMenor) * altura) / 2
*/
package capitulo_3.exercicios_propostos;

import java.util.Scanner;

public class ExercProposto9 {
    
    public static void main(String[] args) {
        // Declaração de variáveis
        Scanner entrada = new Scanner(System.in);
        float area, bMaior, bMenor, altura;
        
        // Coletar dados
        System.out.print("Digite o valor da Base maior: ");
        bMaior = entrada.nextFloat();
        System.out.print("Digite o valor da Base menor: ");
        bMenor = entrada.nextFloat();
        System.out.print("Digite o valor da altura: ");
        altura = entrada.nextFloat();
        
        // Calculo referente a área
        area = ((bMaior + bMenor) * altura) / 2;
        
        // Exibir dado
        System.out.println("A = ((B + b) * h) / 2\nA = (("+bMaior+" + "+bMenor+") * "+altura+") / 2\nA = "+area+"cm");

        entrada.close();
    }
}
