/**
@author kauas - 27/03/2022 Domingo
Livro: Fundamentos da Programação de Computadores
Capítulo 3, Exercício Resolvido 11, pág.42
*/

/*
Faça um programa que receba um número maior que zero, calcule e mostre:
a) O número digitado ao quadrado;
b) O número digitado ao cubo;
c) A raiz quadrada do número digitado;
d) A raiz cúbica do número digitado;
*/
package capitulo_3.exercicios_resolvidos;

import java.util.Scanner;
import java.text.DecimalFormat;

public class ExercResolvido11 {

    public static void main(String[] args) {
        // Declaração de variáveis
        Scanner entrada = new Scanner(System.in);
        DecimalFormat casas = new DecimalFormat("0.00");
        float num, quadrado, cubo, raiz2, raiz3;
        
        // Coletar dado
        System.out.print("Digite um número maior que 0: ");
        num = entrada.nextFloat();
        
        // Operação referente ao quadrado, cubo e raizes
        quadrado = (float) Math.pow(num,2);
        cubo = (float) Math.pow(num,3);
        raiz2 = (float) Math.sqrt(num);
        raiz3 = (float) Math.cbrt(num);
        
        // Exibir dados
        System.out.println("Ao quadrado: "+casas.format(quadrado));
        System.out.println("ao cubo: "+casas.format(cubo));
        System.out.println("Raíz quadrada: "+casas.format(raiz2));
        System.out.println("Raíz cúbica: "+casas.format(raiz3));

        entrada.close();
    }
    
}
