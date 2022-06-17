/**
@author kauas - 18/04/2022 Segunda
Livro: Fundamentos da Programação de Computadores
Capítulo 4, Exercício Resolvido 17, pág.78
*/

/*
Faça um programa para resolver equações do 2º grau.

ax² + bx + c = 0
A variável a deve ser diferente de zero.
∆ = b² -4 * a * c
∆ < 0 -> não existe raiz real
∆ = 0 -> existe uma raiz real
x = (-b) / (2 * a)
∆ > 0 -> existem duas raízes reais
x1 = (-b + ²√∆) / (2 * a)
x2 = (-b - ²√∆) / (2 * a)
*/
package capitulo_4.exercicios_resolvidos;

import java.util.Scanner;

public class ExercResolvido17 {

  public static void main(String[] args) {
    Scanner entrada = new Scanner(System.in);
    float a, b, c, delta, x1, x2;

    System.out.print("\nDigite o valor de 'a': ");
    a = entrada.nextFloat();
    System.out.print("Digite o valor de 'b': ");
    b = entrada.nextFloat();
    System.out.print("Digite o valor de 'c': ");
    c = entrada.nextFloat();

    delta = (float) Math.pow(b,2) - (4 * a * c);
    System.out.println("\nDelta = "+delta);

    if (delta < 0) {
      System.out.println("\nDelta é menor que 0. Não existe raiz real\n");
    } else if (delta == 0) {
      x1 = (-b) / (2*a);
      System.out.println("\nExiste uma raiz real");
      System.out.println("x = "+x1+"\n");
    } else {
      System.out.println("\nExiste duas raízes reais");
      x1 = (float) ((-b + Math.sqrt(delta)) / (2*a));
      x2 = (float) ((-b - Math.sqrt(delta)) / (2*a));
      System.out.println("x1 = "+x1);
      System.out.println("x2 = "+x2+"\n");
    }

    entrada.close();
  }
}