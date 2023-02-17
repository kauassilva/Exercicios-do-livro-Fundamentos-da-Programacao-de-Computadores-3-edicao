/**
 * @author kauas - 17/02/2023 Sexta
 * Livro: Fundamentos da Programação de Computadores
 * Capítulo 6, Exercício Proposto 25, pág. 189
 */

/*
Faça um programa que gere os dez primeiros números primos acima de 100 e armazene-os em um
vetor. Escreva no final o vetor resultante.
*/

public class ExercicioResolvido25 {
    
    public static void main(String[] args) {
        int[] primos = new int[10];
        int count = 0;
        int num = 101;


        while (count < 10) {
            boolean primo = true;

            for (int i=2; i<=Math.sqrt(num); i++) {
                if (num%i == 0) {
                    primo = false;
                    break;
                }
            }

            if (primo) {
                primos[count] = num;
                count++;
            }
            num++;
        }

        System.out.println("\nOs 10 primeiros números primos acima de 100 são: ");
        for (int i=0; i<primos.length; i++) {
            System.out.print(primos[i]+" ");
        }
        System.out.println();

    }

}
