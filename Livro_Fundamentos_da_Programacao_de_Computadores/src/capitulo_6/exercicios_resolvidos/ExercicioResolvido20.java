import java.util.Scanner;

/**
 * @author kauas - 17/02/2023 Sexta
 * Livro: Fundamentos da Programação de Computadores
 * Capítulo 6, Exercício Resolvido 20, pág. 183
 */

/*
Faça um programa que leia um vetor com cinco posições para números reais e, depois, um código
inteiro. Se o código for zero, finalize o programa; se for 1, mostre o vetor na ordem direta; se for 2, mostre o vetor na ordem inversa.
*/

public class ExercicioResolvido20 {
    
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        double[] vetor = new double[5];
        int cod;
        int i, j;
        double aux;


        // ========== Loop para preencher o vetor ==========
        System.out.println();
        for (i=0; i<vetor.length; i++) {
            System.out.print("Digite um número ("+(i+1)+"/5): ");
            vetor[i] = scanner.nextDouble();
        }


        System.out.println("\n\nEscolha uma destas opções:");
        System.out.println("\n1 - Mostrar o vetor na ordem direta\n2 - Mostrar o vetor na ordem inversa\n0 - Sair");
        System.out.print("Sua escolha: ");
        cod = scanner.nextInt();


        // ========== Opção 1 ==========
        if (cod == 1) {
            System.out.print("\nVetor na ordem direta: ");
            for (i=0; i<vetor.length; i++) {
                System.out.print(vetor[i]+", ");
            }
        } 
        // ========== Opção 2 ==========
        else if (cod == 2) {            
            System.out.print("\nVetor na ordem inversa: ");
            for (i=4; i>=0; i--) {
                System.out.print(vetor[i]+", ");
            }
        }
        // ========== Opção 0 ========== 
        else {
            System.exit(0);
        }

    }

}
