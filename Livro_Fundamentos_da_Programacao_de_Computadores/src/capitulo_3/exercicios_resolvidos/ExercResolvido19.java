/**
@author kauas - 27/03/2022 Domingo
Livro: Fundamentos da Programação de Computadores
Capítulo 3, Exercício Resolvido 19, pág.46
*/

/*
Cada degrau de uma escada tem x de altura. Faça um programa que receba essa
altura e a altura que o usuário deseja alcançar subindo a escada, calcule e
mostre quantos degraus ele deverá subir para atingir seu objetivo, sem se
preocupar com a altura do usuário. Todas as medidas fornecidas devem estar em
metros.
[imagem no livro| pág.46]
*/
package capitulo_3.exercicios_resolvidos;

import java.util.Scanner;
import java.text.DecimalFormat;

public class ExercResolvido19 {

    public static void main(String[] args) {
        // Declaração de variáveis
        Scanner entrada = new Scanner(System.in);
        DecimalFormat casas = new DecimalFormat("0.00");
        float altDegrau, altFinal, quantDegrau;
        
        // Coletar dados
        System.out.print("digite a altura em metros de um degrau: ");
        altDegrau = entrada.nextFloat();
        System.out.print("Digite a altura em metros que deseja alcançar: ");
        altFinal = entrada.nextFloat();
        
        // Operação referente a quantidade de degraus
        quantDegrau = altFinal / altDegrau;
        
        // Exibir dado
        System.out.println("\nvocê deverá subir "+casas.format(quantDegrau)+" degrau(s) para alcançar a altura desejada");

        entrada.close();
    }
    
}
