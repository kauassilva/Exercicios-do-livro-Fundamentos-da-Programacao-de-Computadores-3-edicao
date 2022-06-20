/**
@author kauas - 27/03/2022 Domingo
Livro: Fundamentos da Programação de Computadores
Capítulo 3, Exercício Resolvido 2, pág.36
*/

/*
Faça um programa que receba três notas, calcule e mostre a média aritmética.
*/
package capitulo_3.exercicios_resolvidos;

import java.text.DecimalFormat;
import java.util.Scanner;

public class ExercResolvido2 {

    public static void main(String[] args) {
        // Declaração de variáveis
        Scanner entrada = new Scanner(System.in);
        DecimalFormat casas = new DecimalFormat("0.00");
        float nota1, nota2, nota3, media;
        
        // Coletar dados
        System.out.println("Digite as três notas: ");
        nota1 = entrada.nextFloat();
        nota2 = entrada.nextFloat();
        nota3 = entrada.nextFloat();
        
        // Operação referente a média
        media = (nota1+nota2+nota3) / 3;
        
        // Exibir dado
        System.out.println("\nMédia = "+casas.format(media));

        entrada.close();
    }
    
}
