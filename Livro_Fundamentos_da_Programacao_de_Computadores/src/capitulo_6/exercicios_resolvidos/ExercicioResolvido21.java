import java.util.Scanner;

/**
 * @author kauas - 17/02/2023 Sexta
 * Livro: Fundamentos da Programação de Computadores
 * Capítulo 6, Exercício Resolvido 21, pág. 183
 */

/*
Faça um programa que leia um conjunto de quinze valores e armazene-os em um vetor. A seguir,
separe-os em dois outros vetores (P e I) com cinco posições cada. O vetor P armazena números pares e o
vetor I, números ímpares. Como o tamanho dos vetores pode não ser suficiente para armazenar todos
os números, deve-se sempre verificar se já estão cheios. Caso P ou I estejam cheios, deve-se mostrá-los
e recomeçar o preenchimento da primeira posição. Terminado o processamento, mostre o conteúdo
restante dentro dos vetores P e I.
*/

public class ExercicioResolvido21 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int[] numeros = new int[15];
        int[] pares = new int[5];
        int[] impares = new int[5];
        int indicePar = 0;
        int indiceImpar = 0;


        // ========== Loop para preencher os vetores e exibi-los quando cheios ==========
        System.out.println("\nDigite 15 números:");
        for (int i=0; i<numeros.length; i++) {
            System.out.print((i+1)+"º: ");
            numeros[i] = scanner.nextInt();

            // Caso seja número par
            if (numeros[i] % 2 == 0) {
                // Caso o vetor não esteja cheio
                if (indicePar < pares.length) {
                    pares[indicePar] = numeros[i];
                    indicePar++;
                } 
                // Caso o vetor esteja cheio
                else {
                    System.out.print("\nO vetor de números pares está cheio. Os números são:");
                    for (int j = 0; j < pares.length; j++) {
                        System.out.print(" "+pares[j]);
                    }
                    System.out.println("\n");

                    indicePar = 0;
                    pares[indicePar] = numeros[i];
                    indicePar++;
                }
            } 
            // Caso seja número ímpar
            else {
                // Caso o vetor não esteja cheio
                if (indiceImpar < impares.length) {
                    impares[indiceImpar] = numeros[i];
                    indiceImpar++;
                }
                // Caso o vetor esteja cheio
                else {
                    System.out.print("\nO vetor de números ímpares está cheio. Os números são:");
                    for (int j = 0; j < impares.length; j++) {
                        System.out.print(" "+impares[j]);
                    }
                    System.out.println("\n");

                    indiceImpar = 0;
                    impares[indiceImpar] = numeros[i];
                    indiceImpar++;
                }
            }
        }

        // Exibi os números pares restantes
        System.out.print("\nNúmeros pares restantes:");
        for (int i = 0; i < indicePar; i++) {
            System.out.print(" "+pares[i]);
        }

        // Exibi os números ímpares restantes
        System.out.print("\nNúmeros ímpares restantes:");
        for (int i = 0; i < indiceImpar; i++) {
            System.out.print(" "+impares[i]);
        }

    }
    
}
