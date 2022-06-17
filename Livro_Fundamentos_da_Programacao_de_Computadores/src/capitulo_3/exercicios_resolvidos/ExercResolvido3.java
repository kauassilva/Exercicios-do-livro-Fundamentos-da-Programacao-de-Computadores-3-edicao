/**
@author kauas - 27/03/2022 Domingo
Livro: Fundamentos da Programação de Computadores
Capítulo 3, Exercício Resolvido 3, pág.38
*/

/*
Faça um programa que receba três notas e seus respectivos pesos, calcule e
mostre a média ponderada.
*/
package capitulo_3.exercicios_resolvidos;

import java.util.Scanner;
import java.text.DecimalFormat;

public class ExercResolvido3 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        DecimalFormat casas = new DecimalFormat("0.00");
        float nota1, nota2, nota3, peso1, peso2, peso3, media;
        
        System.out.println("Digite a primeira nota e seu peso: ");
        nota1 = entrada.nextFloat();
        peso1 = entrada.nextFloat();
        System.out.println("Digite a segunda nota e seu peso: ");
        nota2 = entrada.nextFloat();
        peso2 = entrada.nextFloat();
        System.out.println("Digite a terceira nota e seu peso: ");
        nota3 = entrada.nextFloat();
        peso3 = entrada.nextFloat();
        
        media = (nota1*peso1 + nota2*peso2 + nota3*peso3) / (peso1+peso2+peso3);
        
        System.out.println("Média = "+casas.format(media));

        entrada.close();
    }
    
}
