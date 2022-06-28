/**
 * @author kauas - 28/06/2022 Terça
 * Livro: Fundamentos da Programação de Computadores
 * Capítulo 5, Exercício Resolvido 16, pág. 134
 */

/*
Faça um programa para calcular a área de um triângulo e que não permita entrada
de dados inválidos, ou seja, medidas menores ou iguais a 0.
*/
package capitulo_5.exercicios_resolvidos;

import java.util.Scanner;

public class ExercicioResolvido16 {
    
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        float area, base, altura, multiplicacao;
        
        base = 0;
        altura = 0;
        
        // Estrutura de repetição referente a dado inválido
        do {
            System.out.print("Digite um valor para a base do triângulo: ");
            base = entrada.nextFloat();
            
            if (base <= 0) {
                System.out.println("\nPara formar um triângulo, a base do triângulo deve ser maior que 0!\n");
            }
        } while (base <= 0);
        
        // Estrutura de repetição referente a dado inválido
        do {            
            System.out.print("Digite um valor para a altura do triângulo: ");
            altura = entrada.nextFloat();
            
            if (altura <= 0) {
                System.out.println("\nPara formar um triângulo, a altura do triângulo deve ser maior que 0!\n");
            }
        } while (altura <= 0);
        
        multiplicacao = base * altura;
        area = multiplicacao / 2;
        
        System.out.println("\n\na -> Área   b -> Base   h -> Altura\n");
        System.out.println("a = (b * h) / 2");
        System.out.println("a = ("+base+" * "+altura+") / 2");
        System.out.println("a = "+multiplicacao+" / 2");
        System.out.println("a = "+area+" m²");
    }
}
