/**
@author kauas - 27/03/2022 Domingo
Livro: Fundamentos da Programação de Computadores
Capítulo 3, Exercício Resolvido 9, pág.41
*/

/*
Faça um programa que calcule e mostre a área de um triângulo. Sabe-se que:
Área = (base * altura) / 2.
*/
package capitulo_3.exercicios_resolvidos;

import java.util.Scanner;
import java.text.DecimalFormat;

public class ExercResolvido9 {

    public static void main(String[] args) {
        // Declaração de variáveis
        Scanner entrada = new Scanner(System.in);
        DecimalFormat casas = new DecimalFormat("0.00");
        float base, altura, area;
        
        // Coletar dados
        System.out.print("Digite a base do triângulo em centímetros: ");
        base = entrada.nextFloat();
        System.out.print("Digite a altura do triângulo em centímetros: ");
        altura = entrada.nextFloat();
        
        // Operação referente a base
        area = (base * altura) / 2;
        
        // Exibir dado
        System.out.println("\nA área do triângulo é "+casas.format(area)+"cm²");

        entrada.close();
    }
    
}
