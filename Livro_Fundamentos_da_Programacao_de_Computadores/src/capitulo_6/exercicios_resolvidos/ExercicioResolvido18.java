import java.util.Scanner;

/**
 * @author kauas - 17/02/2023 Sexta
 * Livro: Fundamentos da Programação de Computadores
 * Capítulo 6, Exercício Proposto 18, pág. 180
 */

/*
Faça um programa que receba o número sorteado por um dado de vinte jogadas. Mostre os números
sorteados e a frequência com que aparecem.
*/

public class ExercicioResolvido18 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int[] jogadas = new int[20];
        int i;
        int num1,num2,num3,num4,num5,num6;


        // ========== Loop para preencher os números sorteados pelo dado ==========
        System.out.println();
        for (i=0; i<jogadas.length; i++) {
            do {
                System.out.print("Digite o número sorteado por um dado de seis lados ("+(i+1)+"/20): ");
                jogadas[i] = scanner.nextInt();

                if (jogadas[i] < 1 || jogadas[i] > 6) {
                    System.out.println("\nNúmero inválido!\n");
                }
            } while (jogadas[i] < 1 || jogadas[i] > 6);
        }


        // ========== Loop para exibir os números sorteados ==========
        System.out.println("\nNúmeros sorteados:");
        for (i=0; i<jogadas.length; i++) {
            System.out.println("["+(i+1)+"] - "+jogadas[i]);
        }

        
        // ========== Loop para identificar a frequência dos números sorteados ==========
        num1 = 0;
        num2 = 0;
        num3 = 0;
        num4 = 0;
        num5 = 0;
        num6 = 0;
        for (i=0; i<jogadas.length; i++) {
            if (jogadas[i] == 1) {
                num1++;
            }
            else if (jogadas[i] == 2) {
                num2++;
            }
            else if (jogadas[i] == 3) {
                num3++;
            }
            else if (jogadas[i] == 4) {
                num4++;
            }
            else if (jogadas[i] == 5) {
                num5++;
            }
            else if (jogadas[i] == 6) {
                num6++;
            }
        }

        System.out.println("\nO número 1 foi sorteado "+num1+" vez(es)");
        System.out.println("O número 2 foi sorteado "+num2+" vez(es)");
        System.out.println("O número 3 foi sorteado "+num3+" vez(es)");
        System.out.println("O número 4 foi sorteado "+num4+" vez(es)");
        System.out.println("O número 5 foi sorteado "+num5+" vez(es)");
        System.out.println("O número 6 foi sorteado "+num6+" vez(es)");

    }
    
}
