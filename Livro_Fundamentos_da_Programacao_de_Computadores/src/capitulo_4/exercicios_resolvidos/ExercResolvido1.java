/**
@author kauas - 14/04/2022 Quinta
Livro: Fundamentos da Programação de Computadores
Capítulo 4, Exercício Resolvido 1, pág.61
*/

/*
A nota final de um estudante é calculada a partir de três notas atribuídas,
respectivamente, a um trabalho de laboratório, a uma avaliação semestral e a um
exame final. A média das três notas mencionadas obedece aos pesos a seguir:
[imagem, pág. 61]

Faça um programa que receba as três notas, calcule e mostre a média ponderada e
o conceito que segue a tabela:
[imagem, pág. 61]
*/
package capitulo_4.exercicios_resolvidos;

import java.util.Scanner;

public class ExercResolvido1 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        float nota1, nota2, nota3, media;

        System.out.print("Digite a nota do Trabalho de laboratório: ");
        nota1 = entrada.nextFloat();
        System.out.print("Digite a nota da Avaliação semestral: ");
        nota2 = entrada.nextFloat();
        System.out.print("Digite a nota do Exame final: ");
        nota3 = entrada.nextFloat();

        media = (nota1 * 2 + nota2 * 3 + nota3 * 5) / 10;
        System.out.println("\nMédia: " + media);

        if (media >= 8 && media <= 10) {
            System.out.println("Conceito: A");
        } else if (media >= 7 && media < 8) {
            System.out.println("Conceito: B");
        } else if (media >= 6 && media < 7) {
            System.out.println("Conceito: C");
        } else if (media >= 5 && media < 6) {
            System.out.println("Conceito: D");
        } else if (media >= 0 && media < 5) {
            System.out.println("Conceito: E");
        } else {
            System.out.println("Algo inesperado ocorreu...");
        }

        entrada.close();
    }
}
