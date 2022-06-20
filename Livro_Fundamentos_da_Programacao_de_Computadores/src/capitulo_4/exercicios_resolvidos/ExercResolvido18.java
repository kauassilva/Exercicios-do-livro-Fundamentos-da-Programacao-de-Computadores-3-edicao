/**
 * @author kauas - 18/04/2022 Segunda
 * Livro: Fundamentos da Programação de Computadores
 * Capítulo 4, Exercício Resolvido 18, pág.79
 */

/*
Dados três valorez X, Y e Z, verifique se eles podem ser comprimentos dos
lados de um triângulo e, se forem, verifique se é um triângulo equilátero,
isósceles ou escaleno. Se eles não formarem um triângulo, escreva uma
mensagem. Considere que:

- O comprimento de cada lado de um triângulo é menor que a soma dos dois
  lados;
- Chama-se equilátero o triângulo que tem três lados iguais;
- Denomina-se isósceles o triângulo que tem o comprimento de dois lados
  iguais;
- Recebe o nome do escaleno o triângulo que tem os três lados diferentes.
 */
package capitulo_4.exercicios_resolvidos;

import java.util.Scanner;

public class ExercResolvido18 {

    public static void main(String[] args) {
        //Declaração de variáveis
        Scanner entrada = new Scanner(System.in);
        float x, y, z;

        // Coletar dados
        System.out.println("Digite as medidas dos três lados do triângulo:");
        x = entrada.nextFloat();
        y = entrada.nextFloat();
        z = entrada.nextFloat();

        // Desvio condicional referentes ao tipo de triângulo
        if (x < y + z && y < z + x && z < x + y) {
            if (x == y && y == z) {
                System.out.println("Triângulo Equilátero");
            } else if ((x == y || x == z || y == z)) {
                System.out.println("Triângulo Isósceles");
            } else if (x != y && y != z && z != x) {
                System.out.println("Triângulo Escaleno");
            }
        } else {
            System.out.println("As medidas não formam um triângulo");
        }

        entrada.close();
    }
}
