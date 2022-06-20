/**
@author kauas - 27/03/2022 Domingo
Livro: Fundamentos da Programação de Computadores
Capítulo 3, Exercício Resolvido 23, pág.49
*/

/*
Faça um programa que receba um número real, encontre e mostre:
a) A parte inteira desse número;
b) A parte fracionária desse número;
c) O arredondamento desse número;
*/
package capitulo_3.exercicios_resolvidos;

import java.util.Scanner;
import java.text.DecimalFormat;

public class ExercResolvido23 {

    public static void main(String[] args) {
        // Declaração de variáveis
        Scanner entrada = new Scanner(System.in);
        DecimalFormat casas = new DecimalFormat("0.00");
        float num, numFra;
        int numInt, numArr1, numArr2;
        
        // Coletar dado
        System.out.print("digite um número real: ");
        num = entrada.nextFloat();
        
        // Operações referentes a parte inteira, fracionária e arredondamento do número
        numInt = (int) num;
        numFra = num - numInt;
        numArr1 = (int) Math.ceil(num);
        numArr2 = (int) Math.floor(num);
        
        // Exibir dados
        System.out.println("\nParte inteira: "+numInt);
        System.out.println("Parte fracionária: "+casas.format(numFra));
        System.out.println("Número arredondado para cima: "+numArr1);
        System.out.println("Número arredondado para baixo: "+numArr2);

        entrada.close();
    }
    
}
