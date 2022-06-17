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
        Scanner entrada = new Scanner(System.in);
        DecimalFormat casas = new DecimalFormat("0.00");
        double num, numInt, numFra, numArr1, numArr2;
        
        System.out.print("digite um número real: ");
        num = entrada.nextDouble();
        
        numInt = (int) num;
        numFra = num - numInt;
        numArr1 = Math.ceil(num);
        numArr2 = Math.floor(num);
        
        System.out.println("Parte inteira: "+numInt);
        System.out.println("Parte fracionária: "+casas.format(numFra));
        System.out.println("Número arredondado para cima: "+numArr1);
        System.out.println("Número arredondado para baixo: "+numArr2);

        entrada.close();
    }
    
}
