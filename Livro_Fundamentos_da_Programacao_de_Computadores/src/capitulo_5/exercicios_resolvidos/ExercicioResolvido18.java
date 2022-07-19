/**
 * @author kauas - 28/06/2022 Terça
 * Livro: Fundamentos da Programação de Computadores
 * Capítulo 5, Exercício Resolvido 18, pág. 136
 */

/*
Faça um programa que leia um conjunto não determinado de valores e mostre o
valor lido, seu quadrado, seu cubo e sua raiz quadrada. Finalize a entrada de
dados com um valor negativo ou zero.
*/
package capitulo_5.exercicios_resolvidos;

import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

public class ExercicioResolvido18 {
    
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        Locale localBR = new Locale("pt","BR");
        
        NumberFormat fmtNumero = NumberFormat.getNumberInstance(localBR);
        
        float num, quadrado, cubo, raizQuadrada;
        
        do {
            System.out.print("\nDigite um número: ");
            num = entrada.nextFloat();
            
            quadrado = (float) Math.pow(num, 2);
            cubo = (float) Math.pow(num, 3);
            raizQuadrada = (float) Math.sqrt(num);
            
            System.out.println("\nValor digitado: "+fmtNumero.format(num));
            System.out.println("Seu quadrado: "+fmtNumero.format(quadrado));
            System.out.println("Seu cubo: "+fmtNumero.format(cubo));
            System.out.println("Sua raiz quadrada: "+fmtNumero.format(raizQuadrada));
            
            System.out.print("\n\nPara encerrar digite um número menor ou igual a 0. Se quiser usar o sistema novamente, digite um número maior que 0!\n<< ");
            num = entrada.nextFloat();
        } while (num > 0);
        
        entrada.close();
    }
}
