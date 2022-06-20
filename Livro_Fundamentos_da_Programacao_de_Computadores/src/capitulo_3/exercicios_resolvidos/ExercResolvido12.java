/**
@author kauas - 27/03/2022 Domingo
Livro: Fundamentos da Programação de Computadores
Capítulo 3, Exercício Resolvido 12, pág.43
*/

/*
Faça um programa que receba dois números maiores que zero, calcule e mostre um
elevado ao outro.
*/
package capitulo_3.exercicios_resolvidos;

import java.util.Scanner;
import java.text.DecimalFormat;

public class ExercResolvido12 {

    public static void main(String[] args) {
        // Declaração de variáveis
        Scanner entrada = new Scanner(System.in);
        DecimalFormat casas = new DecimalFormat("0.00");
        float base, expoente, resultado;
        
        // Coletar dados
        System.out.print("Digite um número maior que 0 para a base: ");
        base = entrada.nextFloat();
        System.out.print("digite um núemro maior que 0 para o expoente: ");
        expoente = entrada.nextFloat();
        
        // Operação referente a potenciação
        resultado = (float) Math.pow(base, expoente);
        
        // Exibir dados
        System.out.println(base+"^"+expoente+" = "+casas.format(resultado));

        entrada.close();
    }
    
}
